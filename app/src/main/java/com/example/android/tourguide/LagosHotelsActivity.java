package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class LagosHotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lagos_list);

        // fill the array with each images and details using Tour object
        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(R.drawable.hotels_fourpoints_lag, getString(R.string.national_theater)));
        tours.add(new Tour(R.drawable.hotels_merinhadt_lag, getString(R.string.tbs)));
        tours.add(new Tour(R.drawable.hotels_orientals_lag, getString(R.string.banana_island)));
        tours.add(new Tour(R.drawable.hotels_sheraton_lag, getString(R.string.amusement_park)));


        LagosAdapter tourAdapter = new LagosAdapter(this, tours, R.color.colorRed);
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
