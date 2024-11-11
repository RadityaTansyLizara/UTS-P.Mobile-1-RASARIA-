package com.example.rasaria;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CemilanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cemilan);

        // Kue Pancake
        ImageView kuePancake = findViewById(R.id.kue_pancake);
        kuePancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CemilanActivity.this, KuePancakeActivity.class);
                startActivity(intent);
            }
        });

        // Cimol
        ImageView cimol = findViewById(R.id.cimol);
        cimol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CemilanActivity.this, CimolActivity.class);
                startActivity(intent);
            }
        });

        // Tahu Crispy
        ImageView tahuCrispy = findViewById(R.id.tahu_crispy);
        tahuCrispy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CemilanActivity.this, TahuCrispyActivity.class);
                startActivity(intent);
            }
        });

        // Kolak Ubi
        ImageView kolakUbi = findViewById(R.id.kolak_ubi);
        kolakUbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CemilanActivity.this, KolakUbiActivity.class);
                startActivity(intent);
            }
        });

        // Kue Talam
        ImageView kueTalam = findViewById(R.id.kue_talam);
        kueTalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CemilanActivity.this, KueTalamActivity.class);
                startActivity(intent);
            }
        });

        // Bolu Kukus Pandan
        ImageView boluKukusPandan = findViewById(R.id.bolu_kukus);
        boluKukusPandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CemilanActivity.this, BoluActivity.class);
                startActivity(intent);
            }
        });

        // Tahu Gejrot
        ImageView tahuGejrot = findViewById(R.id.tahu_gejrot);
        tahuGejrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CemilanActivity.this, TahuGejrotActivity.class);
                startActivity(intent);
            }
        });

        // Piscok
        ImageView piscok = findViewById(R.id.piscok);
        piscok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CemilanActivity.this, PiscokActivity.class);
                startActivity(intent);
            }
        });

        // Kembali ke MainActivity
        ImageView kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CemilanActivity.this, MainActivity.class);
                // Adding flags to clear the activity stack
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();

            }
        });
    }
}
