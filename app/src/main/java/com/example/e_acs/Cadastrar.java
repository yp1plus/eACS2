//By Yure Pablo and Gustavo Lopes em 03/09/2018

package com.example.e_acs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.e_acs.dto.Individuo;
import com.example.e_acs.dto.IndividuoDAO;

public class Cadastrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
    }

    public void cadastrarDados(View view) {
        /*Recebe os dados digitados pelo usuários*/
        final Individuo individuo = new Individuo();
        EditText nome = findViewById(R.id.txtNome);
        individuo.setNome(nome.getText().toString());

        EditText nCartao = findViewById(R.id.txtSUS);
        individuo.setNCartao(nCartao.getText().toString());

        EditText dataNascimento = findViewById(R.id.txtDataNascimento);
        individuo.setDataNascimento(dataNascimento.getText().toString());

        EditText  sexo= findViewById(R.id.txtSexo);
        individuo.setSexo(sexo.getText().toString());

        EditText apelido = findViewById(R.id.txtApelido);
        individuo.setApelido(apelido.getText().toString());

        EditText nomeDaMae = findViewById(R.id.txtNomeMae);
        individuo.setNomeMae(nomeDaMae.getText().toString());

        EditText nNIS = findViewById(R.id.txtNIS);
        individuo.setNumeroNIS(nNIS.getText().toString());

        EditText nacionalidade = findViewById(R.id.txtNacionalidade);
        individuo.setNacionalidade(nacionalidade.getText().toString());

        EditText municipioNascimento = findViewById(R.id.txtMunicipioNas);
        individuo.setMunicipioNasc(municipioNascimento.getText().toString());

        EditText paisNascimento = findViewById(R.id.txtPaisNascimento);
        individuo.setPaisNascimento(paisNascimento.getText().toString());

        EditText numeroTelefone = findViewById(R.id.txtNumeroTelefone);
        individuo.setNumeroTelefone(numeroTelefone.getText().toString());

        EditText email = findViewById(R.id.txtEmail);
        individuo.setEmail(email.getText().toString());

        EditText situacaoConjugal = findViewById(R.id.txtSituacaoConjugal);
        individuo.setSituacaoConjugal(situacaoConjugal.getText().toString());

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.gpRespon);
        individuo.setRFamiliar(((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString());

        radioGroup = (RadioGroup) findViewById(R.id.gpRaca);
        individuo.setRaca(((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString());

        /*Abre outra página*/
        Intent dados = new Intent (this, DadosCadastrados.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("individuo", individuo);
        dados.putExtras(bundle);
        startActivity(dados);


    }
}
