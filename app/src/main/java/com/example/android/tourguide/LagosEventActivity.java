package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LagosEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lagos_list);

        // fill the array with each images and details using Tour object
        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(R.drawable.places_national_theater, getString(R.string.national_theater)));
        tours.add(new Tour(R.drawable.tbs_places_lag, getString(R.string.tbs)));
        tours.add(new Tour(R.drawable.banana_island_places_lag, getString(R.string.banana_island)));
        tours.add(new Tour(R.drawable.amusement_places_lag, getString(R.string.amusement_park)));
        tours.add(new Tour(R.drawable.elegushi_places_lag, getString(R.string.elegushi)));
        tours.add(new Tour(R.drawable.freedom_park_places_lag, getString(R.string.freedom_park)));
        tours.add(new Tour(R.drawable.lekki_consevation_center_places_lag, getString(R.string.lekki_center)));


        LagosAdapter tourAdapter = new LagosAdapter(this, tours, R.color.colorDarkYellow);
        ListView listAdapter = findViewById(R.id.list);
        listAdapter.setAdapter(tourAdapter);

        // set a listener on the places button to fill each items in its respective position.
        listAdapter.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Tour tour = tours.get(position);
                String text = tour.getmTextDetails();

            }
        });
    }
}
