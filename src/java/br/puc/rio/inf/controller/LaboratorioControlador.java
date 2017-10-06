/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.controller;

import br.puc.rio.inf.model.Laboratorio;
import br.puc.rio.inf.model.Professor;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Toshiba1
 */

@ManagedBean
@SessionScoped

public class LaboratorioControlador implements Serializable {
    
    private Laboratorio laboratorio;

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
    
    public LaboratorioControlador(){
        laboratorio = new Laboratorio();
       
    }    
}
