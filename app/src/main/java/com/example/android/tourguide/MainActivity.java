package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the listener if lagos button is clicked
        Button lagButton = findViewById(R.id.location_lag);
        lagButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lagIntent = new Intent(MainActivity.this, LagosActivity.class);
                startActivity(lagIntent);
            }
        });

        // set the listener if lagos button is clicked
        Button abkButton = findViewById(R.id.location_abk);
        abkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abkIntent = new Intent(MainActivity.this, AbkActivity.class);
                startActivity(abkIntent);
            }
        });


    }
}
