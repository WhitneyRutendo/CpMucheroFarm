package com.whitney.cpmucherofarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FarmInfo extends AppCompatActivity {

    private String FarmInfo;
    private TextView FarmInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_info);

        Intent intent = getIntent();
        intent.getStringExtra("Parklands farm is situated in Norton along the Harare-Bulawayo highway. It is owned by Colonel C.P Muchero.Crops grown there include Soyabeans, Sugarbeans, Maize and Wheat");

    }

}


