package com.example.rasaria;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class PepesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pepes);

        // Kue Pancake
        ImageView kuePancake = findViewById(R.id.sate);
        kuePancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PepesActivity.this, SateActivity.class);
                startActivity(intent);
            }
        });

        // Cimol
        ImageView cimol = findViewById(R.id.ayam);
        cimol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PepesActivity.this, AyamActivity.class);
                startActivity(intent);
            }
        });

        // Tahu Crispy
        ImageView tahuCrispy = findViewById(R.id.asem);
        tahuCrispy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PepesActivity.this, AsemActivity.class);
                startActivity(intent);
            }
        });

        // Kolak Ubi
        ImageView kolakUbi = findViewById(R.id.nangka);
        kolakUbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PepesActivity.this, NangkaActivity.class);
                startActivity(intent);
            }
        });

        // Kue Talam
        ImageView kueTalam = findViewById(R.id.toge);
        kueTalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PepesActivity.this, TogeActivity.class);
                startActivity(intent);
            }
        });

        // Bolu Kukus Pandan
        ImageView boluKukusPandan = findViewById(R.id.pempe);
        boluKukusPandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PepesActivity.this, PempeActivity.class);
                startActivity(intent);
            }
        });

        // Tahu Gejrot
        ImageView tahuGejrot = findViewById(R.id.rendang);
        tahuGejrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PepesActivity.this, RendangActivity.class);
                startActivity(intent);
            }
        });

        // Piscok
        ImageView piscok = findViewById(R.id.ketoprak);
        piscok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PepesActivity.this, KetoprakActivity.class);
                startActivity(intent);
            }
        });

        // Kembali ke MainActivity
        ImageView kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PepesActivity.this, MainActivity.class);
                // Adding flags to clear the activity stack
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();

            }
        });
    }
}
