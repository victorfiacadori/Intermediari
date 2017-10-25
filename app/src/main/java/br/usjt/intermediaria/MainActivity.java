package br.usjt.intermediaria;
// Nome Victor Hugo Fiacadori
//RA: 201505534
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static br.usjt.intermediaria.R.id.telefone_message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public final static String EXTRA_MESSAGE =
            "br.usjt.Intermediaria.MESSAGE";

    public void sendMessage(View view){
        Intent intent = new Intent(this, SegundaTela.class);
        String message = "Bem vindo :"+telefone_message;
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
