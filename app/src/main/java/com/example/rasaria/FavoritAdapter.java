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

public class FavoritAdapter extends RecyclerView.Adapter<FavoritAdapter.FavoritViewHolder> {

    private Context context;
    private List<FavoritItem> favoritList;

    public FavoritAdapter(Context context, List<FavoritItem> favoritList) {
        this.context = context;
        this.favoritList = favoritList;
    }

    @Override
    public FavoritViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_favorit, parent, false);
        return new FavoritViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FavoritViewHolder holder, int position) {
        final FavoritItem item = favoritList.get(position);
        holder.imageView.setImageResource(item.getImageResId());
        holder.textView.setText(item.getName());

        // Menangani klik pada gambar item
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (item.getName().equals("Kue Pancake")) {
                    // Arahkan ke KuePancakeActivity
                    Intent intent = new Intent(context, KuePancakeActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Cimol")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, CimolActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Tahu Crispy")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, TahuCrispyActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Kolak Ubi")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, KolakUbiActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Kue Talam")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, KueTalamActivity.class);
                    context.startActivity(intent);
                }
                else if (item.getName().equals("Bolu Kukus")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, BoluActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Tahu Gejrot")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, TahuGejrotActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Piscok")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, PiscokActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Smoothies Buah Naga")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, NagaActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Jamu Kunyit Asam")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, JamuActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Wedang Jahe Susu")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, JaheActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Sop Buah")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, SopbuahActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Es Goyobod")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, GoyobodActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Es Cendol Durian")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, CendolActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Es Selendang Mayang")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, SelendangActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Es Pisang Ijo")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, PisangActivity.class);
                    context.startActivity(intent);
                }
                else if (item.getName().equals("Pasta Agliolio")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, SpagetiActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Mapo Tofu")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, RamenActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Kebab")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, KebabActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Rum Balls")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, OndeActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("French Toast")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, RotiActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Macaroni and Cheese")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, MakaroniActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Omurice")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, TelurActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Jjapaguri")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, DagingActivity.class);
                    context.startActivity(intent);
                }
                else if (item.getName().equals("Sate Maranggi")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, SateActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Ayam Taliwang")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, AyamActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Sayur Asem")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, AsemActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Gudeg")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, NangkaActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Laksa")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, TogeActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Pempek")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, PempeActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Rendang")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, RendangActivity.class);
                    context.startActivity(intent);
                } else if (item.getName().equals("Ketoprak")) {
                    // Arahkan ke CimolActivity
                    Intent intent = new Intent(context, KetoprakActivity.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return favoritList.size();
    }
    public static class FavoritViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public FavoritViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewItem);
            textView = itemView.findViewById(R.id.textViewItem);
        }
    }
}
