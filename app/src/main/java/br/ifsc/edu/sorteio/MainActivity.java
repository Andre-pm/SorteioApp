package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editTextInicial,editTextFinal;
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInicial = findViewById(R.id.editTextInicial);
        editTextFinal = findViewById(R.id.editTextFinal);
        textViewResultado = findViewById(R.id.Resultado);
    }

    public void sorteiaNumero(View view) {


//        TextView textView = findViewById(R.id.editTextInicial);
//        TextView textView = findViewById(R.id.editTextFinal);
//        Button button = (Button)view;
//        button.setText("oi");

        int inicial = Integer.parseInt(editTextInicial.getText().toString());
        int Fim = Integer.parseInt(editTextFinal.getText().toString());
        int numeroSorteado = new Random().nextInt(((Fim - inicial) +1)+ inicial);
        textViewResultado.setText(Integer.toString(numeroSorteado));

    }
}
