package com.example.home_work_view25;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnClick {
    private ArrayList<Country> arrayList;
    private CountryAdapter country_adapter;
    private RecyclerView recyclerView;
    private static final String KEY = "key";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);
        loadData();
        country_adapter = new CountryAdapter(arrayList, this);
        recyclerView.setAdapter(country_adapter);
    }

    private void loadData() {
        Bundle bundle = getArguments();
        arrayList = new ArrayList<>();
        int info = bundle.getInt(KEY);
        switch (info){
            case 1:
               arrayList.add(new Country("Europe", R.drawable.eu, 1));
                arrayList.add(new Country("Asia",R.drawable.asia,2));
                arrayList.add(new Country("Africa",R.drawable.africa,3));
                arrayList.add(new Country("North America",R.drawable.usa,4));
                arrayList.add(new Country("South America",R.drawable.south_amerika,5));
                break;
            case 2:
                arrayList.add(new Country("Europe", R.drawable.eu, 1));
                arrayList.add(new Country("Asia",R.drawable.asia,2));
                arrayList.add(new Country("Africa",R.drawable.africa,3));
                arrayList.add(new Country("North America",R.drawable.usa,4));
                arrayList.add(new Country("South America",R.drawable.south_amerika,5));
                break;
            case 3:
                arrayList.add(new Country("Europe", R.drawable.eu, 1));
                arrayList.add(new Country("Asia",R.drawable.asia,2));
                arrayList.add(new Country("Africa",R.drawable.africa,3));
                arrayList.add(new Country("North America",R.drawable.usa,4));
                arrayList.add(new Country("South America",R.drawable.south_amerika,5));
                break;

        }
    }

    @Override
    public void onClick(Country country) {

    }
}