package com.example.loginsignupui.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.loginsignupui.R;

public class LoginActivity extends AppCompatActivity {
TextView donhaveaccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        donhaveaccount = findViewById(R.id.donthaveaccount);

        donhaveaccount.setOnClickListener(v->{
            startActivity(new Intent(LoginActivity.this,SignupActivity.class));
        });

    }
}