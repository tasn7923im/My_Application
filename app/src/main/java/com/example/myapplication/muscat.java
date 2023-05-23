package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android .content.Intent;
import android.view.View;

public class muscat extends AppCompatActivity {
 Button PREVIOUS_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscat);
        PREVIOUS_btn= findViewById(R.id.button111);
        PREVIOUS_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i= new Intent(getApplicationContext(), areas.class);
                startActivity(i);
            }
        });
    }
}