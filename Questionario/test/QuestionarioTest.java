/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Programa.Pergunta;
import Programa.Questionario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo
 */
public class QuestionarioTest
{
    @Test
    public void ct01()
    {
        Questionario q = new Questionario();
        Pergunta p = new Pergunta();
        
        String inNome = "questionarioNome",
               inDescQ = "questionárioDescricao",
               inId = "01",
               inDescP = "pergunta";
        
        q.setNome(inNome);
        q.setDescricao(inDescQ);
        p.setId(inId);
        p.setDescricao(inDescP);
        q.addPergunta(p);
        
        assertEquals(inNome, q.getNome());
        assertEquals(inDescQ, q.getDescricao());
        assertEquals(inId, q.getPerguntas().get(0).getId());
        assertEquals(inDescP, q.getPerguntas().get(0).getDescricao());
    }
}
