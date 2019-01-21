package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AbkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abk);

        // set click listener on the places textview when clicked
        TextView places = findViewById(R.id.places_abk);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // intent that fires up the places page when clickrd
                Intent places = new Intent(AbkActivity.this, AbkPlacesActivity.class);
                startActivity(places);
            }
        });

        // set click listener on the cinemas textview when clicked
        TextView cinemas = findViewById(R.id.cinemas_abk);
        cinemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cinemas = new Intent(AbkActivity.this, AbkCinemasActivity.class);
                startActivity(cinemas);
            }
        });

        // set click listener on the events textview when clicked
        TextView events = findViewById(R.id.events_abk);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent event = new Intent(AbkActivity.this, AbkEventActivity.class);
                startActivity(event);
            }
        });

        // set click listener on the hotels textview when clicked
        TextView hotels = findViewById(R.id.hotels_abk);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotels = new Intent(AbkActivity.this, AbkHotelsActivity.class);
                startActivity(hotels);
            }
        });
    }
}
