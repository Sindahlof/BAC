package com.example.bac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button login;
    private TextView wrongLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        this.password = (EditText) findViewById(R.id.editTextTextPassword);
        this.wrongLogin = (TextView) findViewById(R.id.textView2);
        this.wrongLogin.setVisibility(View.INVISIBLE);
    }


    public void loginIO(android.view.View s) {
        String email = "user";
        String password = "1234";

        if (this.email.getText().toString().compareTo(email) == 0 && this.password.getText().toString().compareTo(password) == 0) {
            Intent intent = new Intent(this, activity2.class);
            startActivity(intent);
        } else {
            this.wrongLogin.setVisibility(View.VISIBLE);
            System.out.println("wrong login");
        }
    }
}