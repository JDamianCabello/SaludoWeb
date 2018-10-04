package com.example.usuario.saludoweb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends Activity {

    @BindView(R.id.etNombre)
    EditText textoNombre;
    @BindView(R.id.etLink)
    EditText textoLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick(R.id.btSaluda)
    public void Holiwi() {
        Intent i = new Intent(this, HoliwiActivity.class);
        i.putExtra("nombre",textoNombre.getText().toString());
        startActivity(i);
    }


    @OnClick(R.id.btSaluda)
    public void Navega() {

    }
}
