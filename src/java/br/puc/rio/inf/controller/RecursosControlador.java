/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.puc.rio.inf.controller;

import br.puc.rio.inf.model.Graduacao;
import br.puc.rio.inf.model.Orientacao;
import br.puc.rio.inf.model.Pesquisador;
import br.puc.rio.inf.model.Posgraduacao;
import br.puc.rio.inf.model.Professor;
import br.puc.rio.inf.model.Projeto;
import br.puc.rio.inf.model.Publicacao;
import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
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
    private String projetoStatus = null;
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
    private String mensagem_pub = null;
    private String publicacao = null;
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();

    private int id_diss = 1;
    private String dissertacao = null;
    private String professor_diss = null;
    private String alunopos_diss = null;
    private String alunograd_diss = null;
    private String mensagem_diss = null;
    private ArrayList<Orientacao> orientacoes = new ArrayList<>();

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

    public int getId_pub() {
        return id_pub;
    }

    public void setId_pub(int id_pub) {
        this.id_pub = id_pub;
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }

    public String getDissertacao() {
        return dissertacao;
    }

    public void setDissertacao(String dissertacao) {
        this.dissertacao = dissertacao;
    }

    public String getProfessor_diss() {
        return professor_diss;
    }

    public void setProfessor_diss(String professor_diss) {
        this.professor_diss = professor_diss;
    }

    public String getAlunopos_diss() {
        return alunopos_diss;
    }

    public void setAlunopos_diss(String alunopos_diss) {
        this.alunopos_diss = alunopos_diss;
    }

    public String getAlunograd_diss() {
        return alunograd_diss;
    }

    public void setAlunograd_diss(String alunograd_diss) {
        this.alunograd_diss = alunograd_diss;
    }

    public String getMensagem_diss() {
        return mensagem_diss;
    }

    public void setMensagem_diss(String mensagem_diss) {
        this.mensagem_diss = mensagem_diss;
    }

    public ArrayList<Orientacao> getOrientacoes() {
        return orientacoes;
    }

    public void setOrientacoes(ArrayList<Orientacao> orientacoes) {
        this.orientacoes = orientacoes;
    }

    public int getId_diss() {
        return id_diss;
    }

    public void setId_diss(int id_diss) {
        this.id_diss = id_diss;
    }

    public String getProjetoStatus() {
        return projetoStatus;
    }

    public void setProjetoStatus(String projetoStatus) {
        this.projetoStatus = projetoStatus;
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

        Graduacao grad1 = new Graduacao(null, "01/03/2006", "1001", "Maria", "maria@email.br");
        Graduacao grad2 = new Graduacao(null, "01/03/2005", "1002", "João", "joao@email.br");
        Graduacao grad3 = new Graduacao(null, "01/03/2006", "1003", "Mario", "mario@email.br");

        Posgraduacao posg1 = new Posgraduacao("Parcial", true, null, "01/03/2006", "1004", "Soraia", "soraia@email.br");
        Posgraduacao posg2 = new Posgraduacao("Parcial", true, null, "01/06/2007", "1005", "Rafael", "rafael@email.br");
        Posgraduacao posg3 = new Posgraduacao("Integral", true, null, "01/06/2007", "1006", "Marta", "marta@email.br");
        Posgraduacao posg4 = new Posgraduacao("Integral", true, null, "01/03/2006", "1007", "Daniel", "Daniel@email.br");

        Posgraduacao posg5 = new Posgraduacao("Integral", false, null, "01/03/2005", "1008", "Michael", "Michael@email.br");
        Posgraduacao posg6 = new Posgraduacao("Integral", false, null, "01/06/2004", "1009", "Bia", "Bia@email.br");

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
                "Pesquisar, aplicar e avaliar técnicas para o desenvolvimento de sistemas multi-agentes auto-organizáveis", "Em Elaboracao");

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
        mensagem_pub = "";
        int posProj = procurarProjeto(projetoPub);
        if (tituloPub.equals("") || conferenciaPub.equals("") || anoPub.equals("")) {
            mensagem_pub = "Digite o titulo, a conferencia e o ano da publicacao";
        } else {
            if (posProj == 50) {
                Publicacao newpublicacao = new Publicacao(id_pub, tituloPub, conferenciaPub, anoPub, null);
                id_pub += 1;
                publicacoes.add(newpublicacao);
                mensagem_pub = "A publicacao foi criada com sucesso";
            } else {
                if (projetos.get(posProj).getStatus().equals("Em Andamento")) {
                    Publicacao newpublicacao = new Publicacao(id_pub, tituloPub, conferenciaPub, anoPub, projetos.get(posProj));
                    projetos.get(posProj).addPublicacao(newpublicacao);
                    id_pub += 1;
                    publicacoes.add(newpublicacao);
                    mensagem_pub = "A publicacao foi criada com sucesso";
                } else {
                    mensagem_pub = "A publicacao só pode ser feita se o projeto estiver com status Em Andamento";
                }
            }
        }
    }

    public void criarOrientacaoGrad() {

        int posProf = procurarProfessor(professor_diss);
        int posGrad = procurarGraduacao(alunograd_diss);
        mensagem_diss = "";

        if (dissertacao == null || dissertacao.equals("") || professor_diss.equals("null")) {
            mensagem_diss = "Selecione um professor e um titulo para a dissertacao";
        } else {
            if (alunograd_diss.equals("null")) {
                mensagem_diss = "Por favor selecione o aluno de graduacao que sera orientado pelo " + professor_diss;
            } else {
                if (alunos_graduacao.get(posGrad).getOrientacao() == null) {
                    Orientacao orientacao = new Orientacao(id_diss, professores.get(posProf), alunos_graduacao.get(posGrad), null, dissertacao);
                    professores.get(posProf).addOrientacao(orientacao);
                    alunos_graduacao.get(posGrad).setOrientacao(orientacao);
                    orientacoes.add(orientacao);
                    id_diss += 1;
                    mensagem_diss = alunograd_diss;
                } else {
                    mensagem_diss = "O aluno de graduacao " + alunograd_diss + " já é orientado pelo " + alunos_graduacao.get(posGrad).getOrientacao().getProfesor().getNome();
                }
            }
        }
    }

    public void criarOrientacaoPos() {

        int posProf = procurarProfessor(professor_diss);
        int posPos = procurarPosgraduacao(alunopos_diss);
        mensagem_diss = "";

        if (dissertacao == null || dissertacao.equals("") || professor_diss.equals("null")) {
            mensagem_diss = "Selecione um professor e um titulo para a dissertacao";
        } else {
            if (alunopos_diss.equals("null")) {
                mensagem_diss = "Por favor selecione o aluno de posgraduacao que sera orientado pelo " + professor_diss;
            } else {
                if (alunos_posgraduacao.get(posPos).getOrientacao() == null) {
                    Orientacao orientacao = new Orientacao(id_diss, professores.get(posProf), null, alunos_posgraduacao.get(posPos), dissertacao);
                    professores.get(posProf).addOrientacao(orientacao);
                    alunos_posgraduacao.get(posPos).setOrientacao(orientacao);
                    orientacoes.add(orientacao);
                    id_diss += 1;
                    mensagem_diss = alunopos_diss;
                } else {
                    mensagem_diss = "O aluno de posgraduacao " + alunopos_diss + " já é orientado pelo " + alunos_posgraduacao.get(posPos).getOrientacao().getProfesor().getNome();
                }
            }
        }
    }

    public int procurarProjeto(String projeto) {
        for (int x = 0; x < projetos.size(); x++) {
            if (projetos.get(x).getId().equals(projeto)) {
                return x;
            }
        }
        return 50;
    }

    public int procurarProfessor(String profesor) {
        int pos = 0;
        for (int y = 0; y < professores.size(); y++) {
            if (professores.get(y).getNome().equals(profesor)) {
                pos = y;
                return pos;
            }
        }
        return pos;
    }

    public int procurarGraduacao(String aluno_graduacao) {
        int pos = 0;
        for (int z = 0; z < alunos_graduacao.size(); z++) {
            if (alunos_graduacao.get(z).getNome().equals(aluno_graduacao)) {
                pos = z;
                return pos;
            }
        }
        return pos;
    }

    public int procurarPosgraduacao(String aluno_posgraduacao) {
        int pos = 0;
        for (int z = 0; z < alunos_posgraduacao.size(); z++) {
            if (alunos_posgraduacao.get(z).getNome().equals(aluno_posgraduacao)) {
                pos = z;
                return pos;
            }
        }
        return pos;
    }

    public int procurarPesquisador(String pesquisador) {
        int pos = 0;
        for (int z = 0; z < pesquisadores.size(); z++) {
            if (pesquisadores.get(z).getNome().equals(pesquisador)) {
                pos = z;
                return pos;
            }
        }
        return pos;
    }

    public int procurarPublicaco(int id_pub) {
        int pos = 0;
        for (int z = 0; z < publicacoes.size(); z++) {
            if (publicacoes.get(z).getId() == id_pub) {
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

    public boolean professorRepetido_pub(int posProf) {
        int pub = Integer.parseInt(publicacao);
        for (int x = 0; x < professores.get(posProf).getPublicacoes().size(); x++) {
            if (professores.get(posProf).getPublicacoes().get(x).getId() == pub) {
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

    public boolean aluno_grad_Repetido_pub(int posgrad) {
        int pub = Integer.parseInt(publicacao);
        for (int x = 0; x < alunos_graduacao.get(posgrad).getPublicacoes().size(); x++) {
            if (alunos_graduacao.get(posgrad).getPublicacoes().get(x).getId() == pub) {
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

    public boolean aluno_pos_Repetido_pub(int posPos) {
        int pub = Integer.parseInt(publicacao);
        for (int x = 0; x < alunos_posgraduacao.get(posPos).getPublicacoes().size(); x++) {
            if (alunos_posgraduacao.get(posPos).getPublicacoes().get(x).getId() == pub) {
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

    public boolean pesquisador_Repetido_pub(int posPes) {
        int pub = Integer.parseInt(publicacao);
        for (int x = 0; x < pesquisadores.get(posPes).getPublicacoes().size(); x++) {
            if (pesquisadores.get(posPes).getPublicacoes().get(x).getId() == pub) {
                return true;
            }
        }
        return false;
    }

    //Verifica que o projete esteja em Andamento para poder alocar colaboradores
    public boolean verificarAlocacao1() {
        for (int x = 0; x < projetos.size(); x++) {
            if ((projetos.get(x).getId().equals(projeto)) && (projetos.get(x).getStatus().equals("Em Elaboracao"))) {
                return true;
            }
        }
        return false;
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
        int posProf = procurarProfessor(profesor);
        int posPos = procurarPosgraduacao(aluno_posgraduacao);
        int posgrad = procurarGraduacao(aluno_graduacao);
        int posPes = procurarPesquisador(pesquisador);

        if (verificarAlocacao1() == false) {
            if (projeto.equals("null")) {
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
        if (mensagem.equals("")) {
            mensagem = "Selecione algum colaborador";
        }
    }

    public boolean verificarInformacoes() {
        int posProj = procurarProjeto(projetoStatus);
        if (projetos.get(posProj).getAgenciaFinanciadora() != null && projetos.get(posProj).getDataInicio() != null && projetos.get(posProj).getDataTermino() != null
                && projetos.get(posProj).getDescricao() != null && projetos.get(posProj).getObjetivo() != null
                && projetos.get(posProj).getTitulo() != null && projetos.get(posProj).getValor() != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarPublicacoes() {
        int posProj = procurarProjeto(projetoStatus);
        if (projetos.get(posProj).getPublicacoes().size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void alterarStatus() {
        mensagemStatus = "";
        int posProj = procurarProjeto(projetoStatus);
        if (opcaoStatus.equals("null") || projetoStatus.equals("null")) {
            mensagemStatus = "Selecione um projeto e um status para alterar o status do projeto";
        } else {
            if (projetos.get(posProj).getStatus().equals("Concluido")) {
                mensagemStatus = "Nao é possivel mudar o status do projeto porque o status atual é concluido";
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
                } else {
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
        }
    }

    public void colaboradorPublicacao() {
        int posProf = procurarProfessor(professorPub);
        int posPos = procurarPosgraduacao(aluno_pos_pub);
        int posgrad = procurarGraduacao(aluno_graduacao_pub);
        int posPes = procurarPesquisador(pesquisador_pub);
        int posPub = procurarPublicaco(id_pub);
        mensagem_pub = "";
        if (publicacoes.isEmpty()) {
            mensagem_pub = "Crie uma publicacao";
        } else {
            if (publicacao.equals("null")) {
                mensagem_pub = "Selecione uma publicacao";
            } else {
                if (professorPub.equals("null") && aluno_graduacao_pub.equals("null") && aluno_pos_pub.equals("null") && pesquisador_pub.equals("null")) {
                    mensagem_pub = "Selecione um colaborador que será o autor da publicacao";
                } else {
                    if (!"null".equals(professorPub) && professorRepetido_pub(posProf) == false) {
                        professores.get(posProf).addPublicacao(publicacoes.get(posPub));
                        publicacoes.get(posPub).addProfesor(professores.get(posProf));
                        mensagem_pub = " [" + professorPub + "] ";
                    } else {
                        if (!"null".equals(professorPub)) {
                            mensagem_pub = "O professor já é um autor da publicacao - ";
                        }
                    }
                    if (!"null".equals(aluno_graduacao_pub) && aluno_grad_Repetido_pub(posgrad) == false) {
                        alunos_graduacao.get(posgrad).addPublicacao(publicacoes.get(posPub));
                        publicacoes.get(posPub).addGraduacao(alunos_graduacao.get(posgrad));
                        mensagem_pub += " [" + aluno_graduacao_pub + "] ";
                    } else {
                        if (!"null".equals(aluno_graduacao_pub)) {
                            mensagem_pub += "O aluno de graduacao já é um autor da publicacao - ";
                        }
                    }
                    if (!"null".equals(aluno_pos_pub) && aluno_pos_Repetido_pub(posPos) == false) {
                        alunos_posgraduacao.get(posPos).addPublicacao(publicacoes.get(posPub));
                        publicacoes.get(posPub).addPosgraduacao(alunos_posgraduacao.get(posPos));
                        mensagem_pub += " [" + aluno_pos_pub + "] ";
                    } else {
                        if (!"null".equals(aluno_pos_pub)) {
                            mensagem_pub += "O aluno de posgraduacao já é um autor da publicacao - ";
                        }
                    }
                    if (!"null".equals(pesquisador_pub) && pesquisador_Repetido_pub(posPes) == false) {
                        pesquisadores.get(posPes).addPublicacao(publicacoes.get(posPub));
                        publicacoes.get(posPub).addPesquisador(pesquisadores.get(posPes));
                        mensagem_pub += " [" + pesquisador_pub + "] ";
                    } else {
                        if (!"null".equals(pesquisador_pub)) {
                            mensagem_pub += " O pesquisador já é um autor da publicacao";
                        }
                    }
                }
            }
        }
    }

    public int numColaboradores() {
        int profs = professores.size();
        int grad = alunos_graduacao.size();
        int pos = alunos_posgraduacao.size();
        int pes = pesquisadores.size();

        return profs + grad + pos + pes;
    }

    public int numProjetosElab() {
        int cont = 0;
        for (int x = 0; x < projetos.size(); x++) {
            if (projetos.get(x).getStatus().equals("Em Elaboracao")) {
                cont += 1;
            }

        }
        return cont;
    }

    public int numProjetosAnd() {
        int cont = 0;
        for (int x = 0; x < projetos.size(); x++) {
            if (projetos.get(x).getStatus().equals("Em Andamento")) {
                cont += 1;
            }
        }
        return cont;
    }

    public int numProjetosConc() {
        int cont = 0;
        for (int x = 0; x < projetos.size(); x++) {
            if (projetos.get(x).getStatus().equals("Concluido")) {
                cont += 1;
            }

        }
        return cont;
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
