package com.example.biomedida;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText peso;
    private EditText altura;
    private TextView res;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        peso = findViewById(R.id.peso);
        altura = findViewById(R.id.altura);
        res = findViewById(R.id.res);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //FUNÇÃO
    @SuppressLint({"SetTextI18n","DefaultLocale"})
    public void calcular(View view){
       double vpeso = Double.parseDouble(peso.getText().toString());
       double valtura = Double.parseDouble(altura.getText().toString());

       double imc =  vpeso / (valtura * valtura);

       String classificacao;

       if (imc < 18.5){
           classificacao = "Abaixo do peso!";
       } else if (imc < 25) {
           classificacao = "Peso ideal!";
       } else if (imc < 30) {
           classificacao = "Acima do peso!";
       } else if (imc < 35) {
           classificacao = "Obesidade grau I!";
       } else if (imc < 40) {
           classificacao = "Obesidade grau II!";
       }else {
           classificacao = "Obesidade grau III!";
       }

       res.setText("IMC: " +String.format("%.2f", imc)+ "\n" + classificacao);
    }

}