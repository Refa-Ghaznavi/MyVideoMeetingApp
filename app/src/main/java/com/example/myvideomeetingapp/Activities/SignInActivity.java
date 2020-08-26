package com.example.myvideomeetingapp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myvideomeetingapp.R;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        findViewById(R.id.textSignUp).setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), SignUpActivity.class)));
    }
}