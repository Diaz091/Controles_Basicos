package com.example.dm2.ejecicio_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Navegadores extends AppCompatActivity implements View.OnClickListener {
        private Button bot1;
        private Button bot2;
        private Button bot3;
        private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegadores);
        img = (ImageView) findViewById(R.id.img);
        bot1 = (Button) findViewById(R.id.bot1);
        bot2 = (Button) findViewById(R.id.bot2);
        bot2.setOnClickListener(this);
        bot3 = (Button) findViewById(R.id.bot3);
        bot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageDrawable(getDrawable(R.mipmap.ic_google));
            }
        });

    }

    public void mostrarFoto(View view) {
        img.setImageDrawable(getDrawable(R.mipmap.ic_yahoo));

    }

    @Override
    public void onClick(View v) {
        img.setImageDrawable(getDrawable(R.mipmap.ic_bing));
    }
}
