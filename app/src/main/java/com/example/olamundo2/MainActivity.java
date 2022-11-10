package com.example.olamundo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Ciclo de vida", "onCreate");
        Button copiar =  (Button) findViewById(R.id.botao);

        final EditText campo = (EditText) findViewById(R.id.campo);

        final TextView texto = (TextView) findViewById(R.id.texto);


        copiar.setOnClickListener( new View.OnClickListener(){

            @Override
            public  void onClick(View v){
                Log.i("Ciclo de vida", "Botão clicado");
                texto.setText(campo.getText());
            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Ciclo de vida", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Ciclo de vida", "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Ciclo de vida", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Ciclo de vida", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Ciclo de vida", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Ciclo de vida", "onDestroy");
    }
}