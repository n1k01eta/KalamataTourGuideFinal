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
public class MustSeeFragment extends Fragment {


    public MustSeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.castle, R.string.description_castle,
                R.drawable.isabeau, new Location("Isabeau Castle"), 37.0461143, 22.1145312));
        attractions.add(new Attraction(R.string.archaeological_museum, R.string.description_archaeological,
                R.drawable.archaeological, new Location("Archaeological Museum Messene"), 37.0461143, 22.1145312));
        attractions.add(new Attraction(R.string.costumes_museum, R.string.description_costume,
                R.drawable.costume, new Location("Museum of Traditional Greek Costumes"), 37.0437192, 22.1112598));
        attractions.add(new Attraction(R.string.ancient_messene, R.string.description_messene,
                R.drawable.messene, new Location("Ancient Messene"), 37.1783753, 21.9182823));


        ListView listView = rootView.findViewById(R.id.list);
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
