package com.example.dm2.ejecicio_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void calculadora(View view) {
        Intent intento = new Intent(this, Operar.class);
        startActivity(intento);


    }


    public void dni(View view) {
        Intent dni = new Intent(this,LetraDNI.class);
        startActivity(dni);
   }

    public void buscadores(View view) {
        Intent buscadores = new Intent(this,Navegadores.class);
        startActivity(buscadores);
    }

    public void domotica(View view) {
        Intent domotica = new Intent(this,Domotica.class);
        startActivity(domotica);
    }
}
