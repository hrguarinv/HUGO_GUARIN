/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.view;

import br.puc.rio.inf.controller.RecursosControlador;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.ToggleEvent;

/**
 *
 * @author Toshiba1
 */
@ManagedBean
public class FieldsetView {

    public void handleToggle(ToggleEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Seccao", "Visibilidade: " + event.getVisibility());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void verAlunosGrad() {
        Map<String, Object> options = new HashMap<>();
        options.put("resizable", false);
        RequestContext.getCurrentInstance().openDialog("ver_alunos_grad", options, null);
    }
    
    public void verAlunosPos() {
        Map<String, Object> options = new HashMap<>();
        options.put("resizable", false);
        RequestContext.getCurrentInstance().openDialog("ver_alunos_pos", options, null);
    }
    
    public void verProfessores() {
        RecursosControlador rc = new RecursosControlador();
        rc.ordenarPublicacoes();
        Map<String, Object> options = new HashMap<>();
        options.put("resizable", false);
        RequestContext.getCurrentInstance().openDialog("ver_professores", options, null);
    }
    
    public void verPesquisadores() {
        Map<String, Object> options = new HashMap<>();
        options.put("resizable", false);
        RequestContext.getCurrentInstance().openDialog("ver_pesquisadores", options, null);
    }
    
    public void verProjetos() {
        Map<String, Object> options = new HashMap<>();
        options.put("resizable", false);
        RequestContext.getCurrentInstance().openDialog("ver_projetos", options, null);
    } 
}
