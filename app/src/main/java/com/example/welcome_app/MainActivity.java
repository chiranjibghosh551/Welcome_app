package com.example.welcome_app;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    // creating variables for our edit text and buttons.
    public EditText userNameEdt, dobEdt,emailEdt;
    public DatePickerDialog picker;
    public Button registerBtn,viewBtn;
    DBlite DB;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing our edit text and buttons.
        userNameEdt = findViewById(R.id.name);
        emailEdt = findViewById(R.id.email);
        dobEdt = findViewById(R.id.dob);
        registerBtn = findViewById(R.id.idBtnRegister);
        viewBtn = findViewById(R.id.idBtnView);
        DB = new DBlite(this);


        // adding on click listener for our button.
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // on below line we are getting data from our edit text.
                /*String userName = userNameEdt.getText().toString();
                String emailName = emailEdt.getText().toString();
                String dateOfBirth = dobEdt.getText().toString();

                // checking if the entered text is empty or not.
                Boolean checkinsertdata = DB.insertview(userName,emailName,dateOfBirth);
                if(checkinsertdata == true)
                {
                    Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
                }*/
                Intent i = new Intent(MainActivity.this,);
                startActivity(i);
            }

        });

       /*registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getdata();
                if(res.getCount()==0)
                {
                    Toast.makeText(MainActivity.this,"",Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext())
                {
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("Email :"+res.getString(1)+"\n");
                    buffer.append("Dob :"+res.getString(2)+"\n");
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setCancelable(true);
                builder.setTitle("User Entities");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });*/
       viewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ViewData.class);
                startActivity(intent);
            }
        });
    }

}
