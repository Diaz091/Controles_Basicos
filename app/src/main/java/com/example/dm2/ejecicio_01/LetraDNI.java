package com.example.dm2.ejecicio_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LetraDNI extends AppCompatActivity {
     private EditText edit1;
     private EditText edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letra_dni);

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
    }


    public void validarDNI(View view) {
            int  numDNI = Integer.parseInt( edit1.getText().toString() );
            char carDNI = edit2.getText().toString().charAt(0);

            char carCorrecto;
            int indice = numDNI % 23 ;

            String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
            carCorrecto = letras.charAt(indice);

            if (carCorrecto == carDNI ){
                Toast.makeText(getApplicationContext(),"DNI VALIDO",Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getApplicationContext(),"DNI INVALIDO",Toast.LENGTH_LONG).show();
            }

    }
}
