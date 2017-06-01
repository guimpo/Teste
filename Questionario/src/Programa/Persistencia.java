/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author pantera
 */
public class Persistencia {
    
    Questionario q;
    String caminho;
    
    public Questionario getQuestionario(){
        return q;
    }
    
    public Questionario getQuestionario(String caminho){
        BuscarPerguntas buscar = new BuscarPerguntas();
        q = buscar.buscar(caminho);
        return q;
    }
    
    
    public String obterCaminho (){
        File ar1;
        ar1 = new File(caminho);
        return ar1.getParent();
       
    }
    public boolean salvarRespostas(Questionario q, Usuario u){
        FileWriter arq;
        try {
            arq = new FileWriter(obterCaminho()+"\\"+q.getNome()+"_"+u.getNomeCompleto()+"_resposta.txt");
            PrintWriter gravararq = new PrintWriter(arq); 
            gravararq.println(u.getNomeCompleto());
            gravararq.println(u.getIdade());
            gravararq.println(u.getSexo());
            gravararq.println(u.getProfissao());
            for (int i = 0; i < u.getR().size(); i++){ 
                gravararq.println("<"+u.getR().get(i).getIdPergunta()+"> "+u.getR().get(i).getResp());
            }
        
            arq.close();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
            return false;
        }
        
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }
}
