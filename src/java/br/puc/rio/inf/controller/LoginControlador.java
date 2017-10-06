/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.controller;

import br.puc.rio.inf.model.Usuario;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Toshiba1
 */
@ManagedBean
@SessionScoped

public class LoginControlador implements Serializable{

    private Usuario usuario;
    private RecursosControlador recursosctr;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public RecursosControlador getRecursosctr() {
        return recursosctr;
    }

    public void setRecursosctr(RecursosControlador recursosctr) {
        this.recursosctr = recursosctr;
    }
    
    public LoginControlador() {
        usuario = new Usuario();
        recursosctr = new RecursosControlador();
    }

    public String verificar() {
                
        if (usuario.getNome().equals("")) {
            usuario.setMensagem("Digite o usuario");
            return null;
        } else if (usuario.getSenha().equals("")) {
            usuario.setMensagem("Digite a senha");
            return null;
        } else if (usuario.getNome().equals("Administrador") && usuario.getSenha().equals("admin123")) {
            usuario.setNome("Administrador");
            usuario.setSenha("admin123");
            usuario.setMensagem("Usuário válido");
            return "home";
//            return "Alocacao_participantes";
        } else if (usuario.getNome().equals("Gerente") && usuario.getSenha().equals("gerente123")) {
            usuario.setNome("Gerente");
            usuario.setSenha("gerente123");
            usuario.setMensagem("Usuário válido");
            return "Alocacao_participantes";
        } else {
            usuario.setMensagem("Usuario ou senha errada");
            return null;
        }
    }

}
