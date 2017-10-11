/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.model;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Toshiba1
 */

@ManagedBean
@SessionScoped
public class Professor extends Colaborador {
    
    private String afiliacao;
    private ArrayList<Orientacao> orientacoes = new ArrayList<>();

    public Professor(String afiliacao, String Id, String nome, String email) {
        super(Id, nome, email);
        this.afiliacao = afiliacao;
    }
    
    public Professor(){
        
    }

    public String getAfiliacao() {
        return afiliacao;
    }

    public void setAfiliacao(String afiliacao) {
        this.afiliacao = afiliacao;
    }

    public ArrayList<Orientacao> getOrientacoes() {
        return orientacoes;
    }

    public void setOrientacoes(ArrayList<Orientacao> orientacoes) {
        this.orientacoes = orientacoes;
    }
    
    public void addOrientacao(Orientacao orientacao){
        this.orientacoes.add(orientacao);
    }
  
}
