package com.whitney.cpmucherofarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CpMucheroFarm extends AppCompatActivity {

    private TextView FarmInfoTextView;
    private Button SignInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cp_muchero_farm);
        OnClickListener();
    }
    public void OnClickListener(){

        FarmInfoTextView = (TextView) findViewById(R.id.FarmInfoTextView);
        SignInButton = (Button) findViewById(R.id.SignInButton);
        SignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("com.whitney.parklandsfarm.FarmInfoActivity");
                startActivity(intent);
            }
        });
    }
}
