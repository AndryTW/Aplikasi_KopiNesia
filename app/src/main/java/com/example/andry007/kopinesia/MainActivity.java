package com.example.andry007.kopinesia;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button orkop, lokasi, keluar, filsof, ttg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        orkop = (Button) findViewById(R.id.btn_order);
        orkop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,list_kopi.class);
                startActivity(i);
            }
        });

        lokasi = (Button) findViewById(R.id.btn_lokasi);
        lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(i);
            }
        });

        filsof = (Button) findViewById(R.id.btn_filkop);
        filsof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,filosofi.class);
                startActivity(i);
            }
        });

        ttg = (Button) findViewById(R.id.btn_tentang);
        ttg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,tentang.class);
                startActivity(i);
            }
        });

        keluar = (Button) findViewById(R.id.btnkeluar);
        keluar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

    }
}
