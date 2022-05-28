package com.example.s0101wc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView instanceTextView = (TextView) findViewById(R.id.tv_weather_data);
        instanceTextView.append("\n\n But this text is appended from onCreate()");

    }
}