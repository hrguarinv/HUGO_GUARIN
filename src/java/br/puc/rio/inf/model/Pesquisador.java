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
public class Pesquisador extends Colaborador {
    
     private String origem;

        public Pesquisador(String origem, String Id, String nome, String email) {
            super(Id, nome, email);
            this.origem = origem;
        }
        
        public Pesquisador(){
            
        }

        public String getOrigem() {
            return origem;
        }

        public void setOrigem(String origem) {
            this.origem = origem;
        }
    
}
