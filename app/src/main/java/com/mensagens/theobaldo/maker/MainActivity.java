package com.mensagens.theobaldo.maker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Botao;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Botao = (Button) findViewById(R.id.btID);
        texto = (TextView) findViewById(R.id.txID);

        Botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                texto.setText("Olá Makers");

            }
        });

    }
}
