package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddStudent extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4;
AppCompatButton b1,b2;
String getStudName,getRollNo,getAdmNo,getCollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);
        ed1=(EditText) findViewById(R.id.stuname);
        ed2=(EditText) findViewById(R.id.rollno);
        ed3=(EditText) findViewById(R.id.admno);
        ed4=(EditText) findViewById(R.id.college);
        b1=(AppCompatButton) findViewById(R.id.submit);
        b2=(AppCompatButton) findViewById(R.id.backtodash);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getStudName=ed1.getText().toString();
                getRollNo=ed2.getText().toString();
                getAdmNo=ed3.getText().toString();
                getCollege=ed4.getText().toString();
                Toast.makeText(getApplicationContext(),getStudName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getRollNo, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getAdmNo, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getCollege, Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
                startActivity(i);
            }
        });
    }
}