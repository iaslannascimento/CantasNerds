package com.example.user.cantasnerds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarCantada(View view){
        String [] cantadas = {
            "Qual é, gato! Desativa esse firewall e deixa eu invadir seu coração",
            "Não sou o Yoshi, mas daria até minha vida por você",
            "Não existe placa de vídeo no mundo que possa reproduzir os gráficos de sua beleza",
            "Me chama de Projeto Científico e passa a noite perdendo a cabeça comigo",
            "Gata, aperta CTRL+ALT+DEL aí. Quando te vi, travei!",
            "Não sou um Jawa, mas meus olhos brilham quando te vejo",
            "Você não é o charmander, mas me deixa pegando fogo",
            "Meu amor é igual ao mapa de 'Minecraft': infinito e cheio de surpresas",
            "Se você fosse um jogo, te salvaria no meu coração",
            "Gata não sou o Gaara, mas tenho areia suficiente pra encher seu caminhão",
            "Eu não sou o Bob Esponja, mas adoraria morar na fenda do seu biquini",
            "Sua USB é compatível com meu PenDrive?",
            "Para tirar você da cabeça, só formatando!",
            "Pode ter certeza, sempre está em C:/Meu/Coração.",
            "Você é o. gif que anima minha vida.",
            "Me joga no Google, me chama de pesquisa e diz que eu sou tudo aquilo que você procurava!"

        };
        int n = new Random().nextInt(cantadas.length);
        TextView texto = (TextView) findViewById(R.id.cantada);
        texto.setText(cantadas[n]);
    }
}
