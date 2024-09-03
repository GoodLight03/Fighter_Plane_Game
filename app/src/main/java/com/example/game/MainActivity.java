package com.example.game;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;

public class MainActivity extends Activity {

    private Button highscore, user, play, bonus;
    private boolean isMute;

    private TextView score,username;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("Score");


    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        highscore = findViewById(R.id.highScore);
        user = findViewById(R.id.userProfile);
        play = findViewById(R.id.play);
        score=findViewById(R.id.textViewscore);
        username=findViewById(R.id.ussername);
        bonus=findViewById(R.id.shop);

        final SharedPreferences prefs = getSharedPreferences("game", MODE_PRIVATE);
        isMute = prefs.getBoolean("isMute", false);

        //final SharedPreferences prefss = getSharedPreferences("targets", MODE_PRIVATE);
        //isMute = prefs.getBoolean("isMute", false);
        //final SharedPreferences prefsss = getSharedPreferences("Thuong", MODE_PRIVATE);

        final ImageView volumeCtrl = findViewById(R.id.volumeCtrl);

        if (isMute)
            volumeCtrl.setImageResource(R.drawable.ic_volume_off_black_24dp);
        else
            volumeCtrl.setImageResource(R.drawable.ic_volume_up_black_24dp);

        volumeCtrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                isMute = !isMute;
                if (isMute)
                    volumeCtrl.setImageResource(R.drawable.ic_volume_off_black_24dp);
                else
                    volumeCtrl.setImageResource(R.drawable.ic_volume_up_black_24dp);


            }
        });

        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();


        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                if(snapshot.exists()){
                    for (DataSnapshot snapshott : snapshot.getChildren()) {
                        //Score scorer = snapshott.getValue(Score.class);
                        ScoreUser usersc = snapshott.getValue(ScoreUser.class);
                        if(usersc.idus.equals(firebaseUser.getUid())){
                            username.setText(usersc.name+"");
                            score.setText(""+usersc.score);

                            break;
                        }
                        else{

                        }
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        highscore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HighScore.class);
                startActivity(intent);
            }
        });



        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, User.class);
                startActivity(intent);
            }
        });


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, GameActivity.class));
            }
        });

        bonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Bonus.class));
            }
        });
    }


}