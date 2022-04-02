package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.sql.Array;
import java.util.Random;

public class Random3Activity extends AppCompatActivity implements View.OnClickListener {
    private Button bsortear;
    private TextView Dado1;
    private TextView Dado2;
    private TextView Dado3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random3);

        Dado1 = findViewById(R.id.Dado1);
        Dado2 = findViewById(R.id.Dado2);
        Dado3 = findViewById(R.id.Dado3);

        bsortear = findViewById(R.id.bsortear);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.bsortear){

            int x = new Random().nextInt(7);
            int y = new Random().nextInt(7);
            int z = new Random().nextInt(7);

            Dado2.setText("Dado 1:"+x);
            Dado1.setText("Dado 2:"+y);
            Dado3.setText("Dado 3:"+z);

        }
    }
}