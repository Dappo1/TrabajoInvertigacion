package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    RadioButton fem, masc;
    TextView name, lastname;
    String pais;
    String sexo;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);
        pais = recibirdatos2();
    }
    private String recibirdatos2(){
        String pais = getIntent().getStringExtra("pais");
        Log.i("pais", pais);
        return pais;
    }
    private String nombreCompleto(){
        name = findViewById(R.id.name);
        lastname = findViewById(R.id.lastname);
        nombre = String.valueOf(name.getText())+ " "+ String.valueOf(lastname.getText());
        return nombre;
    }

    private String valsexo(){
        fem = findViewById(R.id.btnfem);
        masc = findViewById(R.id.btnmasc);
        if(fem.isChecked()){
            sexo = "femenino";
            return sexo;

        }else if(masc.isChecked()){
            sexo = "Masculino";
            return sexo;

        }else{
            sexo = "No identificado";
            return sexo;
        }

    }

    public void Actividad3(View boton2){
        valsexo();
        nombreCompleto();
        Log.i("pais", pais);
        Log.i("Nombre", nombre);
        Log.i("sexo", sexo);

        Intent terceractividad = new Intent( this,TercerActivity.class);
        terceractividad.putExtra("pais",pais);
        terceractividad.putExtra("nombre",nombre);
        terceractividad.putExtra("sexo",sexo);

        startActivity(terceractividad);


    }
}