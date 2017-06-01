/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import java.io.File;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class Estatistica {
    
    public void retornaEstatistica (String caminho, Questionario q){
        File arq = new File(caminho);
        for (File f:arq.listFiles()){
            if(f.isFile() && f.getName().startsWith(q.getNome()+"_")){
                //  List<String> l = getRespostas(f);
            }
        }
               
    }  
   
}
