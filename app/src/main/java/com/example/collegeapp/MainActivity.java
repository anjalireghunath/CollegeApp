package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
AppCompatButton b1,b2;
String getEmail,getPassword,prefvalue;
SharedPreferences mypreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mypreferences=getSharedPreferences("Login",MODE_PRIVATE);
        ed1=(EditText) findViewById(R.id.email);
        ed2=(EditText) findViewById(R.id.password);
        b1=(AppCompatButton) findViewById(R.id.login);
        b2=(AppCompatButton) findViewById(R.id.gotologin);
        prefvalue=mypreferences.getString("email",null);
        if(prefvalue!=null){
            Intent i=new Intent(getApplicationContext(),DashboardActivity.class);
            startActivity(i);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEmail=ed1.getText().toString();
                getPassword=ed2.getText().toString();
                if(getEmail.equals("admin@gmail.com")&&(getPassword.equals("12345"))) {
                    SharedPreferences.Editor myEdit=mypreferences.edit();
                    myEdit.putString("email",getEmail);
                    myEdit.commit();
                    Intent i = new Intent(getApplicationContext(), DashboardActivity.class);
                    startActivity(i);

                }
                else
                {
                    Toast.makeText(getApplicationContext(), "invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
              startActivity(i);
            }
        });
    }
}