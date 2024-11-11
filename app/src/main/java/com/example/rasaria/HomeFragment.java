package com.example.rasaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private EditText searchBar;
    private ImageView searchIcon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // OnClickListener untuk gambar Kolek (Cemilan)
        ImageView kolekImage = view.findViewById(R.id.kolek);
        kolekImage.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), CemilanActivity.class);
            startActivity(intent);
        });

        // OnClickListener untuk gambar Minuman
        ImageView minumanImage = view.findViewById(R.id.minuman);
        minumanImage.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), MinumanActivity.class);
            startActivity(intent);
        });

        // OnClickListener untuk gambar Pizza (Makanan Internasional)
        ImageView pizzaImage = view.findViewById(R.id.pizzahot);
        pizzaImage.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PizzaActivity.class);
            startActivity(intent);
        });

        // OnClickListener untuk gambar Pepes (Makanan Tradisional)
        ImageView pepesImage = view.findViewById(R.id.pepestahu);
        pepesImage.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PepesActivity.class);
            startActivity(intent);
        });

        // Inisialisasi searchBar dan searchIcon
        searchBar = view.findViewById(R.id.searchBar);
        searchIcon = view.findViewById(R.id.searchIcon);

        // Set onClickListener untuk searchIcon
        searchIcon.setOnClickListener(v -> {
            String query = searchBar.getText().toString().toLowerCase();

            // Kirim query pencarian ke CemilanRecyclerViewActivity
            Intent intent = new Intent(getActivity(), CemilanRecyclerViewActivity.class);
            intent.putExtra("QUERY", query);  // Mengirim query ke activity lain
            startActivity(intent);
        });

        return view;
    }
}
