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
               arrayList.add(new Country("Germany", R.drawable.de_3x));
                arrayList.add(new Country("Finland",R.drawable.fi_3x));
                arrayList.add(new Country("France",R.drawable.fr_3x));
                arrayList.add(new Country("Great Britain",R.drawable.gb_3x));
                arrayList.add(new Country("Kazakhstan",R.drawable.kz_2x));
                break;
            case 2:
                arrayList.add(new Country("Kyrgyzstan", R.drawable.kg_2x));
                arrayList.add(new Country("Kazakhstan",R.drawable.kz_2x));
                arrayList.add(new Country("South Korea",R.drawable.kr_2x));
                arrayList.add(new Country("Saudi Arabia",R.drawable.sa_2x));
                arrayList.add(new Country("Unated Arab Emirates",R.drawable.kw_2x));
                break;
            case 3:
                arrayList.add(new Country("Saudi Arabia",R.drawable.sa_2x));
                arrayList.add(new Country("Unated Arab Emirates",R.drawable.kw_2x));
                arrayList.add(new Country("Congo",R.drawable.ke_2x));
                arrayList.add(new Country("Sudan",R.drawable.cd_3x));
                arrayList.add(new Country("Kenya",R.drawable.cm_3x));
                break;
            case 4:
                arrayList.add(new Country("USA",R.drawable.us_3x));
                arrayList.add(new Country("Canada",R.drawable.ca_3x));
                arrayList.add(new Country("Alaska",R.drawable.us_3x));
                arrayList.add(new Country("Venesuala",R.drawable.ve_3x));
                arrayList.add(new Country("Cuba",R.drawable.ws_3x));
                break;
            case 5:
                arrayList.add(new Country("Venesuala",R.drawable.ve_3x));
                arrayList.add(new Country("Cuba",R.drawable.ws_3x));
                arrayList.add(new Country("Dominikano",R.drawable.vn_3x));
                arrayList.add(new Country("St.Icland",R.drawable.st_3x));
                arrayList.add(new Country("Mexico",R.drawable.cm_3x));
                break;

        }
    }

    @Override
    public void onClick(Country country) {

    }
}