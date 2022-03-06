package com.example.bac;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import Domain.BloodAlcholConcentration;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainScreen extends AppCompatActivity {

    private TextView bacNumber;
    private File file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        file = getFileStreamPath("genderAndWeight.txt");
        this.bacNumber = findViewById(R.id.bacNumber);
        this.bacNumber.setText(String.valueOf(BloodAlcholConcentration.currentBac));
    }

    @RequiresApi(api = Build.VERSION_CODES.O)

    public void newDrinkHandler(View view){
        if(file.length() == 0) {
            Intent intent = new Intent(this, NeedsGenderWeight.class);
            startActivity(intent);
        }
    }
}