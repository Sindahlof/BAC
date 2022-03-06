package com.example.bac;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NeedsGenderWeight extends AppCompatActivity {

    private TextView height;
    private Spinner gender;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needsgenderweight);

        this.height = findViewById(R.id.height);
        this.gender = findViewById(R.id.gender);
    }


    public void addInfoHandler(View view){
        if(this.height.getText().toString().compareTo("") == 0){
            System.out.println("you have not entered your height");
        } else{
            try (FileWriter write = new FileWriter("genderAndWeight.txt")){
                write.write(height.getText().toString());
                write.write(gender.getSelectedItem().toString());
            } catch (IOException e) {
                System.out.println("file not found");            }
        }
    }
}