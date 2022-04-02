package com.example.random;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends DebugActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img =(ImageView) findViewById(R.id.img);
        TextView tv1 =(TextView) findViewById(R.id.tv1);
        TextView tv2 =(TextView) findViewById(R.id.tv2);
        Button bdado = (Button) findViewById(R.id.bdado);
        Button bnum = (Button) findViewById(R.id.bnum);

        bdado.setOnClickListener(this);
        bnum.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.bdado){
            Intent intent1 = new Intent(this, Random3Activity.class);
            startActivity(intent1);
        }else if (view.getId()==R.id.bnum){
            Intent intent2 = new Intent(this, Random2Activity.class);
            startActivity(intent2);
        }
    }
}