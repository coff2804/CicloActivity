package com.example.apptraspasodatos;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombre;
    EditText rut;
    EditText edad;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.txtNombre);
        rut = findViewById(R.id.txtRut);
        edad= findViewById(R.id.txtEdad);
        boton = findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                String nombreParametro = nombre.getText().toString();
                String rutParametro = rut.getText().toString();
                Integer edadParametro =  Integer.parseInt(edad.getText().toString());

                intent.putExtra("nombre",  nombreParametro);
                intent.putExtra("rut", rutParametro);
                intent.putExtra("edad",  edadParametro);
                startActivity(intent);
            }
        });


    }
}