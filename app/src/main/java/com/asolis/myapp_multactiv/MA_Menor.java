package com.asolis.myapp_multactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MA_Menor extends AppCompatActivity {
private TextView sum1,sum2,resulSuma;
private int numsuma1 = 0;
private int numsuma2 = 0;
private int resultadoSuma = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_menor);
        sum1 = findViewById(R.id.sum1);
        sum2= findViewById(R.id.sum2);
        resulSuma = findViewById(R.id.TxtDigitaSuma);

        Random rand = new Random();
           numsuma1 = (int) rand.nextInt(10);
           numsuma2 = (int) rand.nextInt(10);

           sum1.setText(String.valueOf(numsuma1));
           sum2.setText(String.valueOf(numsuma2));


    }

    public void compara(View view) {
        int total_suma = numsuma1+numsuma2;
        String suma = resulSuma.getText().toString();
        resultadoSuma = Integer.parseInt(suma);
        if(total_suma==resultadoSuma){
            Toast.makeText(this, "CORRECTO, YA NO ERES UN BEBE", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "VALOR INCORRECTO, SIGUE INTENTANDO", Toast.LENGTH_SHORT).show();

        }

    }
}