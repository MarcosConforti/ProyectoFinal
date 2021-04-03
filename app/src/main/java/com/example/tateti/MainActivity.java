package com.example.tateti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txt_jugadorUno, txt_jugadorDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_jugadorUno = (EditText)findViewById(R.id.txt_jugadorUno);
        txt_jugadorDos = (EditText)findViewById(R.id.txt_jugadorDos);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    public void Ingresar(View view){

        String jugadorUno = txt_jugadorUno.getText().toString();
        String jugadorDos = txt_jugadorDos.getText().toString();

        Intent ingresar = new Intent(this, MainActivity2.class);
        ingresar.putExtra("jugadorUno", jugadorUno);
        ingresar.putExtra("jugadorDos", jugadorDos);
        startActivity(ingresar);
    }
}