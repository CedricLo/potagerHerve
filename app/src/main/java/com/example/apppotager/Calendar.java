package com.example.apppotager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Calendar extends AppCompatActivity {

    private ImageButton glossary;
    private ImageButton home;
    private ImageButton calendar;
    private ImageButton favorite;
    private ImageButton garden;
    private View navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        glossary = (ImageButton) findViewById(R.id.glossary_icon);
        garden = (ImageButton) findViewById(R.id.grid_icon);
        calendar = (ImageButton) findViewById(R.id.calendar_icon);
        favorite = (ImageButton) findViewById(R.id.favorite_icon);
        home = (ImageButton) findViewById(R.id.home_icon);
        glossary.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        garden.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        calendar.setBackgroundColor(getResources().getColor(R.color.lightGreen));
        favorite.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        home.setBackgroundColor(getResources().getColor(R.color.darkGreen));
        navView = findViewById(R.id.navView);

        navView.setVisibility(View.GONE);
    }

    public void setVisibility(View view){
        if(navView.isShown()) navView.setVisibility(View.GONE);
        else navView.setVisibility(View.VISIBLE);
    }

    public void goToGlossary(View view){
        Intent intent = new Intent(Calendar.this,Glossary.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    public void goToFavorite(View view){
        Intent intent = new Intent(Calendar.this,Favorite.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    public void goToHome(View view){
        startActivity(new Intent(Calendar.this,MainActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    public void goToGarden(View view){
        Intent intent = new Intent(Calendar.this,Garden.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
}