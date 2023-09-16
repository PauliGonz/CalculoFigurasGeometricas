package com.example.calculofigurasgeometricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Rectangulo extends AppCompatActivity {

    //creación y encapsulación de los objetos que usaremos en este activity
    private EditText et_lado_b, et_lado_h;
    private RadioButton rb_area_rectangulo, rb_diagonal_rectangulo,rb_perimetro_rectangulo;
    private TextView txt_resultado_rectangulo;

    //Método onCreate
    //Crear objetos que nos permitan recuperar y encontrar a través de su ID a nuestros componentes que creamos en el activity_rectangulo.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        et_lado_b = (EditText)findViewById(R.id.et_lado_b);
        et_lado_h = (EditText)findViewById(R.id.et_lado_h);
        rb_area_rectangulo = (RadioButton)findViewById(R.id.rb_area_rectangulo);
        rb_diagonal_rectangulo = (RadioButton)findViewById(R.id.rb_diagonal_rectangulo);
        rb_perimetro_rectangulo = (RadioButton)findViewById(R.id.rb_perimetro_rectangulo);
        txt_resultado_rectangulo = (TextView)findViewById(R.id.txt_resultado_rectangulo);
    }

    //Método para calcular
    public void Calcular_rectangulo(View view){
        String valor1_String = et_lado_b.getText().toString();
        String valor2_String = et_lado_h.getText().toString();

        double valor1_double = Double.parseDouble(valor1_String);
        double valor2_double = Double.parseDouble(valor2_String);

        if(rb_area_rectangulo.isChecked() == true){
            double area = valor1_double * valor2_double;
            String resultado = String.valueOf(area);
            txt_resultado_rectangulo.setText("El área del rectángulo es: " + resultado);
        }else if(rb_diagonal_rectangulo.isChecked() == true){
            double diagonal = (double) Math.sqrt(Math.pow(valor1_double, 2) + Math.pow(valor2_double,2));
            String resultado = String.valueOf(diagonal);
            txt_resultado_rectangulo.setText("La diagonal del rectángulo es: " + resultado);
        }else if(rb_perimetro_rectangulo.isChecked() == true){
            double perimetro = 2 * (valor1_double + valor2_double);
            String resultado = String.valueOf(perimetro);
            txt_resultado_rectangulo.setText("El perímetro del rectángulo es: " + resultado);
        }
    }

    //Método para el botón regresar
    public void Regresar_rectangulo(View view){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}