package com.example.calculofigurasgeometricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
    }

    //Método para el botón equilátero
    //se crea un objeto Intent y le asignamos un nombre a este objeto en este caso equilátero
    //y creamos el método startActivity
    public void Equilatero(View view){
        Intent equilatero = new Intent(this, equilatero.class);
        startActivity(equilatero);
    }

    //Método para el botón isósceles
    //se crea un objeto Intent y le asignamos un nombre a este objeto en este caso isósceles
    //y creamos el método startActivity
    public void Isosceles(View view){
        Intent isosceles = new Intent(this, isosceles.class);
        startActivity(isosceles);
    }

    //Método para el botón escaleno
    //se crea un objeto Intent y le asignamos un nombre a este objeto en este caso escaleno
    //y creamos el método startActivity
    public void Escaleno(View view){
        Intent escaleno = new Intent(this, escaleno.class);
        startActivity(escaleno);
    }

    //Método para el botón regresar al menú de "Seleccione un triángulo"
    //se crea un objeto Intent y le asignamos un nombre a este objeto en este caso equilátero
    //y creamos el método startActivity
    public void Regresar_triangulo(View view){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}