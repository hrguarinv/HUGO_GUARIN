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
public class Graduacao extends Colaborador {
    
    private String data;
    private Professor orientador;

        public Graduacao(String data, Professor orientador, String Id, String nome, String email) {
            super(Id, nome, email);
            this.data = data;
            this.orientador = orientador;
        }
        
        // metodos da clase graduacao

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Professor getOrientador() {
            return orientador;
        }

        public void setOrientador(Professor orientador) {
            this.orientador = orientador;
        }
    
}
