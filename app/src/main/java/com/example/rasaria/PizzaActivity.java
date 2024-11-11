package com.example.rasaria;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        // Kue Pancake
        ImageView kuePancake = findViewById(R.id.spageti);
        kuePancake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, SpagetiActivity.class);
                startActivity(intent);
            }
        });

        // Cimol
        ImageView cimol = findViewById(R.id.ramenn);
        cimol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, RamenActivity.class);
                startActivity(intent);
            }
        });

        // Tahu Crispy
        ImageView tahuCrispy = findViewById(R.id.kebab);
        tahuCrispy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, KebabActivity.class);
                startActivity(intent);
            }
        });

        // Kolak Ubi
        ImageView kolakUbi = findViewById(R.id.onde);
        kolakUbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, OndeActivity.class);
                startActivity(intent);
            }
        });

        // Kue Talam
        ImageView kueTalam = findViewById(R.id.roti);
        kueTalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, RotiActivity.class);
                startActivity(intent);
            }
        });

        // Bolu Kukus Pandan
        ImageView boluKukusPandan = findViewById(R.id.makaroni);
        boluKukusPandan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, MakaroniActivity.class);
                startActivity(intent);
            }
        });

        // Tahu Gejrot
        ImageView tahuGejrot = findViewById(R.id.telur);
        tahuGejrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, TelurActivity.class);
                startActivity(intent);
            }
        });

        // Piscok
        ImageView piscok = findViewById(R.id.daging);
        piscok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, DagingActivity.class);
                startActivity(intent);
            }
        });

        // Kembali ke MainActivity
        ImageView kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, MainActivity.class);
                // Adding flags to clear the activity stack
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();

            }
        });
    }
}
