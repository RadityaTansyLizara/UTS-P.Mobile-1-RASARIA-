package com.example.rasaria;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class KueTalamActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuetalam);

        ImageView kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KueTalamActivity.this, CemilanActivity.class);
                // Adding flags to clear the activity stack
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        ImageView tombolSimpan = findViewById(R.id.tombol_simpan);
        tombolSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("FavoritPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("isKueTalamFavorit", true);
                editor.apply();

                // Tampilkan Toast dengan pesan konfirmasi
                Toast.makeText(KueTalamActivity.this, "Resep telah disimpan", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
