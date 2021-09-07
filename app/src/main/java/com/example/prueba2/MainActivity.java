package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText pais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] xmlOpciones = getResources().getStringArray(R.array.opciones);
        MultiAutoCompleteTextView vistaAutoComplete = findViewById((R.id.multiAutoCompleteTextView));
        ArrayAdapter<String> formatoDeDespliegue = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, xmlOpciones);
        vistaAutoComplete.setAdapter(formatoDeDespliegue);
        vistaAutoComplete.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

    public void Actividad2(View boton){
        Intent segundaactividad = new Intent( this,SegundoActivity.class);
        pais = findViewById(R.id.multiAutoCompleteTextView);
        String paisfinal= String.valueOf(pais.getText());
        segundaactividad.putExtra("pais",paisfinal);
        startActivity(segundaactividad);
    }



}