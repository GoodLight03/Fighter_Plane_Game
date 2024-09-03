package com.example.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HighScore extends Activity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Score");

    ListView listScore;
    private TextView back;
    //private Button bonus;

    //ArrayList<MedalUser> mang = new ArrayList<>();
    ArrayList<String> mang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.high_score);
        Anhxa();
        back = findViewById(R.id.back_btn);
//        bonus = findViewById(R.id.btnBonus);
//        bonus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openSearchDialog();
//            }
//        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HighScore.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Cấu hình listview
        //final ArrayList<String> mang = new ArrayList<>();
        mang = new ArrayList<>();

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                mang);
        listScore.setAdapter(adapter);

        // Bắt sự kiện
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear(); // Clear the old list before updating

                ArrayList<String> tempList = new ArrayList<>(); // Temporary list for sorting
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String name = snapshot.child("name").getValue().toString();
                        String score = snapshot.child("score").getValue().toString();
                        String item = name + " - " + score;
                        tempList.add(item);
                    }
                }

                // Sort the temporary list based on scores
                Collections.sort(tempList, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        int score1 = Integer.parseInt(s1.split(" - ")[1].trim());
                        int score2 = Integer.parseInt(s2.split(" - ")[1].trim());
                        return Integer.compare(score2, score1);
                    }
                });


//                for (int i = 0; i < tempList.size(); i++) {
//                    String item = (i + 1) + ": " + tempList.get(i);
//                    mang.add(item);
//                }

                int count = Math.min(tempList.size(), 3);

                for (int i = 0; i < count; i++) {
                    String item = (i + 1) + ". " + tempList.get(i);
                    mang.add(item);
                }

                displayUserListWithMedalsSC(mang);

                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });


    }

    private void displayUserListWithMedalsSC(List<String> userList) {
        ListView listView = findViewById(R.id.listView);
        CustomScorer adapter = new CustomScorer(this, userList);
        listView.setAdapter(adapter);
    }

    public void Anhxa() {
        listScore = findViewById(R.id.listView);
    }

    private void showTop3PlayersWithLowestScore() {
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                mang.clear();
                ArrayList<String> tempList = new ArrayList<>(); // Danh sách tạm thời để lưu top 5

                // Thêm tất cả người chơi vào danh sách tạm thời
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    if (snapshot.hasChild("name") && snapshot.hasChild("score")) {
                        String name = snapshot.child("name").getValue().toString();
                        String score = snapshot.child("score").getValue().toString();
                        String item = name + " : " + score;
                        tempList.add(item);
                    }
                }

                // Sắp xếp danh sách tạm thời theo điểm tăng dần
                Collections.sort(tempList, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        int score1 = Integer.parseInt(s1.split(" : ")[1].trim());
                        int score2 = Integer.parseInt(s2.split(" : ")[1].trim());
                        return Integer.compare(score1, score2);
                    }
                });

                // Hiển thị chỉ top 5 người chơi
                int count = Math.min(tempList.size(), 3);
                for (int i = 0; i < count; i++) {
                    String item = (i + 1) + ". " + tempList.get(i);
                    mang.add(item);
                }

                // Cập nhật danh sách hiển thị
                //updateListView(mang);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // Xử lý khi có lỗi
            }
        });
    }



    private void displayUserListWithMedals(List<MedalUser> userList) {
        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, userList);
        listView.setAdapter(adapter);
    }



    private void showDialogWithInfo(String item) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Thông tin");
        builder.setMessage(item);
        builder.setPositiveButton("Đóng", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }

    // Mở dialog tìm kiếm
    private void openSearchDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Tìm kiếm");

        // Layout cho dialog
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        // EditText để nhập thông tin tìm kiếm
        final EditText searchEditText = new EditText(this);
        layout.addView(searchEditText);

        builder.setView(layout);

        builder.setPositiveButton("Tìm kiếm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String searchQuery = searchEditText.getText().toString();

                // Thực hiện tìm kiếm và cập nhật dữ liệu trên ListView
                performSearchAndUpdateListView(searchQuery);
            }
        });

        builder.setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    private void performSearchAndUpdateListView(String searchQuery) {
        // Thực hiện tìm kiếm và lấy danh sách kết quả tương ứng
        List<String> searchResults = performSearch(searchQuery);

        // Cập nhật ListView với danh sách kết quả
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, searchResults);
        listScore.setAdapter(adapter);
    }

    private List<String> performSearch(String searchQuery){
        List<String> searchResults = new ArrayList<>();

        for (String ittem : mang) {
            if (ittem.contains(searchQuery)) {
                searchResults.add(ittem);
            }
        }

        return searchResults;

    }

}
