/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Toshiba1
 */
public class Projeto {
    private String id;
    private String titulo;
    private String dataInicio;
    private String dataTermino;
    private String agenciaFinanciadora;
    private String valor;
    private String objetivo;
    private String descricao;
    private String status;
    private ArrayList<Professor> profesores = new ArrayList<>();
    private ArrayList<Graduacao> alunos_graduacao = new ArrayList<>();
    private ArrayList<Posgraduacao> alunos_pos = new ArrayList<>();
    private ArrayList<Pesquisador> pesquisadores = new ArrayList<>();

    public Projeto(String id, String titulo, String dataInicio, String dataTermino, String agenciaFinanciadora, String valor, String objetivo, String descricao, String status) {
        this.id = id;
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.agenciaFinanciadora = agenciaFinanciadora;
        this.valor = valor;
        this.objetivo = objetivo;
        this.descricao = descricao;
        this.status = status;
    }

    public Projeto(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getAgenciaFinanciadora() {
        return agenciaFinanciadora;
    }

    public void setAgenciaFinanciadora(String agenciaFinanciadora) {
        this.agenciaFinanciadora = agenciaFinanciadora;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public ArrayList<Posgraduacao> getAlunos_pos() {
        return alunos_pos;
    }

    public void setAlunos_pos(ArrayList<Posgraduacao> alunos_pos) {
        this.alunos_pos = alunos_pos;
    }

    public ArrayList<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void setPesquisadores(ArrayList<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }
    
    public void addProfesor(Professor profesor){
        this.profesores.add(profesor);
    }
    
    public void addGraduacao(Graduacao graduacao){
        this.alunos_graduacao.add(graduacao);
    }
    
    public void addPosgraduacao(Posgraduacao pos){
        this.alunos_pos.add(pos);
    }
    
    public void addPesquisador(Pesquisador pesquisador){
        this.pesquisadores.add(pesquisador);
    }
}
