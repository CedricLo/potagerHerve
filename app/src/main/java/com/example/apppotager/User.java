package com.example.apppotager;

public class User {

    private String name;
    private int id;

    public User(String name){
        this.name = name;
        this.id = (int) Math.random()*9999;             // plus tard il faudra vérifier l'unicité de name#id
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
}
