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
public class MustDoFragment extends Fragment {


    public MustDoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.city_biking, R.string.description_biking,
                R.drawable.biking));
        attractions.add(new Attraction(R.string.diving, R.string.description_diving,
                R.drawable.diving));
        attractions.add(new Attraction(R.string.sea_kayaking, R.string.description_kayaking,
                R.drawable.kayaking));
        attractions.add(new Attraction(R.string.hiking, R.string.description_hiking,
                R.drawable.hiking));
        attractions.add(new Attraction(R.string.rafting, R.string.description_rafting,
                R.drawable.rafting));
        attractions.add(new Attraction(R.string.horse_riding, R.string.description_horse,
                R.drawable.horse));


        ListView listView = rootView.findViewById(R.id.list);
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
