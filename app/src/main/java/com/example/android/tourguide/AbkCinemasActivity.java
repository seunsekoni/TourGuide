package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AbkCinemasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abk_list);

        ArrayList<Tour> abkTours = new ArrayList<>();
        abkTours.add(new Tour(R.drawable.mcrystal_cinemas_abk, getString(R.string.maturion)));


        AbkAdapter tourAdapter = new AbkAdapter(this, abkTours, R.color.colorNavyBlue);
        ListView lisAdapter = findViewById(R.id.abk_list);
        lisAdapter.setAdapter(tourAdapter);

    }
}
