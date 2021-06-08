package com.example.cadastrodeitens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    ArrayList<String> dados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.itens);
        ArrayList<String> equipes = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, equipes);
        lista.setAdapter(arrayAdapter);

    }

    private ArrayList<String> preencherDados(){
        dados = new ArrayList<String>();
        dados.add("Banana");
        dados.add("Uva");
        dados.add("Abacaxi");
        dados.add("Melancia");
        dados.add("Amora");
        return dados;
}

    public void adicionar(View view) {
        String n = nome.getText().toString();
        dados.add(n);

    }
    public void Remover() {
        dados.remove("Banana");
    }
}