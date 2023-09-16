package com.example.calculofigurasgeometricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class equilatero extends AppCompatActivity {

    //creación y encapsulación de los objetos que usaremos en este activity
    private EditText et_base_b_equilatero, et_altura_h_equilatero, et_lado_a_equilatero, et_lado_b_equilatero, et_lado_c_equilatero;
    private RadioButton rb_perimetro_equilatero, rb_semiperimetro_equilatero;
    private TextView txt_resultado_area_equilatero, txt_resultado_per_sem_equilatero;

    //Método onCreate
    //Crear objetos que nos permitan recuperar y encontrar a través de su ID a nuestros componentes que creamos en el activity_equilatero.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equilatero);

        et_base_b_equilatero = (EditText)findViewById(R.id.et_base_b_equilatero);
        et_altura_h_equilatero = (EditText)findViewById(R.id.et_altura_h_equilatero);
        et_lado_a_equilatero = (EditText)findViewById(R.id.et_lado_a_equilatero);
        et_lado_b_equilatero = (EditText)findViewById(R.id.et_lado_b_equilatero);
        et_lado_c_equilatero = (EditText)findViewById(R.id.et_lado_c_equilatero);
        rb_perimetro_equilatero = (RadioButton)findViewById(R.id.rb_perimetro_equilatero);
        rb_semiperimetro_equilatero = (RadioButton)findViewById(R.id.rb_semiperimetro_equilatero);
        txt_resultado_area_equilatero = (TextView)findViewById(R.id.txt_resultado_area_equilatero);
        txt_resultado_per_sem_equilatero = (TextView)findViewById(R.id.txt_resultado_per_sem_equilatero);
    }

    //Método para calcular area
    public void Calcular_area_equilatero(View view){
        String valor1_String = et_base_b_equilatero.getText().toString();
        String valor2_String = et_altura_h_equilatero.getText().toString();

        double valor1_double = Double.parseDouble(valor1_String);
        double valor2_double = Double.parseDouble(valor2_String);

        double area = (valor1_double * valor2_double)/2;
        String resultado = String.valueOf(area);
        txt_resultado_area_equilatero.setText("El área del equilatero es: " + resultado);

    }

    //Método para calcular perimetro y semiperimetro
    public void Calcular_per_semiper_equilatero(View view){
        String valor1_String = et_lado_a_equilatero.getText().toString();
        String valor2_String = et_lado_b_equilatero.getText().toString();
        String valor3_String = et_lado_c_equilatero.getText().toString();

        double valor1_double = Double.parseDouble(valor1_String);
        double valor2_double = Double.parseDouble(valor2_String);
        double valor3_double = Double.parseDouble(valor3_String);

        if(rb_perimetro_equilatero.isChecked() == true){
            double perimetro = valor1_double + valor2_double + valor3_double;
            String resultado = String.valueOf(perimetro);
            txt_resultado_per_sem_equilatero.setText("El perímetro del equilátero es: " + resultado);
        }else if(rb_semiperimetro_equilatero.isChecked() == true){
            double semiperimetro = (valor1_double + valor2_double + valor3_double)/2;
            String resultado = String.valueOf(semiperimetro);
            txt_resultado_per_sem_equilatero.setText("El semiperímetro del equilátero es: " + resultado);
        }
    }

    //Método para el botón regresar
    public void Regresar_triangulo_menu(View view){
        Intent regresar = new Intent(this, Triangulo.class);
        startActivity(regresar);
    }
}