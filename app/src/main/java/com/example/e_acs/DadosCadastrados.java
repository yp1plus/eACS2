//By Yure Pablo and Gustavo Lopes em 03/09/2018

package com.example.e_acs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_acs.dto.Individuo;

public class DadosCadastrados extends AppCompatActivity {
    Individuo individuo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_cadastrados);

        individuo = (Individuo) getIntent().getExtras().getSerializable ("individuo");
        /* Mostra os dados coletados para confirmação*/
        TextView nome = this.findViewById(R.id.nomeCompletoConf2);
        nome.setText(individuo.getNome());

        TextView nCartao = this.findViewById(R.id.nCartaoSUSConf);
        nCartao.setText(individuo.getNCartao());

        TextView dataNascimento = this.findViewById(R.id.DataNascimentoConf);
        dataNascimento.setText(individuo.getDataNascimento());

        TextView sexo = this.findViewById(R.id.sexoConf);
        sexo.setText(individuo.getSexo());

        TextView apelido = this.findViewById(R.id.apelidoConf);
        apelido.setText(individuo.getApelido());

        TextView nomeMae = this.findViewById(R.id.nomeDaMaeConf);
        nomeMae.setText(individuo.getNomeMae());

        TextView NIS = this.findViewById(R.id.numNISConf);
        NIS.setText(individuo.getNumeroNIS());

        TextView nacionalidade = this.findViewById(R.id.nacionalidadeConf);
        nacionalidade.setText(individuo.getNacionalidade());

        TextView municipioNasc = this.findViewById(R.id.municipioNascimentoConf);
        municipioNasc.setText(individuo.getMunicipioNasc());

        TextView paisNasc = this.findViewById(R.id.paisDeNascimentoConf);
        paisNasc.setText(individuo.getPaisNascimento());

        TextView numTelefone = this.findViewById(R.id.numeroTelefoneConf);
        numTelefone.setText(individuo.getNumeroTelefone());

        TextView email = this.findViewById(R.id.emailConf);
        email.setText(individuo.getEmail());

        TextView situacaoConjugal = this.findViewById(R.id.situacaoConjugalConf);
        situacaoConjugal.setText(individuo.getSituacaoConjugal());

        TextView rFamiliar = this.findViewById(R.id.rFamiliarConf);
        rFamiliar.setText(individuo.getRFamiliar());

        TextView raca = this.findViewById(R.id.racaConf);
        raca.setText(individuo.getRaca());
    }
    public void onClick (View view){
        /* Salva os dados na base de dados*/
        individuo = (Individuo) getIntent().getExtras().getSerializable ("individuo");

        TelaInicialActivity.individuoRoomDatabase.individuoDAO().insertIndividuo(individuo);
        Toast.makeText(getApplicationContext(), "Indivíduo adicionado com sucesso", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(DadosCadastrados.this, ListaDeUsuarios.class);
        startActivity(intent);

    }


}
