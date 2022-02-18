package com.example.apppotager;

import java.util.Date;

public class Plant {
    private String name;
    private Date jourDeSeme;
    private int joursAvantRecolte;

    public Plant(String name, Date jourDeSeme, int joursAvantRecolte){
        this.name = name;
        this.jourDeSeme = jourDeSeme;
        this.joursAvantRecolte = joursAvantRecolte;
    }

    public String getName(){
        return this.name;
    }

    public Date getJourDeSeme() {
        return jourDeSeme;
    }

    public int getJoursAvantRecolte(){
        return joursAvantRecolte;
    }
}


