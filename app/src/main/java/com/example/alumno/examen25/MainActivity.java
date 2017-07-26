package com.example.alumno.examen25;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et1);
        et3 = (EditText) findViewById(R.id.et1);
        et4 = (EditText) findViewById(R.id.et1);
        et4 = (EditText) findViewById(R.id.et1);
    }

    public void ConfirmarPasword(View view) {

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();
        Toast notificacion;

        if (valor1.endsWith("kevin") && valor2.equals("hernandez")) {


            Intent i = new Intent(this, Intereses.class);
            startActivity(i);


        } else {
            notificacion = Toast.makeText(this, "Error al ingresar", Toast.LENGTH_SHORT);
            notificacion.show();


        }
    }
}