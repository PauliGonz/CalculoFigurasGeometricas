package com.example.calculofigurasgeometricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método para el botón cuadrado
    //se crea un objeto Intent y le asignamos un nombre a este objeto en este caso cuadrado
    //y creamos el método startActivity
    public void Cuadrado(View view){
        Intent cuadrado = new Intent(this, Cuadrado.class);
        startActivity(cuadrado);
    }

    //Método para el botón rectángulo
    //se crea un objeto Intent y le asignamos un nombre a este objeto en este caso rectangulo
    //y creamos el método startActivity
    public void Rectangulo(View view){
        Intent rectangulo = new Intent(this, Rectangulo.class); //se crea un objeto Intent y le asignamos un nombre a este objeto
        startActivity(rectangulo);
    }

    //Método para el botón círculo
    //se crea un objeto Intent y le asignamos un nombre a este objeto en este caso círculo
    //y creamos el método startActivity
    public void Circulo(View view){
        Intent circulo = new Intent(this, Circulo.class);
        startActivity(circulo);
    }

    //Método para el botón triángulo
    //se crea un objeto Intent y le asignamos un nombre a este objeto en este caso triángulo
    //y creamos el método startActivity
    public void Triangulo(View view){
        Intent triangulo = new Intent(this, Triangulo.class);
        startActivity(triangulo);
    }
}