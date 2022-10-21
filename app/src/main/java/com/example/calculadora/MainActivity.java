package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    TextView tvResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.result);
        //numeros
        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        //funciones
        Button sumar = findViewById(R.id.btnmas);
        Button restar = findViewById(R.id.btnmenos);
        Button multiplicar = findViewById(R.id.btnpor);
        Button dividir = findViewById(R.id.btndivision);
        //extras
        Button mod = findViewById(R.id.btnmodulo);
        Button clean = findViewById(R.id.btnlimpiar);
        Button igual = findViewById(R.id.btnigual);
        Button point = findViewById(R.id.btnpunto);

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("00.");
                }else{
                    tvResultado.setText(tvResultado.getText() + ".");
                }
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("0");
                }else{
                    tvResultado.setText(tvResultado.getText() + "0");
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("1");
                }else{
                    tvResultado.setText(tvResultado.getText() + "1");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("2");
                }else{
                    tvResultado.setText(tvResultado.getText() + "2");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("3");
                }else{
                    tvResultado.setText(tvResultado.getText() + "3");
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("4");
                }else{
                    tvResultado.setText(tvResultado.getText() + "4");
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("5");
                }else{
                    tvResultado.setText(tvResultado.getText() + "5");
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("6");
                }else{
                    tvResultado.setText(tvResultado.getText() + "6");
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("7");
                }else{
                    tvResultado.setText(tvResultado.getText() + "7");
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("8");
                }else{
                    tvResultado.setText(tvResultado.getText() + "8");
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float valor = Float.parseFloat(tvResultado.getText().toString());
                if(valor == 0.0f)
                {
                    tvResultado.setText("9");
                }else{
                    tvResultado.setText(tvResultado.getText() + "9");
                }
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvResultado.setText("0");
                numero1 = 0.0f;
                numero2 = 0.0f;
                operacion="";
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = Float.parseFloat(tvResultado.getText().toString());
                operacion = "/";
                tvResultado.setText("0");
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = Float.parseFloat(tvResultado.getText().toString());
                operacion = "*";
                tvResultado.setText("0");
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = Float.parseFloat(tvResultado.getText().toString());
                operacion = "-";
                tvResultado.setText("0");
            }
        });

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = Float.parseFloat(tvResultado.getText().toString());
                operacion = "+";
                tvResultado.setText("0");
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero1 = Float.parseFloat(tvResultado.getText().toString());
                operacion = "%";
                tvResultado.setText("0");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero2 = Float.parseFloat(tvResultado.getText().toString());
                switch (operacion) {
                    case "/":
                        if (numero2 == 0.0f) {
                            tvResultado.setText("0");
                            Toast.makeText(MainActivity.this, "Operacion no valida", Toast.LENGTH_LONG).show();
                        } else {
                            float result = (numero1 / numero2);
                            tvResultado.setText(result + "");
                        }
                        break;
                    case "*": {
                        float result = (numero1 * numero2);
                        tvResultado.setText(result + "");
                        break;
                    }
                    case "+": {
                        float result = (numero1 + numero2);
                        tvResultado.setText(result + "");
                        break;
                    }
                    case "-": {
                        float result = (numero1 - numero2);
                        tvResultado.setText(result + "");
                        break;
                    }
                    case "%":{
                        float result = (numero1 % numero2);
                        tvResultado.setText(result + "");
                        break;
                    }
                }
            }
        });
    }


}