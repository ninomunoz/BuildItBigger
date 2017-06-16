package com.example.andjoker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String INTENT_EXTRA_JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);


        Intent intent = getIntent();
        String joke = intent.getStringExtra(INTENT_EXTRA_JOKE);

        TextView tvJoke = (TextView)findViewById(R.id.tvJoke);
        tvJoke.setText(joke);
    }
}