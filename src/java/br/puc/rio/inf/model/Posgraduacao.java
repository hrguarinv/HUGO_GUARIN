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

    private String regCurso;
    private boolean tipo;

    public Posgraduacao(String Regcurso, boolean tipo, Orientacao orientacao, String data, String Id, String nome, String email) {
        super(orientacao, data, Id, nome, email);
        this.regCurso = Regcurso;
        this.tipo = tipo;
    }
    
    public Posgraduacao(){
        
    }

    public String getRegCurso() {
        return regCurso;
    }

    public void setRegCurso(String regCurso) {
        this.regCurso = regCurso;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
}
