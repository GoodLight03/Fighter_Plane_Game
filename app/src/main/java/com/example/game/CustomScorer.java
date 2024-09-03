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

public class CustomScorer extends ArrayAdapter<String> {
    private Context context;
    private List<String> data;

    public CustomScorer(Context context, List<String> data) {
        super(context, R.layout.list_item_layout, data);
        this.context = context;
        this.data = data;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        TextView textView = convertView.findViewById(R.id.textViewmedal);

        String item=getItem(position);
        textView.setText(item);




        return convertView;
    }
}
