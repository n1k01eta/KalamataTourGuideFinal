package com.example.android.kalamatatourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 29/4/2018.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {
    public AttractionAdapter(@NonNull Context context, @NonNull List<Attraction> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (convertView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        Attraction place = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(place.getImageResourceID());

        TextView textView = listItemView.findViewById(R.id.text_view);
        textView.setText(place.getNameResourceID());

        return listItemView;
    }
}