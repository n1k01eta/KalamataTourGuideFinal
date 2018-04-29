package com.example.android.kalamatatourguide;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by user on 29/4/2018.
 */

public class ClickListener implements ListView.OnItemClickListener {
    Intent intent;
    private Context context;

    public ClickListener(Context context) {
        this.context = context;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Attraction attraction = (Attraction) adapterView.getItemAtPosition(i);

        if (attraction.hasLocation()) {
            intent = new Intent(context, AttractionActivity.class);
            intent.putExtra("name_resource_id", attraction.getNameResourceID());
            intent.putExtra("description_resource_id", attraction.getDescriptionResourceID());
            intent.putExtra("image_resource_id", attraction.getImageResourceID());
            intent.putExtra("latitude", attraction.getLatitude());
            intent.putExtra("longitude", attraction.getLongitude());
            intent.putExtra("location", attraction.getLocation());
        } else {
            intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("name_resource_id", attraction.getNameResourceID());
            intent.putExtra("description_resource_id", attraction.getDescriptionResourceID());
            intent.putExtra("image_resource_id", attraction.getImageResourceID());
        }
        context.startActivity(intent);
    }
}
