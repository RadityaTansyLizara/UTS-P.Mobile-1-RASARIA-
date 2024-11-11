package com.example.rasaria;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class MinumanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        // Kue Pancake
        ImageView kuePancake = findViewById(R.id.naga);
        kuePancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinumanActivity.this, NagaActivity.class);
                startActivity(intent);
            }
        });

        // Cimol
        ImageView cimol = findViewById(R.id.jamu);
        cimol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinumanActivity.this, JamuActivity.class);
                startActivity(intent);
            }
        });

        // Tahu Crispy
        ImageView tahuCrispy = findViewById(R.id.jahe);
        tahuCrispy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinumanActivity.this, JaheActivity.class);
                startActivity(intent);
            }
        });

        // Kolak Ubi
        ImageView kolakUbi = findViewById(R.id.sopbuah);
        kolakUbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinumanActivity.this, SopbuahActivity.class);
                startActivity(intent);
            }
        });

        // Kue Talam
        ImageView kueTalam = findViewById(R.id.esgoyobod);
        kueTalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinumanActivity.this, GoyobodActivity.class);
                startActivity(intent);
            }
        });

        // Bolu Kukus Pandan
        ImageView boluKukusPandan = findViewById(R.id.durian);
        boluKukusPandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinumanActivity.this, CendolActivity.class);
                startActivity(intent);
            }
        });

        // Tahu Gejrot
        ImageView tahuGejrot = findViewById(R.id.selendang);
        tahuGejrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinumanActivity.this, SelendangActivity.class);
                startActivity(intent);
            }
        });

        // Piscok
        ImageView piscok = findViewById(R.id.pisang);
        piscok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinumanActivity.this, PisangActivity.class);
                startActivity(intent);
            }
        });

        // Kembali ke MainActivity
        ImageView kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MinumanActivity.this, MainActivity.class);
                // Adding flags to clear the activity stack
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();

            }
        });
    }
}
