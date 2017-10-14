/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.view;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Toshiba1
 */
@ManagedBean
@SessionScoped
public class UsuarioLoginView implements Serializable {

    private String username;

    private String password;

    private boolean logeado = false;
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogeado() {
        return logeado;
    }

    public void setLogeado(boolean logeado) {
        this.logeado = logeado;
    }
    
    public String logout() {
        return "index";
    }

    public String login() {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
        if ((username != null && username.equals("Administrador") && password != null && password.equals("admin123")) || (username != null && username.equals("Gerente") && password != null && password.equals("gerente123"))) {
            logeado = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bem-vindo", username);
            return "home";

        } else {
            logeado = false;
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Usuário ou senha inválidos",
                            "Selecione as credenciais certas"));
            return "index";
        }
    }
}
