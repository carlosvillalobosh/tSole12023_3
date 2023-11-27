package com.example.tsole12023_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
  EditText ns1, ns2, pt;
  Button enviar;
  TextView alumno;
  String eleccion;
  Intent intent2;
  Intent intent3;
  public static final String NOTA="nota", SEL = "sel";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);
    Intent intent = getIntent();
    eleccion = intent.getStringExtra(MainActivity.EXTRA);
    ns1 = (EditText)findViewById(R.id.ns1);
    ns2 = (EditText)findViewById(R.id.ns2);
    pt = (EditText)findViewById(R.id.pt);
    enviar = (Button)findViewById(R.id.enviar);
    alumno = (TextView)findViewById(R.id.alumno);
    alumno.setText(eleccion);
    intent2 = new Intent(this, MainActivity3.class);
    intent3 = new Intent(this, MainActivity4.class);
    enviar.setOnClickListener(calc);
  }

  private View.OnClickListener calc = new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      Integer sol1, sol2, promt, nf;
      double promf;
      sol1 = Integer.parseInt(ns1.getText().toString());
      sol2 = Integer.parseInt(ns2.getText().toString());
      promt = Integer.parseInt(pt.getText().toString());
      promf = sol1*0.35 + sol2*0.35 + promt*0.3;
      nf = Math.toIntExact(Math.round(promf));

      if (nf >= 40) {
        intent2.putExtra(NOTA, nf);
        intent2.putExtra(SEL, eleccion);
          startActivity(intent2);
      } else {
        intent3.putExtra(NOTA, nf);
        intent3.putExtra(SEL, eleccion);
          startActivity(intent3);
      }

    }
  };
}