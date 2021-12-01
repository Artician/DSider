package com.example.dsider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Settings extends AppCompatActivity {

    private String[] genreList = {"Action", "Adventure", "Animation", "Comedy", "Crime",
                                    "Documentary", "Drama", "Family", "Fantasy", "History",
                                    "Horror", "Music", "Mystery", "Romance", "Science Fiction",
                                    "TV Movie", "Thriller", "War", "Western"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
}