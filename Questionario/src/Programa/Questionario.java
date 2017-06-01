/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pantera
 */
public class Questionario {
    private String nome;
    private String descricao;
    private ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the perguntas
     */
    public ArrayList<Pergunta> getPerguntas() {
        return perguntas;
    }

    void addPergunta(Pergunta p) {
        perguntas.add(p);
    }
    
    
}
