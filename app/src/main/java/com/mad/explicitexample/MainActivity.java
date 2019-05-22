package com.mad.explicitexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //String sample = "myData";
    public static String key = "message";
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
    }

    public void buttonClickOne(View view)
    {
        Intent intent = new Intent(MainActivity.this,ActivityOne.class);
        intent.putExtra(key, editText.getText().toString());
        startActivity(intent);
    }
}
