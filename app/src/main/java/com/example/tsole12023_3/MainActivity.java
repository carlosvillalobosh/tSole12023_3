package com.example.tsole12023_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA = "eleccion";
    String[] alumnos = {
            "Zoila Plaza",
            "Elvis Teck",
            "Elver Galarce",
            "John Dean",
            "Maria Canabal",
            "Rosa Melan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.curso,R.id.alumno, alumnos);
        GridView listaAlumnos = new GridView(this);
        listaAlumnos.setNumColumns(2);
        listaAlumnos.setColumnWidth(60);
        listaAlumnos.setVerticalSpacing(20);
        listaAlumnos.setHorizontalSpacing(20);
        setContentView(listaAlumnos);
        listaAlumnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(view.getContext(), MainActivity2.class);
                intent.putExtra(EXTRA, alumnos);
                startActivity(intent);
            }
        });

    }
}