package com.example.calculofigurasgeometricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Circulo extends AppCompatActivity {

    //creación y encapsulación de los objetos que usaremos en este activity
    private EditText et_radio_circulo;
    private RadioButton rb_area_circulo, rb_longuitud_circulo,rb_diametro_circulo;
    private TextView txt_resultado_circulo;

    //Método onCreate
    //Crear objetos que nos permitan recuperar y encontrar a través de su ID a nuestros componentes que creamos en el activity_circulo.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        et_radio_circulo = (EditText)findViewById(R.id.et_radio_circulo);
        rb_area_circulo = (RadioButton)findViewById(R.id.rb_area_circulo);
        rb_longuitud_circulo = (RadioButton)findViewById(R.id.rb_longuitud_circulo);
        rb_diametro_circulo = (RadioButton)findViewById(R.id.rb_diametro_circulo);
        txt_resultado_circulo = (TextView)findViewById(R.id.txt_resultado_circulo);

    }

    //Método para calcular
    public void Calcular_circulo(View view){
        String valor1_String = et_radio_circulo.getText().toString();

        double valor1_double = Double.parseDouble(valor1_String);
        double PI = 3.1416;

        if(rb_area_circulo.isChecked() == true){
            double area = PI * Math.pow(valor1_double, 2);
            String resultado = String.valueOf(area);
            txt_resultado_circulo.setText("El área del círculo es: " + resultado);
        }else if(rb_longuitud_circulo.isChecked() == true){
            double longuitud = 2 * PI * valor1_double;
            String resultado = String.valueOf(longuitud);
            txt_resultado_circulo.setText("La longuitud del círculo es: " + resultado);
        }else if(rb_diametro_circulo.isChecked() == true){
            double diametro = 2 * valor1_double;
            String resultado = String.valueOf(diametro);
            txt_resultado_circulo.setText("El diámetro del círculo es: " + resultado);
        }
    }

    //Método para el botón regresar
    public void Regresar_circulo(View view){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}