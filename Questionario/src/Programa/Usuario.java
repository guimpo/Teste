/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import java.util.ArrayList;

/**
 *
 * @author pantera
 */
public class Usuario {
    private String nomeCompleto;
    private int idade;
    private char sexo;
    private String profissao;
    private ArrayList<Resposta> r = new ArrayList<Resposta>();

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the profissao
     */
    public String getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    /**
     * @return the r
     */
    public ArrayList<Resposta> getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void addR(Resposta r) {
        this.r.add(r);
    }
}
