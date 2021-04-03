package com.example.tateti;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private TextView tvJugador_Uno, tvJugador_Dos;
    Button bt_uno, bt_dos, bt_tres, bt_cuatro, bt_cinco, bt_seis, bt_siete, bt_ocho, bt_nueve,
            bt_turno, bt_reiniciar;
    String jugadorUno, jugadorDos;
    int turno = 1;
    int tirar = 0;
    int tablero[] = new int[9];
    boolean ganarJugadorUno = false, ganarJugadorDos = false;
    boolean tiro = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvJugador_Uno = (TextView) findViewById(R.id.tvDos);
        tvJugador_Dos = (TextView) findViewById(R.id.tvTres);

        bt_turno = (Button) findViewById(R.id.btn_turnos);
        bt_reiniciar = (Button) findViewById(R.id.btn_reiniciar);
        //recuperamos los nombre de la activity anterior
        jugadorUno = getIntent().getStringExtra("jugadorUno");
        jugadorDos = getIntent().getStringExtra("jugadorDos");
        tvJugador_Uno.setText("Jugador: " + jugadorUno + " X");
        tvJugador_Dos.setText("Jugador: " + jugadorDos + " O");
        bt_uno = (Button) findViewById(R.id.btn_uno);
        bt_dos = (Button) findViewById(R.id.btn_dos);
        bt_tres = (Button) findViewById(R.id.btn_tres);
        bt_cuatro = (Button) findViewById(R.id.btn_cuatro);
        bt_cinco = (Button) findViewById(R.id.btn_cinco);
        bt_seis = (Button) findViewById(R.id.btn_seis);
        bt_siete = (Button) findViewById(R.id.btn_siete);
        bt_ocho = (Button) findViewById(R.id.btn_ocho);
        bt_nueve = (Button) findViewById(R.id.btn_nueve);

        for (int i = 0; i <= 8; i++) {
            tablero[i] = 0;
        }
        bt_uno.setOnClickListener(this);
        bt_dos.setOnClickListener(this);
        bt_tres.setOnClickListener(this);
        bt_cuatro.setOnClickListener(this);
        bt_cinco.setOnClickListener(this);
        bt_seis.setOnClickListener(this);
        bt_siete.setOnClickListener(this);
        bt_ocho.setOnClickListener(this);
        bt_nueve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_uno:
                if (tablero[0] == 0 && turno == 1) {
                    bt_uno.setText("X");
                    tablero[0] = 1;
                    tiro = true;
                }
                if (tablero[0] == 0 && turno == 2) {
                    bt_uno.setText("O");
                    tablero[0] = 2;
                    tiro = true;
                }
                break;
            case R.id.btn_dos:
                if (tablero[1] == 0 && turno == 1) {
                    bt_dos.setText("X");
                    tablero[1] = 1;
                    tiro = true;
                }
                if (tablero[1] == 0 && turno == 2) {
                    bt_dos.setText("O");
                    tablero[1] = 2;
                    tiro = true;
                }
                break;
            case R.id.btn_tres:
                if (tablero[2] == 0 && turno == 1) {
                    bt_tres.setText("X");
                    tablero[2] = 1;
                    tiro = true;
                }
                if (tablero[2] == 0 && turno == 2) {
                    bt_tres.setText("O");
                    tablero[2] = 2;
                    tiro = true;
                }
                break;
            case R.id.btn_cuatro:
                if (tablero[3] == 0 && turno == 1) {
                    bt_cuatro.setText("X");
                    tablero[3] = 1;
                    tiro = true;
                }
                if (tablero[3] == 1 && turno == 2) {
                    bt_cuatro.setText("O");
                    tablero[3] = 2;
                    tiro = true;
                }
                break;
            case R.id.btn_cinco:
                if (tablero[4] == 0 && turno == 1) {
                    bt_cinco.setText("X");
                    tablero[4] = 1;
                    tiro = true;
                }
                if (tablero[4] == 0 && turno == 2) {
                    bt_cinco.setText("O");
                    tablero[4] = 2;
                    tiro = true;
                }
                break;
            case R.id.btn_seis:
                if (tablero[5] == 0 && turno == 1) {
                    bt_seis.setText("X");
                    tablero[5] = 1;
                    tiro = true;
                }
                if (tablero[5] == 0 && turno == 2) {
                    bt_seis.setText("O");
                    tablero[5] = 2;
                    tiro = true;
                }
                break;
            case R.id.btn_siete:
                if (tablero[6] == 0 && turno == 1) {
                    bt_siete.setText("X");
                    tablero[6] = 1;
                    tiro = true;
                }
                if (tablero[6] == 0 && turno == 2) {
                    bt_siete.setText("O");
                    tablero[6] = 2;
                    tiro = true;
                }
                break;
            case R.id.btn_ocho:
                if (tablero[7] == 0 && turno == 1) {
                    bt_ocho.setText("X");
                    tablero[7] = 1;
                    tiro = true;
                }
                if (tablero[7] == 0 && turno == 2) {
                    bt_ocho.setText("O");
                    tablero[7] = 2;
                    tiro = true;
                }
                break;
            case R.id.btn_nueve:
                if (tablero[8] == 0 && turno == 1) {
                    bt_nueve.setText("X");
                    tablero[8] = 1;
                    tiro = true;
                }
                if (tablero[8] == 0 && turno == 2) {
                    bt_nueve.setText("O");
                    tablero[8] = 2;
                    tiro = true;
                }
                break;
        }
        tirar ++;
        contarPosiciones();
    }

    public void contarPosiciones() {
        //colocamos las nueve posibilidades en jugador uno
        if (tablero[0] == 1 && tablero[1] == 1 && tablero[2] == 1) {
            ganarJugadorUno = true;
            Toast.makeText(this, jugadorUno + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[3] == 1 && tablero[4] == 1 && tablero[5] == 1) {
            ganarJugadorUno = true;
            Toast.makeText(this, jugadorUno + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[6] == 1 && tablero[7] == 1 && tablero[8] == 1) {
            ganarJugadorUno = true;
            Toast.makeText(this, jugadorUno + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[0] == 1 && tablero[3] == 1 && tablero[6] == 1) {
            ganarJugadorUno = true;
            Toast.makeText(this, jugadorUno + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[1] == 1 && tablero[4] == 1 && tablero[7] == 1) {
            ganarJugadorUno = true;
            Toast.makeText(this, jugadorUno + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[2] == 1 && tablero[5] == 1 && tablero[8] == 1) {
            ganarJugadorUno = true;
            Toast.makeText(this, jugadorUno + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[0] == 1 && tablero[4] == 1 && tablero[8] == 1) {
            ganarJugadorUno = true;
            Toast.makeText(this, jugadorUno + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[2] == 1 && tablero[4] == 1 && tablero[6] == 1) {
            ganarJugadorUno = true;
            Toast.makeText(this, jugadorUno + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        // posibilidades jugados dos
        if (tablero[0] == 2 && tablero[1] == 2 && tablero[2] == 2) {
            ganarJugadorDos = true;
            Toast.makeText(this, jugadorDos + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[3] == 2 && tablero[4] == 2 && tablero[5] == 2) {
            ganarJugadorDos = true;
            Toast.makeText(this, jugadorDos + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[6] == 2 && tablero[7] == 2 && tablero[8] == 2) {
            ganarJugadorDos = true;
            Toast.makeText(this, jugadorDos + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[0] == 2 && tablero[3] == 2 && tablero[6] == 2) {
            ganarJugadorDos = true;
            Toast.makeText(this, jugadorDos + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[1] == 2 && tablero[4] == 2 && tablero[7] == 2) {
            ganarJugadorDos = true;
            Toast.makeText(this, jugadorDos + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[2] == 2 && tablero[5] == 2 && tablero[8] == 2) {
            ganarJugadorDos = true;
            Toast.makeText(this, jugadorDos + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[0] == 2 && tablero[4] == 2 && tablero[8] == 2) {
            ganarJugadorDos = true;
            Toast.makeText(this, jugadorDos + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tablero[2] == 2 && tablero[4] == 2 && tablero[6] == 2) {
            ganarJugadorDos = true;
            Toast.makeText(this, jugadorDos + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if(tirar == 18 && !ganarJugadorUno && !ganarJugadorDos ){
            Toast.makeText(this, "Empate", Toast.LENGTH_SHORT).show();
        }
    }

    public void comprobarEstado() {
        //metodo para ver si hay ganador o empate
        if (ganarJugadorUno = true) {
            Toast.makeText(this, jugadorUno + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (ganarJugadorDos = true) {
            Toast.makeText(this, jugadorDos + " es el ganador", Toast.LENGTH_SHORT).show();
        }
        if (tirar == 9 && !ganarJugadorUno && !ganarJugadorDos) {
            Toast.makeText(this, "Empate", Toast.LENGTH_SHORT).show();
        }
    }

    public void Reiniciar(View view) {
        bt_uno.setText("");
        bt_dos.setText("");
        bt_tres.setText("");
        bt_cuatro.setText("");
        bt_cinco.setText("");
        bt_seis.setText("");
        bt_siete.setText("");
        bt_ocho.setText("");
        bt_nueve.setText("");
        for (int i = 0; i <= 8; i++) {
            tablero[i] = 0;
        }
        ganarJugadorUno = false;
        ganarJugadorDos = false;
    }

    public void pasarTurno(View view) {
        if (tiro == true) {
            if (turno == 1) {
                turno = 2;
            } else {
                turno = 1;
            }
        }
    }
}
