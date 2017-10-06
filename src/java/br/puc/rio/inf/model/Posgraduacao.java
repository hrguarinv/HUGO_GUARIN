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
public class Posgraduacao extends Colaborador {
    
     private String Regcurso;
        private Professor orientador;
        private String data;
        private boolean tipo;

        public Posgraduacao(String Regcurso, Professor orientador, String data, boolean tipo, String Id, String nome, String email) {
            super(Id, nome, email);
            this.Regcurso = Regcurso;
            this.orientador = orientador;
            this.data = data;
            this.tipo = tipo;
        }
        // metodos da clase Posgraduacao

        public String getRegcurso() {
            return Regcurso;
        }

        public void setRegcurso(String Regcurso) {
            this.Regcurso = Regcurso;
        }

        public Professor getOrientador() {
            return orientador;
        }

        public void setOrientador(Professor orientador) {
            this.orientador = orientador;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public boolean isTipo() {
            return tipo;
        }

        public void setTipo(boolean tipo) {
            this.tipo = tipo;
        }
}
