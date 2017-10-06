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
public class Colaborador {

    private String Id;
    private String nome;
    private String email;

    public Colaborador(String Id, String nome, String email) {
        this.Id = Id;
        this.nome = nome;
        this.email = email;
    }
    
    public Colaborador(){
       
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
