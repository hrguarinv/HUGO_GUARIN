/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.model;

/**
 *
 * @author Toshiba1
 */
public class Aluno extends Colaborador {
    
    private Orientacao orientacao;
    private String data;

    public Aluno(Orientacao orientacao, String data, String Id, String nome, String email) {
        super(Id, nome, email);
        this.orientacao = orientacao;
        this.data = data;
    }

    public Aluno(){
        
    }

    public Orientacao getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(Orientacao orientacao) {
        this.orientacao = orientacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
