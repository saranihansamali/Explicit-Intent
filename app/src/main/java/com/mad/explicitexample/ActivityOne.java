package com.mad.explicitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.security.Key;

public class ActivityOne extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_layout);

        t1 = findViewById(R.id.data);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.key);
        t1.setText(message);

    }
}
