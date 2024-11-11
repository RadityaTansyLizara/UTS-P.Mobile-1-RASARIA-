package com.example.rasaria;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CemilanRecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cemilan_recyclerview);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_cemilan);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Terima query dari intent
        String query = getIntent().getStringExtra("QUERY").toLowerCase();

        List<Cemilan> cemilanList = new ArrayList<>();
        // Daftar cemilan awal
        cemilanList.add(new Cemilan("Kue Pancake", R.drawable.pancake));
        cemilanList.add(new Cemilan("Cimol", R.drawable.cimol));
        cemilanList.add(new Cemilan("Tahu Crispy", R.drawable.tahu));
        cemilanList.add(new Cemilan("Kolak Ubi", R.drawable.kolekubi));
        cemilanList.add(new Cemilan("Kue Talam", R.drawable.kuetalam));
        cemilanList.add(new Cemilan("Bolu Kukus", R.drawable.bolu));
        cemilanList.add(new Cemilan("Tahu Gejrot", R.drawable.gejrot));
        cemilanList.add(new Cemilan("Piscok", R.drawable.piscok));
        cemilanList.add(new Cemilan("Smoothies Buah Naga", R.drawable.minum));
        cemilanList.add(new Cemilan("Jamu Kunyit Asam", R.drawable.jamu));
        cemilanList.add(new Cemilan("Wedang Jahe Susu", R.drawable.jahe));
        cemilanList.add(new Cemilan("Sop Buah", R.drawable.sopbuah));
        cemilanList.add(new Cemilan("Es Goyobod", R.drawable.goyobod));
        cemilanList.add(new Cemilan("Es Cendol Durian", R.drawable.durian));
        cemilanList.add(new Cemilan("Es Selendang Mayang", R.drawable.selendang));
        cemilanList.add(new Cemilan("Es Pisang Ijo", R.drawable.espisang));
        cemilanList.add(new Cemilan("Pasta Agliolio", R.drawable.spageti));
        cemilanList.add(new Cemilan("Mapo Tofu", R.drawable.ramen));
        cemilanList.add(new Cemilan("Kebab", R.drawable.kebab));
        cemilanList.add(new Cemilan("Rum Balls", R.drawable.onde));
        cemilanList.add(new Cemilan("French Toast", R.drawable.roti));
        cemilanList.add(new Cemilan("Macaroni and Cheese", R.drawable.makaroni));
        cemilanList.add(new Cemilan("Omurice", R.drawable.telur));
        cemilanList.add(new Cemilan("Jjapaguri", R.drawable.daging));
        cemilanList.add(new Cemilan("Sate Maranggi", R.drawable.sate));
        cemilanList.add(new Cemilan("Ayam Taliwang", R.drawable.ayam));
        cemilanList.add(new Cemilan("Sayur Asem", R.drawable.asem));
        cemilanList.add(new Cemilan("Gudeg", R.drawable.nangka));
        cemilanList.add(new Cemilan("Laksa", R.drawable.toge));
        cemilanList.add(new Cemilan("Pempek", R.drawable.pempe));
        cemilanList.add(new Cemilan("Rendang", R.drawable.rendang));
        cemilanList.add(new Cemilan("Ketoprak", R.drawable.ketoprak));
        // Tambahkan item lainnya sesuai kebutuhan

        // Filter cemilan berdasarkan pencarian
        List<Cemilan> filteredList = new ArrayList<>();
        for (Cemilan cemilan : cemilanList) {
            if (cemilan.getName().toLowerCase().contains(query)) {
                filteredList.add(cemilan);
            }
        }

        // Set adapter dengan list yang sudah difilter
        CemilanAdapter adapter = new CemilanAdapter(filteredList, this);
        recyclerView.setAdapter(adapter);
    }
}

