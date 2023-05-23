package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android .content.Intent;
import android.view.View;


public class areas extends AppCompatActivity {
Button Muscat_btn,Bowshar_btn,ALSEEB_btn,Muttrah_btn,ALAmerat_btn,Quriyat_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        Muscat_btn= findViewById(R.id.button6);
        Muscat_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), muscat.class);
                startActivity(i);
            }
        });


        Bowshar_btn= findViewById(R.id.button3);
        Bowshar_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), bowshar.class);
                startActivity(i);
            }
        });

        ALSEEB_btn= findViewById(R.id.button5);
        ALSEEB_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), alseeb.class);
                startActivity(i);
            }
        });


        Muttrah_btn= findViewById(R.id.button8);
        Muttrah_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), muttrah.class);
                startActivity(i);
            }
        });


        ALAmerat_btn= findViewById(R.id.button9);
        ALAmerat_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), alamerat.class);
                startActivity(i);
            }
        });


        Quriyat_btn= findViewById(R.id.button10);
        Quriyat_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), quriyat.class);
                startActivity(i);
            }
        });
    }
}