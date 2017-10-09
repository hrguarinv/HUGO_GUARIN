/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.controller;

import br.puc.rio.inf.model.Graduacao;
import br.puc.rio.inf.model.Pesquisador;
import br.puc.rio.inf.model.Posgraduacao;
import br.puc.rio.inf.model.Professor;
import br.puc.rio.inf.model.Projeto;
import br.puc.rio.inf.model.Publicacao;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Toshiba1
 */
@ManagedBean
@SessionScoped
public class RecursosControlador implements Serializable {

    private String profesor = null;
    private ArrayList<Professor> professores = new ArrayList<>();

    private String aluno_graduacao = null;
    private ArrayList<Graduacao> alunos_graduacao = new ArrayList<>();

    private String aluno_posgraduacao = null;
    private ArrayList<Posgraduacao> alunos_posgraduacao = new ArrayList<>();

    private String pesquisador = null;
    private ArrayList<Pesquisador> pesquisadores = new ArrayList<>();

    private String mensagem = null;
    private String mensagemStatus = null;
    private String opcaoStatus = null;
    private String projeto = null;
    private ArrayList<Projeto> projetos = new ArrayList<>();

    private int id_pub = 1;
    private String tituloPub = null;
    private String conferenciaPub = null;
    private String anoPub = null;
    private String projetoPub = null;
    private String professorPub = null;
    private String aluno_pos_pub = null;
    private String aluno_graduacao_pub = null;
    private String pesquisador_pub = null;
    private String mensagem_pub;
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public String getAluno_graduacao() {
        return aluno_graduacao;
    }

    public void setAluno_graduacao(String aluno_graduacao) {
        this.aluno_graduacao = aluno_graduacao;
    }

    public String getAluno_posgraduacao() {
        return aluno_posgraduacao;
    }

    public void setAluno_posgraduacao(String aluno_posgraduacao) {
        this.aluno_posgraduacao = aluno_posgraduacao;
    }

    public String getPesquisador() {
        return pesquisador;
    }

