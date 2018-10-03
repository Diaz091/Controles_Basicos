package com.example.dm2.ejecicio_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Operar extends AppCompatActivity {
    int num1;
    int num2;
    private EditText edit_1;
    private EditText edit_2;
    private TextView txtView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operar);

        edit_1 = (EditText) findViewById(R.id.edit1);
        edit_2 = (EditText) findViewById(R.id.edit2);
        txtView = (TextView) findViewById(R.id.view);

    }

    public void operacion(View view) {
        num1 = Integer.parseInt(edit_1.getText().toString());
        num2 = Integer.parseInt(edit_2.getText().toString());
        int result;
        if(view.getTag().toString().charAt(0)=='3'){

            result = num1 / num2;
            txtView.setText("Resultado: "+ " " +  result);

        }else if(view.getTag().toString().charAt(0)=='2'){

            result = num1 * num2;
            txtView.setText("Resultado: "+ " " +  result);
        }else if(view.getTag().toString().charAt(0)=='1'){

            result = Math.abs(num1 - num2);
            txtView.setText("Resultado: "+ " " +  result);
        }else{
            result = num1 + num2;
            txtView.setText("Resultado: "+ " " +  result);
        }

    }
}
