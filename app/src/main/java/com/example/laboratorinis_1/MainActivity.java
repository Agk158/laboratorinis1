package com.example.laboratorinis_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSecondary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvSecondary = findViewById(R.id.tvSecondary);
    }

    public void OnBtnClick(View view) {
        this.tvSecondary.setText("We got a lot to offer!");
    }

    public void OnBtnClick2(View view) {
        this.tvSecondary.setTextColor(Color.GREEN);
    }
}