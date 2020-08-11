package com.example.latihanpwpb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kedua extends AppCompatActivity {
    Button tombolD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        tombolD = findViewById(R.id.next2);
        tombolD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah();
            }
        });
    }
    protected void pindah(){
        Intent pinda =new Intent(Kedua.this, Ketiga.class);
        startActivity(pinda);
    }
}