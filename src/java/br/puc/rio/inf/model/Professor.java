/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.model;

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
  
}
