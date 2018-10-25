package com.example.khizzipool.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Flags> Istflag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Istflag = new ArrayList<>();
        Istflag.add(new Flags("Pakistan", R.drawable.pakistan));
        Istflag.add(new Flags("Canada", R.drawable.canada));
        Istflag.add(new Flags("Sri-Lanka", R.drawable.srilanka));
        Istflag.add(new Flags("India", R.drawable.india));
        Istflag.add(new Flags("South-Africa", R.drawable.southafrica));
        Istflag.add(new Flags("France", R.drawable.france));
        Istflag.add(new Flags("Germany", R.drawable.germany));
        Istflag.add(new Flags("Turkey", R.drawable.turkey));
        Istflag.add(new Flags("Brazil", R.drawable.brazil));
        Istflag.add(new Flags("Scotland", R.drawable.scotland));
        Istflag.add(new Flags("Saudia-Arabia", R.drawable.saudiarabia));
        Istflag.add(new Flags("Belgium", R.drawable.belgium));
        Istflag.add(new Flags("Spain", R.drawable.spain));
        Istflag.add(new Flags("United Kingdom", R.drawable.uk));
        Istflag.add(new Flags("New-Zealand", R.drawable.newzealand));

        RecyclerView myrv = findViewById(R.id.recycler_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Istflag);
        myrv.setLayoutManager(new GridLayoutManager(this, 3));
        myrv.setAdapter(myAdapter);
    }
}
