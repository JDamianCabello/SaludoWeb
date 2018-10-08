package com.example.usuario.saludoweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HoliwiActivity extends AppCompatActivity {

    @BindView(R.id.tvSaludo) TextView saludo;
    private String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiwi);
        ButterKnife.bind(this);
        nombre = "hola ";
        nombre += getIntent().getStringExtra("nombre");
        saludo.setText(nombre);

    }
}
