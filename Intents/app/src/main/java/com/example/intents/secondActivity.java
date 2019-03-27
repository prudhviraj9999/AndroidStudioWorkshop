package com.example.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        tv=findViewById(R.id.textView);
        Intent s= getIntent();
        String n=s.getExtras().getString("key");
        tv.setText(n+" Thalivaar");
    }
}
