package com.example.tsole12023_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView loser, notaLoser, msjLoser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        loser = (TextView)findViewById(R.id.loser);
        notaLoser = (TextView)findViewById(R.id.nota_loser);
        msjLoser = (TextView)findViewById(R.id.msj_loser);
        String alumnoLoser = intent.getStringExtra(MainActivity2.SEL);
        loser.setText(alumnoLoser);
        int nWinner = intent.getIntExtra(MainActivity2.NOTA, 0);
        notaLoser.setText(String.valueOf(nWinner));

        String ruta = "fuentes/LOSERG__.TTF";
        Typeface fuente = Typeface.createFromAsset(getAssets(),ruta);
        msjLoser.setTypeface(fuente);
    }
}