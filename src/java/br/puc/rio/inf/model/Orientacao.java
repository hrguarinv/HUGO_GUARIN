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
public class Orientacao {
    
    private Professor profesor;
    private Graduacao graduacao;
    private Posgraduacao posgraduacao;  
    private String dissertacao;

    public Professor getProfesor() {
        return profesor;
    }

    public void setProfesor(Professor profesor) {
        this.profesor = profesor;
    }

    public Graduacao getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(Graduacao graduacao) {
        this.graduacao = graduacao;
    }

    public Posgraduacao getPosgraduacao() {
        return posgraduacao;
    }

    public void setPosgraduacao(Posgraduacao posgraduacao) {
        this.posgraduacao = posgraduacao;
    }

    public String getDissertacao() {
        return dissertacao;
    }

    public void setDissertacao(String dissertacao) {
        this.dissertacao = dissertacao;
    }   
}
