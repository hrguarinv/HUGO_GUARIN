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
public class Usuario {
    
    private String nome;
    private String senha;
    private String mensagem;
    
    public Usuario(String nome, String senha, String mensagem) {
        this.nome = nome;
        this.senha = senha;
        this.mensagem = mensagem;
    }
    
    public Usuario(){
        this.nome = "";
        this.senha = "";
        this.mensagem = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }   
    
}
