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
public class Posgraduacao extends Aluno {

    private String Regcurso;
    private boolean tipo;

    public Posgraduacao(String Regcurso, boolean tipo, Orientacao orientacao, String data, String Id, String nome, String email) {
        super(orientacao, data, Id, nome, email);
        this.Regcurso = Regcurso;
        this.tipo = tipo;
    }

    public String getRegcurso() {
        return Regcurso;
    }

    public void setRegcurso(String Regcurso) {
        this.Regcurso = Regcurso;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}
