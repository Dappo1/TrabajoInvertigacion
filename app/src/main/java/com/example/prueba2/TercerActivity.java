package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class TercerActivity extends AppCompatActivity {

    String pais, nombre, sexo;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);
        recibirdatos3();

    }
    private void recibirdatos3(){
         pais = getIntent().getStringExtra("pais");
         nombre = getIntent().getStringExtra("nombre");
         sexo = getIntent().getStringExtra("sexo");
    }

    public void Cargardatos (View Boton){
        texto = findViewById(R.id.TextoFinal);
        texto.append("Nombre :  "+ nombre + " \n");
        texto.append("Sexo :  "+ sexo + " \n");
        texto.append("Ubicación :  "+ pais + " \n");
    }
}