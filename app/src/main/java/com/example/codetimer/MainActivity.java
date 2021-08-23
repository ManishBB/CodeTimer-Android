package com.example.codetimer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLogin, btnSignUp;
    EditText email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        btnLogin = findViewById(R.id.btnLogIn);
        btnSignUp = findViewById(R.id.btnSignUp);

        Intent intent = new Intent(getApplicationContext() , StopWatchActivity.class);

        btnLogin.setOnClickListener(v -> startActivity(intent));
    }
}