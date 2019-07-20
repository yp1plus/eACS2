//By Yure Pablo and Gustavo Lopes em 03/09/2018

package com.example.e_acs.dto;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
@Entity
public class Familia implements Serializable {
    @PrimaryKey
    private int id;
    private String nome;
    private int quantIndividuos;
    private Individuo[] individuo;

    public Individuo[] getIndividuo() {
        return individuo;
    }

    public void setIndividuo(Individuo[] individuo) {
        this.individuo = individuo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantIndividuos() {
        return quantIndividuos;

    }

    public void setQuantIndividuos(int quantIndividuos) {
        this.quantIndividuos = quantIndividuos;
        individuo = new Individuo [quantIndividuos];
    }


}
