package com.example.intents;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.URL;
import java.security.Key;

public class MainActivity extends AppCompatActivity {

    EditText ed,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.textView2);
        ed2=findViewById(R.id.textView3);

    }

    public void goToNext(View view) {
        String name;
        name=ed.getText().toString();
        Intent i=new Intent(this,secondActivity.class );
        i.putExtra("key",name);
        startActivity(i);

    }

    public void openUrl(View view) {
        String url=ed2.getText().toString();
        Uri data=Uri.parse("http://"+url);
        Intent i = new Intent(Intent.ACTION_VIEW,data);
        startActivity(i);

    }
}
