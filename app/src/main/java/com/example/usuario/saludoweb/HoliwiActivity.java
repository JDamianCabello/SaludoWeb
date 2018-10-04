package com.example.usuario.saludoweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HoliwiActivity extends AppCompatActivity {

    @BindView(R.id.tvSaludo) TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiwi);
        ButterKnife.bind(this);
        Intent intent = this.getIntent();
        String caca =  "Hola "+ intent.getStringExtra("nombre");
        saludo.setText(caca);

    }
}
