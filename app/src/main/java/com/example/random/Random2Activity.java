package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class Random2Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView sorteado;
    private EditText Ni;
    private EditText Nf;
    private Button bsortear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random2);
         Nf = findViewById(R.id.Nf);
         Ni = findViewById(R.id.Ni);
         sorteado = findViewById(R.id.sorteado);
         bsortear = (Button) findViewById(R.id.bsortear);

        bsortear.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.bsortear){

            String Max = Nf.getText().toString();
            String Min = Ni.getText().toString();

            int max = Integer.parseInt(Max);

            int min = Integer.parseInt(Min);

            int x = new Random().nextInt((max - min)+1)+min;
            sorteado.setText("Número sorteado:"+x);
        }
    }
}