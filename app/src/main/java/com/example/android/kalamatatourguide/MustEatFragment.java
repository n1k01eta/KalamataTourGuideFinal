package com.example.android.kalamatatourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MustEatFragment extends Fragment {


    public MustEatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.figs, R.string.description_figs,
                R.drawable.figs));
        attractions.add(new Attraction(R.string.olive, R.string.description_olive,
                R.drawable.olives));
        attractions.add(new Attraction(R.string.sfela, R.string.description_sfela,
                R.drawable.sfela));
        attractions.add(new Attraction(R.string.sausages, R.string.description_sausages,
                R.drawable.sausages));
        attractions.add(new Attraction(R.string.lalagia, R.string.description_lalagia,
                R.drawable.lalagia));
        attractions.add(new Attraction(R.string.diples, R.string.description_diples,
                R.drawable.diples));


        ListView listView = rootView.findViewById(R.id.list);
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
