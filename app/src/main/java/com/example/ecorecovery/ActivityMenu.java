package com.example.ecorecovery;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActivityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton imageButton_paper = (ImageButton) findViewById(R.id.imageButton_paper);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton ib_glass = (ImageButton) findViewById(R.id.ib_glass);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton ib_plastic = (ImageButton) findViewById(R.id.ib_plastic);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton ib_BATTERIES = (ImageButton) findViewById(R.id.ib_BATTERIES);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton ib_PLASTICINE = (ImageButton) findViewById(R.id.ib_PLASTICINE);

        ib_PLASTICINE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityMenu.this, Main_Plasticine.class));
            }
        });

        ib_BATTERIES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityMenu.this, Main_Batteria.class));
            }
        });

        ib_plastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityMenu.this, Main_Plastic.class));
            }
        });

        ib_glass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityMenu.this, Main_Glass.class));
            }
        });

        imageButton_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityMenu.this, Main_Paper.class));
            }
        });
    };
}