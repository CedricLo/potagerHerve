package com.example.apppotager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Glossary extends AppCompatActivity {

    private ImageButton glossary;
    private ImageButton home;
    private ImageButton calendar;
    private ImageButton favorite;
    private ImageButton garden;
    private View navView;
    private ListView plants;

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

        navView = findViewById(R.id.navView);
        plants = findViewById(R.id.plants_list);

        List<String> ints = new ArrayList<String>();
        for(int i=0; i<25; i++){
            ints.add(""+i);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ints);

        plants.setAdapter(arrayAdapter);

        navView.setVisibility(View.GONE);
    }

    public void setVisibility(View view){
        if(navView.isShown()) navView.setVisibility(View.GONE);
        else navView.setVisibility(View.VISIBLE);
    }

    public void goToGarden(View view){
        Intent intent = new Intent(Glossary.this,Garden.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

    public void goToFavorite(View view){
        Intent intent = new Intent(Glossary.this,Favorite.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }

    public void goToHome(View view){
        startActivity(new Intent(Glossary.this,MainActivity.class));
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

    public void goToCalendar(View view){
        Intent intent = new Intent(Glossary.this,Calendar.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }


}