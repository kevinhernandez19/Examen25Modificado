package com.example.alumno.examen25;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Intereses extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;

    private RadioButton rg1, rg2, rg3, rg4, rg5, rg6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intereses);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv1 = (TextView) findViewById(R.id.tv1);
        rg1 = (RadioButton) findViewById(R.id.rg1);
        rg2 = (RadioButton) findViewById(R.id.rg2);
        rg3 = (RadioButton) findViewById(R.id.rg3);
        rg4 = (RadioButton) findViewById(R.id.rg4);
        rg5 = (RadioButton) findViewById(R.id.rg5);
        rg6 = (RadioButton) findViewById(R.id.rg6);

    }

    public void Enviar(View view) {
        String res1, res2, res3;
        if(rg1.isChecked())
            res1 = "android";
        else
             res1 ="";
        if(rg3.isChecked())
            res2 = "Java si";
        else
            res2 ="";
        if(rg5.isChecked())
            res3 ="Spring";
        else
             res3 ="";

        Toast notificacion;
        notificacion = Toast.makeText(this,"Preferencias listas para monitoreo " + res1 + res2 + res3 ,Toast.LENGTH_SHORT);
        notificacion.show();


    }
}
