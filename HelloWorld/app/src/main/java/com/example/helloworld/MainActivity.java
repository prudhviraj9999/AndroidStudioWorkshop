package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int count=0;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.sietk);
    }

    public void showToast(View view) {
        Toast.makeText(this, " Khan is My name hello ", Toast.LENGTH_SHORT).show();
    }

    public void showCount(View view) {
        count=count+1;
        mTextView.setText(" "+count);
    }
}
