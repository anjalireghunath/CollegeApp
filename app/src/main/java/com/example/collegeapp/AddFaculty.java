package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFaculty extends AppCompatActivity {
EditText ed1,ed2,ed3,ed4,ed5;
AppCompatButton b1,b2;
String getName,getDept,getQuali,getMobileNo,getEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        ed1=(EditText) findViewById(R.id.facname);
        ed2=(EditText) findViewById(R.id.dept);
        ed3=(EditText) findViewById(R.id.quali);
        ed4=(EditText) findViewById(R.id.mob);
        ed5=(EditText) findViewById(R.id.mail);
        b1=(AppCompatButton) findViewById(R.id.sub);
        b2=(AppCompatButton) findViewById(R.id.batodash);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getDept=ed2.getText().toString();
                getQuali=ed3.getText().toString();
                getMobileNo=ed4.getText().toString();
                getEmail=ed5.getText().toString();
                Toast.makeText(getApplicationContext(),getName, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getDept, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getQuali, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getMobileNo, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getEmail, Toast.LENGTH_SHORT).show();
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