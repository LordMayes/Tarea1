package com.example.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtnumero1, txtnumero2;
    TextView txtresultado;
    Button btnsuma,btnresta,btndivision,btnmultiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnumero1 = (EditText) findViewById(R.id.txtnumero1);
        txtresultado = (TextView) findViewById(R.id.txtresultado);
        txtnumero2 = (EditText) findViewById(R.id.txtnumero2);
        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btndivision = (Button) findViewById(R.id.btndivision);
        btnmultiplicacion = (Button) findViewById(R.id.btnmultiplicacion);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txtnumero1.getText().toString());
                int valor2 = Integer.parseInt(txtnumero2.getText().toString());
                int total = valor1 + valor2;
                txtresultado.setText("La Suma es: "+total);
                Toast.makeText(MainActivity.this, txtresultado.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txtnumero1.getText().toString());
                int valor2 = Integer.parseInt(txtnumero2.getText().toString());
                int total = valor1 - valor2;
                txtresultado.setText("La Resta es: "+total);
                Toast.makeText(MainActivity.this, txtresultado.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txtnumero1.getText().toString());
                int valor2 = Integer.parseInt(txtnumero2.getText().toString());
                int total = valor1 / valor2;
                txtresultado.setText("La Division es: "+total);
                Toast.makeText(MainActivity.this, txtresultado.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(txtnumero1.getText().toString());
                int valor2 = Integer.parseInt(txtnumero2.getText().toString());
                int total = valor1 * valor2;
                txtresultado.setText("La Multiplicacion es: "+total);
                Toast.makeText(MainActivity.this, txtresultado.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}