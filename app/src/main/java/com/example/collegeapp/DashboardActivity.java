package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {
AppCompatButton b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        b1=(AppCompatButton) findViewById(R.id.addstud);
        b2=(AppCompatButton) findViewById(R.id.addfaculty);
        b3=(AppCompatButton) findViewById(R.id.studsearch);
        b4=(AppCompatButton) findViewById(R.id.searchfacu);
        b5=(AppCompatButton) findViewById(R.id.viewweb);
        b6=(AppCompatButton) findViewById(R.id.logout);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),AddStudent.class);
               startActivity(i);
           }
       });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),AddFaculty.class);
               startActivity(i);
           }
       });
       b3.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),SearchStudent.class);
               startActivity(i);
           }
       });
       b4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),SearchFaculty.class);
               startActivity(i);
           }
       });
       b5.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),ViewWebsite.class);
               startActivity(i);
           }
       });
       b6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(getApplicationContext(),MainActivity.class);
               startActivity(i);
           }
       });

    }
}