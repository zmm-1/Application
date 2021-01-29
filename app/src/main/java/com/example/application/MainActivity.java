package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.al);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                btn.setText("我是大傻逼");
            }
        });
    }
}