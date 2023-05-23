package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android .content.Intent;
import android.view.View;


public class bowshar extends AppCompatActivity {
 Button PREVIOUS_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowshar);
        PREVIOUS_btn= findViewById(R.id.button122);
        PREVIOUS_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), areas.class);
                startActivity(i);
            }
        });
    }
}