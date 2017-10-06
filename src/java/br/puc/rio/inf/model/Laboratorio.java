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

public class Laboratorio {
    
    private String name;
    private Colaborador colaborador[];

    public Laboratorio(String name, Colaborador[] colaborador) {
        this.name = name;
        this.colaborador = colaborador;
    }
    
    public Laboratorio(){
        this.name = "Engenharia de Software PUC-RIO";
        this.colaborador = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colaborador[] getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador[] colaborador) {
        this.colaborador = colaborador;
    }
    
}