    public void setPesquisador(String pesquisador) {
        this.pesquisador = pesquisador;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Graduacao> getAlunos_graduacao() {
        return alunos_graduacao;
    }

    public void setAlunos_graduacao(ArrayList<Graduacao> alunos_graduacao) {
        this.alunos_graduacao = alunos_graduacao;
    }

    public ArrayList<Posgraduacao> getAlunos_posgraduacao() {
        return alunos_posgraduacao;
    }

    public void setAlunos_posgraduacao(ArrayList<Posgraduacao> alunos_posgraduacao) {
        this.alunos_posgraduacao = alunos_posgraduacao;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    public ArrayList<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void setPesquisadores(ArrayList<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getOpcaoStatus() {
        return opcaoStatus;
    }

    public void setOpcaoStatus(String opcaoStatus) {
        this.opcaoStatus = opcaoStatus;
    }

    public String getMensagemStatus() {
        return mensagemStatus;
    }

    public void setMensagemStatus(String mensagemStatus) {
        this.mensagemStatus = mensagemStatus;
    }

    public String getTituloPub() {
        return tituloPub;
    }

    public void setTituloPub(String tituloPub) {
        this.tituloPub = tituloPub;
    }

    public String getConferenciaPub() {
        return conferenciaPub;
    }

    public void setConferenciaPub(String conferenciaPub) {
        this.conferenciaPub = conferenciaPub;
    }

    public String getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(String anoPub) {
        this.anoPub = anoPub;
    }

    public String getProjetoPub() {
        return projetoPub;
    }

    public void setProjetoPub(String projetoPub) {
        this.projetoPub = projetoPub;
    }

    public String getProfessorPub() {
        return professorPub;
    }

    public void setProfessorPub(String professorPub) {
        this.professorPub = professorPub;
    }

    public String getAluno_pos_pub() {
        return aluno_pos_pub;
    }

    public void setAluno_pos_pub(String aluno_pos_pub) {
        this.aluno_pos_pub = aluno_pos_pub;
    }

    public String getAluno_graduacao_pub() {
        return aluno_graduacao_pub;
    }

    public void setAluno_graduacao_pub(String aluno_graduacao_pub) {
        this.aluno_graduacao_pub = aluno_graduacao_pub;
    }

    public String getPesquisador_pub() {
        return pesquisador_pub;
    }

    public void setPesquisador_pub(String pesquisador_pub) {
        this.pesquisador_pub = pesquisador_pub;
    }

    public String getMensagem_pub() {
        return mensagem_pub;
    }

    public void setMensagem_pub(String mensagem_pub) {
        this.mensagem_pub = mensagem_pub;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }

    public RecursosControlador(String tituloPub, String conferenciaPub, String anoPub, String projetoPub, String professorPub, String aluno_pos_pub, String aluno_graduacao_pub, String pesquisador_pub, String mensagem_pub) {
        this.tituloPub = tituloPub;
        this.conferenciaPub = conferenciaPub;
        this.anoPub = anoPub;
        this.projetoPub = projetoPub;
        this.professorPub = professorPub;
        this.aluno_pos_pub = aluno_pos_pub;
        this.aluno_graduacao_pub = aluno_graduacao_pub;
        this.pesquisador_pub = pesquisador_pub;
        this.mensagem_pub = mensagem_pub;
    }

    public RecursosControlador() {

    }

    @PostConstruct
    public void init() {
        Professor prof1 = new Professor("PUC-Rio", "100", "Prof.Carlos", "carlos@email.br");
        Professor prof2 = new Professor("PUC-RIO", "101", "Prof.Arnaldo", "arnaldo@email.br");
        Professor prof3 = new Professor("PUC-Rio", "102", "Prof.Paulo", "paulo@email.br");

        Graduacao grad1 = new Graduacao("01/03/2006", prof1, "1001", "Maria", "maria@email.br");
        Graduacao grad2 = new Graduacao("01/03/2005", prof2, "1002", "João", "joao@email.br");
        Graduacao grad3 = new Graduacao("01/03/2006", prof2, "1003", "Mario", "mario@email.br");

        Posgraduacao posg1 = new Posgraduacao("Parcial", prof1, "01/03/2006", true, "1004", "Soraia", "soraia@email.br");
        Posgraduacao posg2 = new Posgraduacao("Parcial", prof3, "01/06/2007", true, "1005", "Rafael", "rafael@email.br");
        Posgraduacao posg3 = new Posgraduacao("Integral", prof3, "01/06/2007", true, "1006", "Marta", "marta@email.br");
        Posgraduacao posg4 = new Posgraduacao("Integral", prof3, "01/03/2006", true, "1007", "Daniel", "Daniel@email.br");

        Posgraduacao posg5 = new Posgraduacao("Integral", prof1, "01/03/2005", false, "1008", "Michael", "Michael@email.br");
        Posgraduacao posg6 = new Posgraduacao("Integral", prof1, "01/06/2004", false, "1009", "Bia", "Bia@email.br");

        Pesquisador pesquisador1 = new Pesquisador("PUC-RIO", "1001", "Thiago", "thiago@email.br");

        Projeto projeto1 = new Projeto("20", "Engenharia de Software para Sistemas Multi-Agentes (ESMA)",
                "02/02/2003", "02/02/2010", "FPCL", "R$ 300.000",
                "O objetivo geral deste projeto é desenvolver os fundamentos e as tecnologias da ESSMA",
                "Pesquisar, aplicar e avaliar técnicas de desenvolvimiento de software para sistmas multi-agentes", "Em Elaboracao");

        Projeto projeto2 = new Projeto("30", "Engenharia de Software Orientada a Aspectos (ESOA)",
                "02/02/2005", "02/12/2011", "FPCL", "R$ 190.000",
                "O objetivo geral deste projeto é desenvolver os fundamentos e as tecnologias da ESOA",
                "Pesquisar, aplicar e avaliar técnicas de desenvolvimiento de software orientado à aspectos", "Em Elaboracao");

        Projeto projeto3 = new Projeto("40", "Qualidade de Software", "02/05/2006", "02/10/2009", "FPCL", "R$ 100.000",
                "O objetivo geral deste projeto é desenvolver os fundamentos e as tecnologias para desenvolvimento de software com qualidade",
                "Pesquisar, aplicar e avaliar técnicas para qualidade em desenvolvimento de software", "Concluido");

        Projeto projeto4 = new Projeto("50", "Model-driven Software Product Lines Development", null, null, "FPCL", "R$ 500.000",
                "O objetivo geral deste projeto é desenvolver técnicas de engenharia de software dirigadas a modelos para o desenvolvimento de linhas de produtos de software",
                "Pesquisar, aplicar e avaliar técnicas para o desenvolvimento de linhas de produtos de software", "Em Andamento");

        Projeto projeto5 = new Projeto("60", "Self-organizing Multi-agent Systems", "15/07/2008", "02/10/2010", "FPCL", "R$ 150.000",
                "O objetivo geral deste projeto é desenvolver sistemas multi-agentes auto-organizaveis",
                "Pesquisar, aplicar e avaliar técnicas para o desenvolvimento de sistemas multi-agentes auto-organizáveis", null);

        professores.add(prof1);
        professores.add(prof2);
        professores.add(prof3);

        alunos_graduacao.add(grad1);
        alunos_graduacao.add(grad2);
        alunos_graduacao.add(grad3);

        alunos_posgraduacao.add(posg1);
        alunos_posgraduacao.add(posg2);
        alunos_posgraduacao.add(posg3);
        alunos_posgraduacao.add(posg4);
        alunos_posgraduacao.add(posg5);
        alunos_posgraduacao.add(posg6);

        pesquisadores.add(pesquisador1);

        projeto1.addProfesor(prof1);
        prof1.addProjeto(projeto1);

        projeto1.addGraduacao(grad2);
        grad2.addProjeto(projeto1);

        projeto1.addGraduacao(grad3);
        grad3.addProjeto(projeto1);

        projeto1.addPosgraduacao(posg2);
        posg2.addProjeto(projeto1);

        projeto1.addPosgraduacao(posg3);
        posg3.addProjeto(projeto1);

        projeto1.addPosgraduacao(posg5);
        posg5.addProjeto(projeto1);

        projeto2.addProfesor(prof1);
        prof1.addProjeto(projeto2);

        projeto2.addGraduacao(grad1);
        grad1.addProjeto(projeto2);

        projeto2.addGraduacao(grad2);
        grad2.addProjeto(projeto2);

        projeto2.addPosgraduacao(posg1);
        posg1.addProjeto(projeto2);

        projeto2.addPosgraduacao(posg3);
        posg3.addProjeto(projeto2);

        projeto2.addPosgraduacao(posg5);
        posg5.addProjeto(projeto2);

        projeto3.addProfesor(prof2);
        prof2.addProjeto(projeto3);

        projeto3.addProfesor(prof3);
        prof3.addProjeto(projeto3);

        projeto3.addPesquisador(pesquisador1);
        pesquisador1.addProjeto(projeto3);

        projeto3.addPosgraduacao(posg2);
        posg2.addProjeto(projeto3);

        projeto4.addProfesor(prof1);
        prof1.addProjeto(projeto4);

        projeto4.addGraduacao(grad3);
        grad3.addProjeto(projeto4);

        projeto4.addPesquisador(pesquisador1);
        pesquisador1.addProjeto(projeto4);

        projeto4.addPosgraduacao(posg6);
        posg6.addProjeto(projeto4);

        projeto4.addProfesor(prof2);
        prof2.addProjeto(projeto4);

        projeto5.addProfesor(prof3);
        prof3.addProjeto(projeto5);

        projetos.add(projeto1);
        projetos.add(projeto2);
        projetos.add(projeto3);
        projetos.add(projeto4);
        projetos.add(projeto5);

    }

    public void criarPublicacao() {

        int posProj = procurarProjeto(projetoPub);
        Publicacao publicacao = new Publicacao(id_pub, tituloPub, conferenciaPub, anoPub, projetos.get(posProj));
        projetos.get(posProj).addPublicacao(publicacao);
        id_pub += 1;
        publicacoes.add(publicacao);
    }

    public int procurarProjeto(String projeto) {
        int pos = 0;
        for (int x = 0; x < projetos.size(); x++) {
            if (projetos.get(x).getId().equals(projeto)) {
                pos = x;
                return pos;
            }
        }
        return pos;
    }

    public int procurarProfessor() {
        int pos = 0;
        for (int y = 0; y < professores.size(); y++) {
            if (professores.get(y).getNome().equals(profesor)) {
                pos = y;
                return pos;
            }
        }
        return pos;
    }

    public int procurarGraduacao() {
        int pos = 0;
        for (int z = 0; z < alunos_graduacao.size(); z++) {
            if (alunos_graduacao.get(z).getNome().equals(aluno_graduacao)) {
                pos = z;
                return pos;
            }
        }
        return pos;
    }

    public int procurarPosgraduacao() {
        int pos = 0;
        for (int z = 0; z < alunos_posgraduacao.size(); z++) {
            if (alunos_posgraduacao.get(z).getNome().equals(aluno_posgraduacao)) {
                pos = z;
                return pos;
            }
        }
        return pos;
    }

    public int procurarPesquisador() {
        int pos = 0;
        for (int z = 0; z < pesquisadores.size(); z++) {
            if (pesquisadores.get(z).getNome().equals(pesquisador)) {
                pos = z;
                return pos;
            }
        }
        return pos;
    }

    public boolean professorRepetido(int posProj) {
        for (int x = 0; x < projetos.get(posProj).getProfesores().size(); x++) {
            if (projetos.get(posProj).getProfesores().get(x).getNome().equals(profesor)) {
                return true;
            }
        }
        return false;
    }

    public boolean graduacaoRepetido(int posProj) {
        for (int x = 0; x < projetos.get(posProj).getAlunos_graduacao().size(); x++) {
            if (projetos.get(posProj).getAlunos_graduacao().get(x).getNome().equals(aluno_graduacao)) {
                return true;
            }
        }
        return false;
    }

    public boolean posgraduacaoRepetido(int posProj) {
        for (int x = 0; x < projetos.get(posProj).getAlunos_pos().size(); x++) {
            if (projetos.get(posProj).getAlunos_pos().get(x).getNome().equals(aluno_posgraduacao)) {
                return true;
            }
        }
        return false;
    }

    public boolean pesquisadorRepetido(int posProj) {
        for (int x = 0; x < projetos.get(posProj).getPesquisadores().size(); x++) {
            if (projetos.get(posProj).getPesquisadores().get(x).getNome().equals(pesquisador)) {
                return true;
            }
        }
        return false;
    }

    //Verifica que o projete esteja em Andamento para poder alocar colaboradores
    public boolean verificarAlocacao1() {
        boolean flag = false;
        FacesMessage message = null;
        for (int x = 0; x < projetos.size(); x++) {
            if ((projetos.get(x).getId().equals(projeto)) && (projetos.get(x).getStatus().equals("Em Elaboracao"))) {
                message = new FacesMessage(FacesMessage.FACES_MESSAGES, "O projeto pode alocar participantes");
                flag = true;
            }
        }
        if (flag == false) {
            message = new FacesMessage(FacesMessage.FACES_MESSAGES, "O projeto nao pode alocar parctipantes. Verificar o status");
            return false;
        } else {
            return true;
        }
    }

    // Verifica que o um aluno de graduacao somente esteja no maximo dois projetos
    public boolean verificarAlocacao2() {
        int cont = 0;
        for (int y = 0; y < projetos.size(); y++) {
            for (int z = 0; z < projetos.get(y).getAlunos_graduacao().size(); z++) {
                if (projetos.get(y).getAlunos_graduacao().get(z).getNome().equals(aluno_graduacao)) {
                    cont++;
                }
            }
        }
        if (cont >= 2) {
            return false;
        } else {
            return true;
        }
    }

    public void alocarColaboradores() {
        mensagem = "";
        int posProj = procurarProjeto(projeto);
        int posProf = procurarProfessor();
        int posPos = procurarPosgraduacao();
        int posgrad = procurarGraduacao();
        int posPes = procurarPesquisador();

        if (verificarAlocacao1() == false) {
            if (projeto.equals("")) {
                mensagem = "Selecione um projeto\n";
            } else {
                mensagem = " [O projeto nao tem o status certo para alocar colaboradores] ";
            }
        } else {
            mensagem = "";
            if (profesor.equals("null")) {

            } else {
                if (professorRepetido(posProj) == false) {
                    projetos.get(posProj).addProfesor(professores.get(posProf));
                    professores.get(posProf).addProjeto(projetos.get(posProj));
                    mensagem += "Professor: " + profesor + " - ";
                } else {
                    mensagem = " [O professor já faz parte do projeto] ";
                }
            }
            if (aluno_posgraduacao.equals("null")) {

            } else {
                if (posgraduacaoRepetido(posProj) == false) {
                    projetos.get(posProj).addPosgraduacao(alunos_posgraduacao.get(posPos));
                    alunos_posgraduacao.get(posPos).addProjeto(projetos.get(posProj));
                    mensagem += " Posgraduacao: " + aluno_posgraduacao + " - ";
                } else {
                    mensagem = " [O aluno da posgraduacao já faz parte do projeto] ";
                }
            }
            if (pesquisador.equals("null")) {

            } else {
                if (pesquisadorRepetido(posProj) == false) {
                    projetos.get(posProj).addPesquisador(pesquisadores.get(posPes));
                    pesquisadores.get(posPes).addProjeto(projetos.get(posProj));
                    mensagem += " Pesquisador: " + pesquisador + " - ";
                } else {
                    mensagem = " [O pesquisador já faz parte do projeto] ";
                }
            }
            if (verificarAlocacao2() == true) {
                if (aluno_graduacao.equals("null")) {

                } else {
                    if (graduacaoRepetido(posProj) == false) {
                        projetos.get(posProj).addGraduacao(alunos_graduacao.get(posgrad));
                        alunos_graduacao.get(posgrad).addProjeto(projetos.get(posProj));
                        mensagem += " Graduacao: " + aluno_graduacao;
                    } else {
                        mensagem = " [O aluno da graduacao já faz parte do projeto] ";
                    }
                }
            } else {
                mensagem += " [O aluno da graduacao faz parte de dois projetos] ";
            }
        }
    }

    public boolean verificarInformacoes() {
        int posProj = procurarProjeto(projeto);
        if (projetos.get(posProj).getAgenciaFinanciadora() != null && projetos.get(posProj).getDataInicio() != null && projetos.get(posProj).getDataTermino() != null
                && projetos.get(posProj).getDescricao() != null && projetos.get(posProj).getObjetivo() != null
                && projetos.get(posProj).getTitulo() != null && projetos.get(posProj).getValor() != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarPublicacoes() {
        int posProj = procurarProjeto(projeto);
        if (projetos.get(posProj).getPublicacoes().size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void alterarStatus() {
        mensagemStatus = "";
        int posProj = procurarProjeto(projeto);
        if (opcaoStatus.equals("null")) {
            mensagemStatus = "Selecione uma opcao para alterar o status do projeto";
        } else {
            if (opcaoStatus.equals("Em Andamento")) {
                if (verificarInformacoes() == true && projetos.get(posProj).getStatus().equals("Em Elaboracao")) {
                    projetos.get(posProj).setStatus("Em Andamento");
                    mensagemStatus = "O status do projeto foi alterado para Em Andamento";
                } else {
                    if (projetos.get(posProj).getStatus() != null) {
                        mensagemStatus = "Nao é possivel alterar o status do projeto porque ele já está Em Andamento";
                    } else {
                        mensagemStatus = "Nao é possivel alterar o status por falta das informacaoes do projeto";
                    }
                }
            }
            if (opcaoStatus.equals("Concluido")) {
                if (verificarPublicacoes() == true && projetos.get(posProj).getStatus().equals("Em Andamento")) {
                    projetos.get(posProj).setStatus("Concluido");
                    mensagemStatus = "O status do projeto foi alterado para Concluido";
                } else {
                    if (verificarPublicacoes() == false) {
                        mensagemStatus = "Nao é possivel alterar o status do projeto porque ele nao tem publicacoes asociadas";
                    } else {
                        mensagemStatus = "Nao é possivel Concluir o projeto sem o projeto estar Em Andamento";
                    }
                }
            }
        }
    }

    public void apresentarColaboradores() {
        for (int i = 0; i < professores.size(); i++) {
            System.out.println("Nome: " + professores.get(i).getNome() + " Afiliacao: " + professores.get(i).getAfiliacao());
        }
        System.out.println("\nAlunos graduacao\n");
        for (int x = 0; x < alunos_graduacao.size(); x++) {
            System.out.println("Nome: " + alunos_graduacao.get(x).getNome() + " Data: " + alunos_graduacao.get(x).getData());
        }
        System.out.println("\nAlunos posgraduacao\n");
        for (int y = 0; y < alunos_posgraduacao.size(); y++) {
            System.out.println("Nome: " + alunos_posgraduacao.get(y).getNome() + " Recurso: " + alunos_posgraduacao.get(y).getRegcurso());
        }
        System.out.println("\nProjetos\n");
        for (int z = 0; z < projetos.size(); z++) {
            System.out.println("Id: " + projetos.get(z).getId());
        }

        for (int f = 0; f < projetos.size(); f++) {
            System.out.println("Projeto: " + projetos.get(f).getId() + "  Prof: " + projetos.get(f).getProfesores().get(0).getNome());
        }

        for (int x = 0; x < projetos.size(); x++) {
            if ((projetos.get(x).getId().equals(projeto)) && (projetos.get(x).getStatus().equals("Em Andamento"))) {
                System.out.println("Proyecto seleccionado con Id: " + projetos.get(x).getId() + " y status: " + projetos.get(x).getStatus());
            }
        }

        System.out.println("Mensaje: " + mensagem);
        System.out.println("Dados capturados: " + projeto + " - " + profesor + " - " + aluno_graduacao + " - " + aluno_posgraduacao + " - " + pesquisador);

    }
}
