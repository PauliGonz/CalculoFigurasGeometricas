package com.example.calculofigurasgeometricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class isosceles extends AppCompatActivity {

    //creación y encapsulación de los objetos que usaremos en este activity
    private EditText et_base_b_isosceles, et_altura_h_isosceles, et_lado_a_isosceles, et_lado_b_isosceles, et_lado_c_isosceles;
    private RadioButton rb_perimetro_isosceles, rb_semiperimetro_isosceles;
    private TextView txt_resultado_area_isosceles, txt_resultado_per_sem_isosceles;

    //Método onCreate
    //Crear objetos que nos permitan recuperar y encontrar a través de su ID a nuestros componentes que creamos en el activity_isosceles.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isosceles);

        et_base_b_isosceles = (EditText)findViewById(R.id.et_base_b_isosceles);
        et_altura_h_isosceles = (EditText)findViewById(R.id.et_altura_h_isosceles);
        et_lado_a_isosceles = (EditText)findViewById(R.id.et_lado_a_isosceles);
        et_lado_b_isosceles = (EditText)findViewById(R.id.et_lado_b_isosceles);
        et_lado_c_isosceles = (EditText)findViewById(R.id.et_lado_c_isosceles);
        rb_perimetro_isosceles = (RadioButton)findViewById(R.id.rb_perimetro_isosceles);
        rb_semiperimetro_isosceles = (RadioButton)findViewById(R.id.rb_semiperimetro_isosceles);
        txt_resultado_area_isosceles = (TextView)findViewById(R.id.txt_resultado_area_isosceles);
        txt_resultado_per_sem_isosceles = (TextView)findViewById(R.id.txt_resultado_per_sem_isosceles);
    }


    //Método para calcular area isosceles
    public void Calcular_area_isosceles(View view){
        String valor1_String = et_base_b_isosceles.getText().toString();
        String valor2_String = et_altura_h_isosceles.getText().toString();

        double valor1_double = Double.parseDouble(valor1_String);
        double valor2_double = Double.parseDouble(valor2_String);

        double area = (valor1_double * valor2_double)/2;
        String resultado = String.valueOf(area);
        txt_resultado_area_isosceles.setText("El área del isósceles es: " + resultado);

    }

    //Método para calcular perimetro y semiperimetro
    public void Calcular_per_semiper_isosceles(View view){
        String valor1_String = et_lado_a_isosceles.getText().toString();
        String valor2_String = et_lado_b_isosceles.getText().toString();
        String valor3_String = et_lado_c_isosceles.getText().toString();

        double valor1_double = Double.parseDouble(valor1_String);
        double valor2_double = Double.parseDouble(valor2_String);
        double valor3_double = Double.parseDouble(valor3_String);

        if(rb_perimetro_isosceles.isChecked() == true){
            double perimetro = valor1_double + valor2_double + valor3_double;
            String resultado = String.valueOf(perimetro);
            txt_resultado_per_sem_isosceles.setText("El perímetro del equilátero es: " + resultado);
        }else if(rb_semiperimetro_isosceles.isChecked() == true){
            double semiperimetro = (valor1_double + valor2_double + valor3_double)/2;
            String resultado = String.valueOf(semiperimetro);
            txt_resultado_per_sem_isosceles.setText("El semiperímetro del isósceles es: " + resultado);
        }
    }

    //Método para el botón regresar
    public void Regresar_triangulo_menu(View view){
        Intent regresar = new Intent(this, Triangulo.class);
        startActivity(regresar);
    }
}