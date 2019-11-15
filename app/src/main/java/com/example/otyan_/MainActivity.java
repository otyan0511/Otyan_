package com.example.otyan_;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public RiderAdapter adapter;
    public ArrayList<Rider> riderArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new RiderAdapter(riderArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);


        recyclerView.setAdapter(adapter);

    }

    void addData() {
        riderArrayList = new ArrayList<>();
        riderArrayList.add(new Rider("Valentino Rossi", "46", "Yamaha Monster Energy"));
        riderArrayList.add(new Rider("Andrea Dovisiozo", "04", "Ducaty Factory"));
        riderArrayList.add(new Rider("Marc Marquez", "93", "Honda Repsol"));
        riderArrayList.add(new Rider("Alex Rins", "42", "Suzuki Ecstar"));
    }

}