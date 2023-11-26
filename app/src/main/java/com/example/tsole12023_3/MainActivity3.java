package com.example.tsole12023_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView winner, notaWinner, msjWinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        winner = (TextView)findViewById(R.id.winner);
        notaWinner = (TextView)findViewById(R.id.nota_winner);
        msjWinner = (TextView)findViewById(R.id.msj_winner);
        String alumnoWinner = intent.getStringExtra(MainActivity2.SEL);
        winner.setText(alumnoWinner);
        int nWinner = intent.getIntExtra(MainActivity2.NOTA, 0);
        notaWinner.setText(String.valueOf(nWinner));

        String ruta = "fuentes/Winner.ttf";
        Typeface fuente = Typeface.createFromAsset(getAssets(),ruta);
        msjWinner.setTypeface(fuente);
    }
}