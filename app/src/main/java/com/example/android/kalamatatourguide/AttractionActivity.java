package com.example.android.kalamatatourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AttractionActivity extends AppCompatActivity {

    private String geoLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);

        ImageView imageView = findViewById(R.id.attraction_image);
        imageView.setImageResource(getIntent().getExtras().getInt("image_resource_id"));

        TextView name = findViewById(R.id.attraction_name);
        String placeName = getString(getIntent().getExtras().getInt("name_resource_id"));
        name.setText(placeName);

        TextView description = findViewById(R.id.attraction_description);
        description.setText(getIntent().getExtras().getInt("description_resource_id"));

        Double latitude = getIntent().getExtras().getDouble("latitude");
        Double longitude = getIntent().getExtras().getDouble("longitude");

        geoLocation = "geo:0,0?q=" + latitude + "," + longitude + "(" + placeName + ")";

        Button button = findViewById(R.id.location_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(geoLocation));

                if (intent.resolveActivity(getPackageManager()) != null)
                    startActivity(intent);
            }
        });

    }
}
