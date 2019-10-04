package com.example.tetris;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private ImageButton botonDcha, botonBajar, botonIzda, botonRotar;
    TextView puntos;
    private Juego juego;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton botonDcha = findViewById(R.id.botonDcha);
        ImageButton botonIzda = findViewById(R.id.botonIzda);
        ImageButton botonBajar = findViewById(R.id.botonBajar);
        ImageButton botonRotar = findViewById(R.id.botonRotar);

        TextView puntos = findViewById(R.id.puntosText);
        TextView nivel = findViewById(R.id.nivelText);

        juego = new Juego(this);
    }

    public ImageButton getBotonDcha() { return botonDcha;}
    public ImageButton getBotonBajar() { return botonBajar;}
    public ImageButton getBotonIzda() { return botonIzda;}
    public ImageButton getBotonRotar() { return botonRotar;}
    public TextView getPuntos() { return puntos; }


}
