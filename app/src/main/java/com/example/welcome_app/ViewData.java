package com.example.welcome_app;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewData extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        DBlite DB = new DBlite(this);
        TextView textView = findViewById(R.id.textView);

        Cursor cursor = DB.getdata();
        StringBuilder stringBuilder = new StringBuilder();
        while (cursor.moveToNext()){
            stringBuilder.append("Name :"+cursor.getString(0)+"\n");
            stringBuilder.append("Email :"+cursor.getString(1)+"\n");
            stringBuilder.append("Date Of Birth :"+cursor.getString(2)+"\n");
        }
        textView.setText(stringBuilder);
    }
}
