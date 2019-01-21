package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LagosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lagos);

        // Find view of places category in lagos and set listener
        TextView places = findViewById(R.id.places_lag);
        places.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent places = new Intent(LagosActivity.this, LagosPlacesActivity.class);
                startActivity(places);
            }
        });

        // Find view of cinemas category in lagos and set listener
        TextView cinemas = findViewById(R.id.cinemas_lag);
        cinemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cinemas = new Intent(LagosActivity.this, LagosCinemasActivity.class);
                startActivity(cinemas);
            }
        });

        // Find view of events category in lagos and set listener
        TextView events = findViewById(R.id.events_lag);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent events = new Intent(LagosActivity.this, LagosEventActivity.class);
                startActivity(events);
            }
        });

        // Find view of hotels category in lagos and set listener
        TextView hotels = findViewById(R.id.hotels_lag);
        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hotels = new Intent(LagosActivity.this, LagosHotelsActivity.class);
                startActivity(hotels);
            }
        });

    }
}
