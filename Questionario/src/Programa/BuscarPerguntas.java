/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class BuscarPerguntas{
 
	public Questionario buscar(String caminho) {
            Questionario q = new Questionario();
            BufferedReader br = null;
            int ok = 0;
            String line;
            try {
              br = new BufferedReader(new FileReader(caminho));
            } catch (FileNotFoundException ex) {

            }
            

            
            try {
                line = br.readLine();
                q.setNome(line);
                line = br.readLine();
                q.setDescricao(line);
                while ((line = br.readLine()) != null) {
                   StringTokenizer stringTokenizer = new StringTokenizer(line);
                   String pergunta="";
                   String id="";
                   while (stringTokenizer.hasMoreElements()) {
                       String texto = stringTokenizer.nextElement().toString();
                       if (texto.startsWith("<"))
                       {
                           id=(String) texto.subSequence(1, texto.length()-1);
                       }
                       else
                       {
                           if(pergunta.isEmpty())
                           {
                               pergunta = texto;
                           }
                           else
                           {
                               pergunta = pergunta+" "+texto;
                           }
                       }
                        
                   }
                   Pergunta p = new Pergunta();
                   p.setId(id);
                   p.setDescricao(pergunta);
                   q.addPergunta(p);
                }
            } catch (IOException ex) {
            }
            return q;
        } 

}
