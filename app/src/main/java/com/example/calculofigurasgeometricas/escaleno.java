package com.example.calculofigurasgeometricas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class escaleno extends AppCompatActivity {

    //creación y encapsulación de los objetos que usaremos en este activity
    private EditText et_base_b_escaleno, et_altura_h_escaleno, et_lado_a_escaleno, et_lado_b_escaleno, et_lado_c_escaleno;
    private RadioButton rb_perimetro_escaleno, rb_semiperimetro_escaleno;
    private TextView txt_resultado_area_escaleno, txt_resultado_per_sem_escaleno;

    //Método onCreate
    //Crear objetos que nos permitan recuperar y encontrar a través de su ID a nuestros componentes que creamos en el activity_escaleno.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escaleno);

        et_base_b_escaleno = (EditText)findViewById(R.id.et_base_b_escaleno);
        et_altura_h_escaleno = (EditText)findViewById(R.id.et_altura_h_escaleno);
        et_lado_a_escaleno = (EditText)findViewById(R.id.et_lado_a_escaleno);
        et_lado_b_escaleno = (EditText)findViewById(R.id.et_lado_b_escaleno);
        et_lado_c_escaleno = (EditText)findViewById(R.id.et_lado_c_escaleno);
        rb_perimetro_escaleno = (RadioButton)findViewById(R.id.rb_perimetro_escaleno);
        rb_semiperimetro_escaleno = (RadioButton)findViewById(R.id.rb_semiperimetro_escaleno);
        txt_resultado_area_escaleno = (TextView)findViewById(R.id.txt_resultado_area_escaleno);
        txt_resultado_per_sem_escaleno = (TextView)findViewById(R.id.txt_resultado_per_sem_escaleno);
    }

    //Método para calcular area
    public void Calcular_area_escaleno(View view){
        String valor1_String = et_base_b_escaleno.getText().toString();
        String valor2_String = et_altura_h_escaleno.getText().toString();

        double valor1_double = Double.parseDouble(valor1_String);
        double valor2_double = Double.parseDouble(valor2_String);

        double area = (valor1_double * valor2_double)/2;
        String resultado = String.valueOf(area);
        txt_resultado_area_escaleno.setText("El área del equilatero es: " + resultado);

    }

    //Método para calcular perimetro y semiperimetro
    public void Calcular_per_semiper_escaleno(View view){
        String valor1_String = et_lado_a_escaleno.getText().toString();
        String valor2_String = et_lado_b_escaleno.getText().toString();
        String valor3_String = et_lado_c_escaleno.getText().toString();

        double valor1_double = Double.parseDouble(valor1_String);
        double valor2_double = Double.parseDouble(valor2_String);
        double valor3_double = Double.parseDouble(valor3_String);

        if(rb_perimetro_escaleno.isChecked() == true){
            double perimetro = valor1_double + valor2_double + valor3_double;
            String resultado = String.valueOf(perimetro);
            txt_resultado_per_sem_escaleno.setText("El perímetro del escaleno es: " + resultado);
        }else if(rb_semiperimetro_escaleno.isChecked() == true){
            double semiperimetro = (valor1_double + valor2_double + valor3_double)/2;
            String resultado = String.valueOf(semiperimetro);
            txt_resultado_per_sem_escaleno.setText("El semiperímetro del escaleno es: " + resultado);
        }
    }

    //Método para el botón regresar
    public void Regresar_triangulo_menu(View view){
        Intent regresar = new Intent(this, Triangulo.class);
        startActivity(regresar);
    }
}