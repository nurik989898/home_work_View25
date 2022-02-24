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

public class MainFragment extends Fragment implements OnClick {
    private ArrayList<Country> countries;
    private RecyclerView recyclerView;
    private CountryAdapter adapter;
    private static final String KEY = "key";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new CountryAdapter(countries, this);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        countries = new ArrayList<>();
        countries.add(new Country("Europe", R.drawable.eu, 1));
        countries.add(new Country("Asia", R.drawable.asia, 2));
        countries.add(new Country("Africa", R.drawable.africa, 3));
        countries.add(new Country("North America", R.drawable.usa, 4));
        countries.add(new Country("South America", R.drawable.south_amerika, 5));
    }

    @Override
    public void onClick(Country country) {
        Bundle bundle = new Bundle();
        Fragment fragment = new SecondFragment();
        bundle.putInt(KEY, country.getKeyId());
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace
                (R.id.container_main, fragment).addToBackStack(null).commit();

    }
}