package com.example.rasaria;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SimpanFragment extends Fragment {

    private RecyclerView recyclerViewFavorit;
    private FavoritAdapter favoritAdapter;
    private List<FavoritItem> favoritList;

    public SimpanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simpan, container, false);

        recyclerViewFavorit = view.findViewById(R.id.recyclerViewFavorit);
        recyclerViewFavorit.setLayoutManager(new GridLayoutManager(getContext(), 2));

        // Inisialisasi data favorit
        favoritList = new ArrayList<>();

        // Ambil SharedPreferences
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences("FavoritPrefs", getContext().MODE_PRIVATE);

        // Cek apakah "Cimol" disimpan di SharedPreferences
        boolean isCimolFavorit = sharedPreferences.getBoolean("isCimolFavorit", false);
        if (isCimolFavorit) {
            favoritList.add(new FavoritItem(R.drawable.cimol, "Cimol"));
        }

        // Cek apakah "Kue Pancake" disimpan di SharedPreferences
        boolean isKuePancakeFavorit = sharedPreferences.getBoolean("isKuePancakeFavorit", false);
        if (isKuePancakeFavorit) {
            favoritList.add(new FavoritItem(R.drawable.pancake, "Kue Pancake"));
        }

        // Cek apakah "Tahu Crispy" disimpan di SharedPreferences
        boolean isTahuCrispyFavorit = sharedPreferences.getBoolean("isTahuCrispyFavorit", false);
        if (isTahuCrispyFavorit) {
            favoritList.add(new FavoritItem(R.drawable.tahu, "Tahu Crispy"));
        }

        // Cek apakah "Tahu Crispy" disimpan di SharedPreferences
        boolean isKolakUbiFavorit = sharedPreferences.getBoolean("isKolakUbiFavorit", false);
        if (isKolakUbiFavorit) {
            favoritList.add(new FavoritItem(R.drawable.kolekubi, "Kolak Ubi"));
        }

        boolean isKueTalamFavorit = sharedPreferences.getBoolean("isKueTalamFavorit", false);
        if (isKueTalamFavorit) {
            favoritList.add(new FavoritItem(R.drawable.kuetalam, "Kue Talam"));
        }

        boolean isBoluFavorit = sharedPreferences.getBoolean("isBoluFavorit", false);
        if (isBoluFavorit) {
            favoritList.add(new FavoritItem(R.drawable.bolu, "Bolu Kukus"));
        }

        boolean isTahuGejrotFavorit = sharedPreferences.getBoolean("isTahuGejrotFavorit", false);
        if (isTahuGejrotFavorit) {
            favoritList.add(new FavoritItem(R.drawable.gejrot, "Tahu Gejrot"));
        }

        boolean isPiscokFavorit = sharedPreferences.getBoolean("isPiscokFavorit", false);
        if (isPiscokFavorit) {
            favoritList.add(new FavoritItem(R.drawable.piscok, "Piscok"));
        }

        boolean isNagaFavorit = sharedPreferences.getBoolean("isNagaFavorit", false);
        if (isNagaFavorit) {
            favoritList.add(new FavoritItem(R.drawable.minum, "Smoothies Buah Naga"));
        }

        boolean isJamuFavorit = sharedPreferences.getBoolean("isJamuFavorit", false);
        if (isJamuFavorit) {
            favoritList.add(new FavoritItem(R.drawable.jamu, "Jamu Kunyit Asam"));
        }

        boolean isJaheFavorit = sharedPreferences.getBoolean("isJaheFavorit", false);
        if (isJaheFavorit) {
            favoritList.add(new FavoritItem(R.drawable.jahe, "Wedang Jahe Susu"));
        }

        boolean isSopBuahFavorit = sharedPreferences.getBoolean("isSopBuahFavorit", false);
        if (isSopBuahFavorit) {
            favoritList.add(new FavoritItem(R.drawable.sopbuah, "Sop Buah"));
        }

        boolean isGoyobodFavorit = sharedPreferences.getBoolean("isGoyobodFavorit", false);
        if (isGoyobodFavorit) {
            favoritList.add(new FavoritItem(R.drawable.goyobod, "Es Goyobod"));
        }

        boolean isCendolFavorit = sharedPreferences.getBoolean("isCendolFavorit", false);
        if (isCendolFavorit) {
            favoritList.add(new FavoritItem(R.drawable.durian, "Es Cendol Durian"));
        }

        boolean isSelendangFavorit = sharedPreferences.getBoolean("isSelendangFavorit", false);
        if (isSelendangFavorit) {
            favoritList.add(new FavoritItem(R.drawable.selendang, "Es Selendang Mayang"));
        }

        boolean isPisangFavorit = sharedPreferences.getBoolean("isPisangFavorit", false);
        if (isPisangFavorit) {
            favoritList.add(new FavoritItem(R.drawable.espisang, "Es Pisang Ijo"));
        }

        boolean isSpagetiFavorit = sharedPreferences.getBoolean("isSpagetiFavorit", false);
        if (isSpagetiFavorit) {
            favoritList.add(new FavoritItem(R.drawable.spageti, "Pasta Agliolio"));
        }

        boolean isRamenFavorit = sharedPreferences.getBoolean("isRamenFavorit", false);
        if (isRamenFavorit) {
            favoritList.add(new FavoritItem(R.drawable.ramen, "Mapo Tofu"));
        }

        boolean isKebabFavorit = sharedPreferences.getBoolean("isKebabFavorit", false);
        if (isKebabFavorit) {
            favoritList.add(new FavoritItem(R.drawable.kebab, "Kebab"));
        }

        boolean isOndeFavorit = sharedPreferences.getBoolean("isOndeFavorit", false);
        if (isOndeFavorit) {
            favoritList.add(new FavoritItem(R.drawable.onde, "Rum Balls"));
        }

        boolean isRotiFavorit = sharedPreferences.getBoolean("isRotiFavorit", false);
        if (isRotiFavorit) {
            favoritList.add(new FavoritItem(R.drawable.roti, "French Toast"));
        }

        boolean isMacaroniFavorit = sharedPreferences.getBoolean("isMacaroniFavorit", false);
        if (isMacaroniFavorit) {
            favoritList.add(new FavoritItem(R.drawable.makaroni, "Macaroni and Cheese"));
        }

        boolean isTelurFavorit = sharedPreferences.getBoolean("isTelurFavorit", false);
        if (isTelurFavorit) {
            favoritList.add(new FavoritItem(R.drawable.telur, "Omurice"));
        }

        boolean isDagingFavorit = sharedPreferences.getBoolean("isDagingFavorit", false);
        if (isDagingFavorit) {
            favoritList.add(new FavoritItem(R.drawable.daging, "Jjapaguri"));
        }

        boolean isSateFavorit = sharedPreferences.getBoolean("isSateFavorit", false);
        if (isSateFavorit) {
            favoritList.add(new FavoritItem(R.drawable.sate, "Sate Maranggi"));
        }

        boolean isAyamFavorit = sharedPreferences.getBoolean("isAyamFavorit", false);
        if (isAyamFavorit) {
            favoritList.add(new FavoritItem(R.drawable.ayam, "Ayam Taliwang"));
        }

        boolean isAsemFavorit = sharedPreferences.getBoolean("isAsemFavorit", false);
        if (isAsemFavorit) {
            favoritList.add(new FavoritItem(R.drawable.asem, "Sayur Asem"));
        }

        boolean isNangkaFavorit = sharedPreferences.getBoolean("isNangkaFavorit", false);
        if (isNangkaFavorit) {
            favoritList.add(new FavoritItem(R.drawable.nangka, "Gudeg"));
        }

        boolean isTogeFavorit = sharedPreferences.getBoolean("isTogeFavorit", false);
        if (isTogeFavorit) {
            favoritList.add(new FavoritItem(R.drawable.toge, "Laksa"));
        }

        boolean isPempekFavorit = sharedPreferences.getBoolean("isPempekFavorit", false);
        if (isPempekFavorit) {
            favoritList.add(new FavoritItem(R.drawable.pempe, "Pempek"));
        }

        boolean isRendangFavorit = sharedPreferences.getBoolean("isRendangFavorit", false);
        if (isRendangFavorit) {
            favoritList.add(new FavoritItem(R.drawable.rendang, "Rendang"));
        }

        boolean isKetoprakFavorit = sharedPreferences.getBoolean("isKetoprakFavorit", false);
        if (isKetoprakFavorit) {
            favoritList.add(new FavoritItem(R.drawable.ketoprak, "Ketoprak"));
        }

        favoritAdapter = new FavoritAdapter(getContext(), favoritList);
        recyclerViewFavorit.setAdapter(favoritAdapter);

        return view;
    }
}


