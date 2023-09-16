package com.example.calculofigurasgeometricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Cuadrado extends AppCompatActivity {

    //creación y encapsulación de los objetos que usaremos en este activity
    private EditText et_lado_a;
    private RadioButton rb_area_cuadrado, rb_diagonal_cuadrado,rb_perimetro_cuadrado;
    private TextView txt_resultado_cuadrado;

    //Método onCreate
    //Crear objetos que nos permitan recuperar y encontrar a través de un ID los componentes que creamos en el activity_cuadrado.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        et_lado_a = (EditText)findViewById(R.id.et_lado_a);
        rb_area_cuadrado = (RadioButton)findViewById(R.id.rb_area_cuadrado);
        rb_diagonal_cuadrado = (RadioButton)findViewById(R.id.rb_diagonal_cuadrado);
        rb_perimetro_cuadrado = (RadioButton)findViewById(R.id.rb_perimetro_cuadrado);
        txt_resultado_cuadrado = (TextView)findViewById(R.id.txt_resultado_cuadrado);
    }

    //Método para calcular
    public void Calcular_cuadrado(View view){
        String valor1_String = et_lado_a.getText().toString();

        double valor1_double = Double.parseDouble(valor1_String);

        if(rb_area_cuadrado.isChecked() == true){
            double area = valor1_double * valor1_double;
            String resultado = String.valueOf(area);
            txt_resultado_cuadrado.setText("El área del cuadrado es: " + resultado);
        }else if(rb_diagonal_cuadrado.isChecked() == true){
            double diagonal = (double) Math.sqrt(Math.pow(valor1_double, 2) + Math.pow(valor1_double,2));
            String resultado = String.valueOf(diagonal);
            txt_resultado_cuadrado.setText("La diagonal del cuadrado es: " + resultado);
        }else if(rb_perimetro_cuadrado.isChecked() == true){
            double perimetro = 4 * valor1_double;
            String resultado = String.valueOf(perimetro);
            txt_resultado_cuadrado.setText("El perímetro del cuadrado es: " + resultado);
        }
    }

    //Método para el botón regresar
    public void Regresar_cuadrado(View view){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}