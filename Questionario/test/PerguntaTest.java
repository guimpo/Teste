/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Programa.Pergunta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo
 */
public class PerguntaTest
{
   @Test
   public void ct01()
   {
       Pergunta p = new Pergunta();
       
       String inputId = "01";
       String inputDescricao = "descrição";
       
       p.setId(inputId);
       p.setDescricao(inputDescricao);
       
       assertEquals(inputId, p.getId());
       assertEquals(inputDescricao, p.getDescricao());
   }
}
