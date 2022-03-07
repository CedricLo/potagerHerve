package com.example.apppotager;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "myDatabase";    // Database Name
    private static final String TABLE_NAME = "myTable";   // Table Name
    private static final int DATABASE_Version = 1;    // Database Version
    private static final String UID = "_id";     // Column I (Primary Key)
    private static final String NAME = "Name";    //Column II
    private static final String DESCRIPTION = "Description";
    private static final String PLANTATION = "Plantation";
    private static final String RECOLTE = "Recolte";
    private static final String FAMILLE = "Famille";
    private static final String EMPLACEMENT = "Emplacement";
    private static final String ARROSAGE = "Arrosage";
    private static final String VOISINAGE = "Voisinage";
    private static final String NUISANCES = "Nuisances";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME +
            " (" + UID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + " VARCHAR(255)," + DESCRIPTION + " VARCHAR(255), " + PLANTATION + " date, " + RECOLTE + " date, "
            + FAMILLE + " VARCHAR(255), " + EMPLACEMENT + " VARCHAR(255), " + ARROSAGE + " VARCHAR(255), " + VOISINAGE + " VARCHAR(255), " + NUISANCES + " VARCHAR(255) " + ")";

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
    private Context context;


    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_Version);
        this.context=context;
    }

    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE);
        } catch (Exception e) {
            Log.d("DATABASE", e.toString());
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            Log.d("DATABASE", "Upgrade");
            db.execSQL(DROP_TABLE);
            onCreate(db);
        } catch (Exception e) {
            Log.d("DATABASE", e.toString());
        }
    }
}
