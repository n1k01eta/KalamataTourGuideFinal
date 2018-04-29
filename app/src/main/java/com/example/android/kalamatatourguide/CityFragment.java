package com.example.android.kalamatatourguide;


import android.location.Location;
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
public class CityFragment extends Fragment {

    public CityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.kalamata, R.string.description_city,
                R.drawable.kalamata, new Location("Kalamata"), 37.0349865, 22.0957945));
        attractions.add(new Attraction(R.string.old_town, R.string.description_oldtown,
                R.drawable.oldtown, new Location("Old Town of Kalamata"), 37.0434983, 22.1120743));
        attractions.add(new Attraction(R.string.railway, R.string.description_railway,
                R.drawable.railway, new Location("Railway Kalamata Park"), 37.0431584, 22.0957993));
        attractions.add(new Attraction(R.string.seaside, R.string.description_seaside,
                R.drawable.seaside, new Location("Seaside Road Kalamata"), 37.0431584, 22.0957993));
        attractions.add(new Attraction(R.string.central_square, R.string.description_central,
                R.drawable.square, new Location("Central Square Kalamata"), 37.0394733, 22.1090694));


        ListView listView = rootView.findViewById(R.id.list);
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
