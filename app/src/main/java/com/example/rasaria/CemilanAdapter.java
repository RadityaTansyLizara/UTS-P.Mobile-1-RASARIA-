package com.example.rasaria;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CemilanAdapter extends RecyclerView.Adapter<CemilanAdapter.ViewHolder> {

    private List<Cemilan> cemilanList;
    private Context context;

    public CemilanAdapter(List<Cemilan> cemilanList, Context context) {
        this.cemilanList = cemilanList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cemilan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Cemilan cemilan = cemilanList.get(position);
        holder.itemText.setText(cemilan.getName());
        holder.itemImage.setImageResource(cemilan.getImageResId());

        holder.itemView.setOnClickListener(v -> {
            // Implementasi onClick untuk setiap item
            if (cemilan.getName().equals("Kue Pancake")) {
                Intent intent = new Intent(context, KuePancakeActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Cimol")) {
                Intent intent = new Intent(context, CimolActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Tahu Crispy")) {
                Intent intent = new Intent(context, TahuCrispyActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Kolak Ubi")) {
                Intent intent = new Intent(context, KolakUbiActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Kue Talam")) {
                Intent intent = new Intent(context, KueTalamActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Bolu Kukus")) {
                Intent intent = new Intent(context, BoluActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Tahu Gejrot")) {
                Intent intent = new Intent(context, TahuGejrotActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Piscok")) {
                Intent intent = new Intent(context, PiscokActivity.class);
                context.startActivity(intent);
            }  else if (cemilan.getName().equals("Smoothies Buah Naga")) {
                Intent intent = new Intent(context, NagaActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Jamu Kunyit Asam")) {
                Intent intent = new Intent(context, JamuActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Wedang Jahe Susu")) {
                Intent intent = new Intent(context, JaheActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Sop Buah")) {
                Intent intent = new Intent(context, SopbuahActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Es Goyobod")) {
                Intent intent = new Intent(context, GoyobodActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Es Cendol Durian")) {
                Intent intent = new Intent(context, CendolActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Es Selendang Mayang")) {
                Intent intent = new Intent(context, SelendangActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Es Pisang Ijo")) {
                Intent intent = new Intent(context, PisangActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Pasta Agliolio")) {
                Intent intent = new Intent(context, SpagetiActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Mapo Tofu")) {
                Intent intent = new Intent(context, RamenActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Kebab")) {
                Intent intent = new Intent(context, KebabActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Rum Balls")) {
                Intent intent = new Intent(context, RamenActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("French Toast")) {
                Intent intent = new Intent(context, RotiActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Macaroni and Cheese")) {
                Intent intent = new Intent(context, MakaroniActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Omurice")) {
                Intent intent = new Intent(context, TelurActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Jjapaguri")) {
                Intent intent = new Intent(context, DagingActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Sate Maranggi")) {
                Intent intent = new Intent(context, SateActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Ayam Taliwang")) {
                Intent intent = new Intent(context, AyamActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Sayur Asem")) {
                Intent intent = new Intent(context, AsemActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Gudeg")) {
                Intent intent = new Intent(context, NangkaActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Laksa")) {
                Intent intent = new Intent(context, TogeActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Pempek")) {
                Intent intent = new Intent(context, PempeActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Rendang")) {
                Intent intent = new Intent(context, RendangActivity.class);
                context.startActivity(intent);
            } else if (cemilan.getName().equals("Ketoprak")) {
                Intent intent = new Intent(context, KetoprakActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return cemilanList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemText;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.item_image);
            itemText = itemView.findViewById(R.id.item_text);
        }
    }
}

