package com.example.recyclerview;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    LinearLayoutManager llm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rv);
         llm=new LinearLayoutManager(this);
         rv.setLayoutManager(llm);

        int posters[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i};
        String movies[]={"AVSR","LEGEND","CAPTAIN AMERICA","DEADPOOL","ENDGAME","FF8","GOODACHARI","HUSHARU","IRONMAN"};
        String actors[]={"JR.NTR","Balayya","ChrisEvans","RyanRenolds","JoshBrolin","VinDiesel","Seshu","Rahul","RDJ"};
        DataAdapter adapter=new DataAdapter(this,posters,movies,actors);
        rv.setAdapter(adapter);
    }
}
