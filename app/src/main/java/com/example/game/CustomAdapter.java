package com.example.game;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<MedalUser> {

    private Context context;
    private List<MedalUser> data;
    private int[] imageResources;
    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    public CustomAdapter(Context context, List<MedalUser> data) {
        super(context, R.layout.list_item_layout, data);
        this.context = context;
        this.data = data;
        this.imageResources = imageResources;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();

        //ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.textViewmedal);

        //int imageResource = imageResources[position];
        MedalUser item = getItem(position);

        textView.setText(item.getName());
        //imageView.setImageResource(item.getImageResource());

        if(item.getId().equals(firebaseUser.getUid())){
            textView.setTextColor(Color.RED);
        }

        return convertView;
    }
}