package com.asolis.myapp_multactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MA_Mayor extends AppCompatActivity {
    private TextView mult1,mult2,resultadoMult;
    private int nummult1 = 0;
    private int nummult2 = 0;
    private int multiplicacion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_mayor);
        mult1= findViewById(R.id.mult1);
        mult2= findViewById(R.id.mult2);
        resultadoMult = findViewById(R.id.TxtCalculaMulti);
        
        //calcula valores random

        Random rand = new Random();
        nummult1 = (int) rand.nextInt(10);
        nummult2 = (int) rand.nextInt(10);

        mult1.setText(String.valueOf(nummult1));
        mult2.setText(String.valueOf(nummult2));

       
    }

    public void comparaMult(View view) {
        int total_multi = nummult1*nummult2;
        String recibemult = resultadoMult.getText().toString();
        multiplicacion = Integer.parseInt(recibemult);
        if(total_multi==multiplicacion){
            Toast.makeText(this, "CORRECTO, YA ERES TODO UN ADULTO", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "HUY..SE TE OLVIDARON LAS TABLAS DE MULTIPLICAR, SIGUE INTENTANDO", Toast.LENGTH_SHORT).show();
        }

    }
}