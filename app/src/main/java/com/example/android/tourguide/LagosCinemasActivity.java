package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LagosCinemasActivity extends AppCompatActivity {

    public static String checkIfEmpty(String words) {
        String output = null;
        if (words == "") {
            output = "No Content Available at the moment";
        }
        return output;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lagos_list);

        final ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Tour(R.drawable.cinemas_silverbird_lag, checkIfEmpty(getString(R.string.national_theater))));
        tours.add(new Tour(R.drawable.cinemas_ozone_lag, getString(R.string.tbs)));
        tours.add(new Tour(R.drawable.cinemas_deluxe_lag, getString(R.string.banana_island)));
        tours.add(new Tour(R.drawable.cinemas_imax_lag, getString(R.string.amusement_park)));
        tours.add(new Tour(R.drawable.cinemas_maturion_lag, getString(R.string.elegushi)));
        tours.add(new Tour(R.drawable.cinemas_doslagos_lag, getString(R.string.freedom_park)));


        // Fill each list item using an adapter predefined
        LagosAdapter tourAdapter = new LagosAdapter(this, tours, R.color.colorNavyBlue);
        ListView listAdapter = findViewById(R.id.list);
        listAdapter.setAdapter(tourAdapter);
    }
}
