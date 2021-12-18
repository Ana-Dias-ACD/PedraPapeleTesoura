package com.example.pedrapapeletesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoSelecionado("pedra");

    }

    public void selecionadoPapel(View view){
        this.opcaoSelecionado("papel");

    }

    public void selecionadoTesoura(View view){
        this.opcaoSelecionado("pedra");

    }

    public void opcaoSelecionado(String opcaoSelecionado){
        ImageView imageView = findViewById(R.id.imageResultado);
        TextView textView   = findViewById(R.id.textResultado);

        int number = new Random().nextInt(3);
        String[] opcao  = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcao[number];

        switch (opcaoApp){
            case "pedra" :
                imageView.setImageResource(R.drawable.pedra);
                break;

            case "papel" :
                imageView.setImageResource(R.drawable.papel);
                break;

            case "tesoura" :
                imageView.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((opcaoApp == "tesoura" && opcaoSelecionado == "papel" ) ||
           (opcaoApp == "papel"   && opcaoSelecionado == "pedra" ) ||
                (opcaoApp == "pedra" && opcaoSelecionado == "tesoura")){
            textView.setText("Você Perdeu");

        } else if((opcaoSelecionado == "tesoura" && opcaoApp == "papel" ) ||
                (opcaoSelecionado == "papel"   && opcaoApp == "pedra" ) ||
                (opcaoSelecionado == "pedra" && opcaoApp == "tesoura")){
            textView.setText("Você Ganhou");
        }else {
            textView.setText("Empatamos");
        }

        System.out.println("item clicado: " + opcaoApp);
    }


}