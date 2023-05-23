package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android .content.Intent;
import android.view.View;


public class login extends AppCompatActivity {
    Button login_btn , register_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register_btn= findViewById(R.id.button);
        register_btn.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), register.class);
                startActivity(i);
            }
        });

        login_btn= findViewById(R.id.button2);
        login_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}