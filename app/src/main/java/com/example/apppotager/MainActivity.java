package com.example.apppotager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private View navView;
    private ImageButton navButton;
    private ImageButton navButton2;
    private ImageButton glossary;
    private ImageButton home;
    private ImageButton calendar;
    private ImageButton favorite;
    private ImageButton garden;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navView = (View) findViewById(R.id.navView);
        navButton = (ImageButton) findViewById(R.id.navButton);
        navButton2 = (ImageButton) findViewById(R.id.navButton2);
        glossary = (ImageButton) findViewById(R.id.glossary_icon);
        garden = (ImageButton) findViewById(R.id.grid_icon);
        calendar = (ImageButton) findViewById(R.id.calendar_icon);
        favorite = (ImageButton) findViewById(R.id.favorite_icon);
        home = (ImageButton) findViewById(R.id.home_icon);
        glossary.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        garden.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        calendar.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        favorite.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        home.setBackgroundColor(getResources().getColor(R.color.lightGreen));

        navView.setVisibility(View.GONE);
    }

    public void setVisibility(View view){
        if(navView.isShown()) navView.setVisibility(View.GONE);
        else navView.setVisibility(View.VISIBLE);
    }

    public void goToGlossary(View view){
        System.out.println("GLOSSARY");
        Intent intent = new Intent(MainActivity.this,Glossary.class);
        startActivity(intent);
    }

    public void goToFavorite(View view){
        System.out.println("FAVORITE");
        Intent intent = new Intent(MainActivity.this,Favorite.class);
        startActivity(intent);
    }

    public void goToGarden(View view){
        System.out.println("GARDEN");
        startActivity(new Intent(MainActivity.this,Garden.class));
    }

    public void goToCalendar(View view){
        System.out.println("CALENDAR");
        Intent intent = new Intent(MainActivity.this,Calendar.class);
        startActivity(intent);
    }

}