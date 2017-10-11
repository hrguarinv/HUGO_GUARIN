/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.model;

import java.util.ArrayList;

/**
 *
 * @author Toshiba1
 */
public class Colaborador {

    private String Id;
    private String nome;
    private String email;
    private ArrayList<Projeto> projetos = new ArrayList<>();
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();

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

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public void addProjeto(Projeto projeto){
        this.projetos.add(projeto);
    }
    
    public void addPublicacao(Publicacao publicacao){
        this.publicacoes.add(publicacao);
    }

    @Override
    public String toString() {
        return nome;
    }
}
