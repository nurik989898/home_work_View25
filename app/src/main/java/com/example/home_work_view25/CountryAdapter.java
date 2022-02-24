package com.example.home_work_view25;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.CountryViewHolder> {
    private ArrayList<Country>data;
    public static Context context;
    private OnClick onClick;

    public CountryAdapter(ArrayList<Country> data, OnClick onClick) {
        this.data = data;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_country,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, @SuppressLint("RecyclerView") int position) {
    holder.bind(data.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClick.onClick(data.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class CountryViewHolder extends RecyclerView.ViewHolder{
        private TextView country;
        private ImageView imageView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            country=itemView.findViewById(R.id.textview_countryOne);
            imageView=itemView.findViewById(R.id.image_elementOne);
        }

        public void bind(Country s) {
            country.setText(s.getContinents());
            Glide.with(context).load(s.getImage()).into(imageView);

        }
    }
}
