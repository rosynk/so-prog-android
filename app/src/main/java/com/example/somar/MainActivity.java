package com.example.somar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText um;
    private EditText dois;
    private Button verificar;
    private Button soma;

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        um = findViewById(R.id.um);
        dois = findViewById(R.id.dois);
        verificar = findViewById(R.id.verificar);
        soma = findViewById(R.id.soma);
    }


}