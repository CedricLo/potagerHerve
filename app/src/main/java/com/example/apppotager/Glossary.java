package com.example.apppotager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class Glossary extends AppCompatActivity {

    private ImageButton glossary;
    private ImageButton home;
    private ImageButton calendar;
    private ImageButton favorite;
    private ImageButton garden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glossary);

        glossary = (ImageButton) findViewById(R.id.glossary_icon);
        garden = (ImageButton) findViewById(R.id.grid_icon);
        calendar = (ImageButton) findViewById(R.id.calendar_icon);
        favorite = (ImageButton) findViewById(R.id.favorite_icon);
        home = (ImageButton) findViewById(R.id.home_icon);
        glossary.setBackgroundColor(getResources().getColor(R.color.lightGreen));
        garden.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        calendar.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        favorite.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        home.setBackgroundColor(getResources().getColor(R.color.darkGreen));
    }
}