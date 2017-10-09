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
public class Publicacao {

    private int id;
    private String titulo;
    private ArrayList<Professor> profesores = new ArrayList<>();
    private ArrayList<Graduacao> alunos_graduacao = new ArrayList<>();;
    private ArrayList<Posgraduacao> alunos_posgraduacao = new ArrayList<>();;
    private ArrayList<Pesquisador> pesquisadores = new ArrayList<>();;
    private String conferencia;
    private String ano;
    private Projeto projeto;

    public Publicacao(int id, String titulo, String conferencia, String ano, Projeto projeto) {
        this.id = id;
        this.titulo = titulo;
        this.conferencia = conferencia;
        this.ano = ano;
        this.projeto = projeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Professor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Professor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Graduacao> getAlunos_graduacao() {
        return alunos_graduacao;
    }

    public void setAlunos_graduacao(ArrayList<Graduacao> alunos_graduacao) {
        this.alunos_graduacao = alunos_graduacao;
    }

    public ArrayList<Posgraduacao> getAlunos_posgraduacao() {
        return alunos_posgraduacao;
    }

    public void setAlunos_posgraduacao(ArrayList<Posgraduacao> alunos_posgraduacao) {
        this.alunos_posgraduacao = alunos_posgraduacao;
    }

    public ArrayList<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void setPesquisadores(ArrayList<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

    public String getConferencia() {
        return conferencia;
    }

    public void setConferencia(String conferencia) {
        this.conferencia = conferencia;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void addProfesor(Professor profesor) {
        this.profesores.add(profesor);
    }

    public void addGraduacao(Graduacao graduacao) {
        this.alunos_graduacao.add(graduacao);
    }

    public void addPosgraduacao(Posgraduacao pos) {
        this.alunos_posgraduacao.add(pos);
    }

    public void addPesquisador(Pesquisador pesquisador) {
        this.pesquisadores.add(pesquisador);
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
}
