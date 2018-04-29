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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.dart_war, R.string.description_war,
                R.drawable.war));
        attractions.add(new Attraction(R.string.dance_fest, R.string.description_dance,
                R.drawable.dance));
        attractions.add(new Attraction(R.string.fest_miden, R.string.description_miden,
                R.drawable.miden));


        ListView listView = rootView.findViewById(R.id.list);
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new ClickListener(getActivity()));

        return rootView;
    }

}
