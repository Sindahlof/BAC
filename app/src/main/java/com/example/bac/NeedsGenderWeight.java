package com.example.bac;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import Domain.DataConnection;

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
        String data = this.height.getText().toString() + " " + this.gender.getSelectedItem().toString();
        DataConnection.addDrinkDataHandler(data);
    }
}