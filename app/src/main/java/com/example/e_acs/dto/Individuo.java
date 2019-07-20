//By Yure Pablo and Gustavo Lopes em 03/09/2018

package com.example.e_acs.dto;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.io.Serializable;

@Entity
public class Individuo implements Serializable {
    @PrimaryKey
    private int id = 0;
    private String nome;
    private String nCartao;
    private String dataNascimento;
    private String sexo;
    private String apelido;
    private String nomeMae;
    private String nacionalidade;
    private String municipioNasc;
    private String paisNascimento;
    private String rFamiliar;
    private String numeroNIS;
    private String numeroTelefone;
    private String email;
    private String situacaoConjugal;
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNumeroNIS() {
        return numeroNIS;
    }

    public void setNumeroNIS(String numeroNIS) {
        this.numeroNIS = numeroNIS;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getMunicipioNasc() {
        return municipioNasc;
    }

    public void setMunicipioNasc(String municipioNasc) {
        this.municipioNasc = municipioNasc;
    }

    public String getPaisNascimento() {
        return paisNascimento;
    }

    public void setPaisNascimento(String paisNascimento) {
        this.paisNascimento = paisNascimento;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSituacaoConjugal() {
        return situacaoConjugal;
    }

    public void setSituacaoConjugal(String situacaoConjugal) {
        this.situacaoConjugal = situacaoConjugal;
    }

    public Individuo() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNCartao() {
        return nCartao;
    }

    public void setNCartao(String nCartao) {
        this.nCartao = nCartao;
    }

    public String getRFamiliar() {
        return rFamiliar;
    }

    public void setRFamiliar(String rFamiliar) {
        this.rFamiliar = rFamiliar;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
