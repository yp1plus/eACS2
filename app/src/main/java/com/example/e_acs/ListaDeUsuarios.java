//By Yure Pablo and Gustavo Lopes em 03/09/2018

package com.example.e_acs;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.e_acs.dto.Individuo;
import com.example.e_acs.dto.IndividuoRoomDatabase;

import java.util.List;

public class ListaDeUsuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*Mostra lista de usuários cadastrados com ID e Nome*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_usuarios);

        TextView lista = this.findViewById(R.id.listaUsuarios);
        List<Individuo> individuos = TelaInicialActivity.individuoRoomDatabase.individuoDAO().getAllIndividuos();

        String info = "";

        for (Individuo indv : individuos){
            info = info+"\n\n Id: "+indv.getId()+"\n Nome: "+indv.getNome();

        }

        lista.setText(info);



    }
}
