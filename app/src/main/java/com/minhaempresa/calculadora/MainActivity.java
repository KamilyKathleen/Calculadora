package com.minhaempresa.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numero1EditText;
    EditText numero2EditText;
    Button adicaoButton;
    Button subtracaoButton;
    Button multiplicacaoButton;
    Button divisaoButton;
    TextView resultadoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vincularComponentes();
        criarListeners();
    }
    private void vincularComponentes() {
        numero1EditText = findViewById(R.id.numero1EditText);
        numero2EditText = findViewById(R.id.numero2EditText);
        adicaoButton = findViewById(R.id.adicaoButton);
        subtracaoButton = findViewById(R.id.subtracaoButton);
        multiplicacaoButton = findViewById(R.id.multiplicacaoButton);
        divisaoButton = findViewById(R.id.divisaoButton);
        resultadoTextView = findViewById(R.id.resultadoTextView);
    }
    private void criarListeners() {
        adicaoButton.setOnClickListener(evt->adicionar());
        subtracaoButton.setOnClickListener(evt->subtrair());
        multiplicacaoButton.setOnClickListener(evt->multiplicar());
        divisaoButton.setOnClickListener(evt->dividir());
    }
    private void adicionar() {
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();
        if(numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return;
        }
        double numero1 = Double.parseDouble(numero1String);
        double numero2 = Double.parseDouble(numero2String);
        double resultado = numero1 + numero2;
        resultadoTextView.setText(String.valueOf(resultado));
    }
    private void subtrair() {
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();
        if(numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return;
        }
        double numero1 = Double.parseDouble(numero1String);
        double numero2 = Double.parseDouble(numero2String);
        double resultado = numero1 - numero2;
        resultadoTextView.setText(String.valueOf(resultado));
    }
    private void multiplicar() {
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();
        if(numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return;
        }
        double numero1 = Double.parseDouble(numero1String);
        double numero2 = Double.parseDouble(numero2String);
        double resultado = numero1 * numero2;
        resultadoTextView.setText(String.valueOf(resultado));
    }
    private void dividir() {
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();
        if(numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números:", Toast.LENGTH_LONG).show();
            return;
        }
        double numero1 = Double.parseDouble(numero1String);
        double numero2 = Double.parseDouble(numero2String);
        if(numero2==0) {
            Toast.makeText(this, "Não é possível dividir por 0", Toast.LENGTH_LONG).show();
            return;
        }
        double resultado = numero1 / numero2;
        resultadoTextView.setText(String.valueOf(resultado));
    }
}