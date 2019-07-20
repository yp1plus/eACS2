//By Yure Pablo and Gustavo Lopes em 03/09/2018

package com.example.e_acs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.e_acs.dto.Familia;
import com.example.e_acs.dto.Individuo;

public class CadastrarFamilia extends AppCompatActivity {
    final Familia familia = new Familia();
    Individuo [] individuo;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_familia);

    }

    public void onClickCadastrar (View view){
        /*Recebe os dados do usuários e armazena no banco de dados*/
        EditText id = findViewById(R.id.txtIdFamilia);
        familia.setId(Integer.parseInt(id.getText().toString()));
        EditText nome = findViewById(R.id.txtNomeIndividuo);
        familia.setNome(nome.getText().toString());
        EditText quantInd = findViewById(R.id.txtQuantIndividuos);
        familia.setQuantIndividuos(Integer.parseInt(quantInd.getText().toString()));
        familia.setIndividuo(individuo);

        TelaInicialActivity.individuoRoomDatabase.familiaDAO().insertFamilia(familia);
        Toast.makeText(getApplicationContext(), "Família adicionada com sucesso", Toast.LENGTH_SHORT).show();

    }

    public void onClickAdicionar (View view){
        /*Adiciona um indíviduo à família*/
        EditText quantInd = findViewById(R.id.txtQuantIndividuos);
        individuo = new Individuo [Integer.parseInt(quantInd.getText().toString())];

        EditText nomeInd = findViewById(R.id.txtNomeIndividuo);
        individuo [i] = TelaInicialActivity.individuoRoomDatabase.individuoDAO().findIndividuo(nomeInd.getText().toString());
        i++;
        nomeInd.setText("");

        Toast.makeText(getApplicationContext(), "Indivíduo adicionado à família com sucesso", Toast.LENGTH_SHORT).show();

    }
}
