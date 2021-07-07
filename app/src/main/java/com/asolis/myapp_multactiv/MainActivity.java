package com.asolis.myapp_multactiv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edad1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edad1=findViewById(R.id.txtEdad);
    }

    public void procesa(View view) {
        String edad= edad1.getText().toString();
        int edadvalida=Integer.parseInt(edad);
        if(edadvalida >=18){
            Intent intent = new Intent(this, MA_Mayor.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this, MA_Menor.class);
            startActivity(intent);

        }
    }
}