/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Programa.Pergunta;
import Programa.Questionario;
import Programa.Resposta;
import Programa.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo
 */
public class QuestionarioTest
{
    // Questionario e Pergunta
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
    
    // Resposta
    @Test
    public void ct02()
    {
        Resposta r = new Resposta();
        String inResp = "oi",
               inIdPerg = "02";
        
        r.setResp(inResp);
        r.setIdPergunta(inIdPerg);
        
        assertEquals(inResp, r.getResp());
        assertEquals(inIdPerg, r.getIdPergunta());
    }
    
    // Usuario e Resposta
    @Test
    public void ct03()
    {
        Usuario u = new Usuario();
        
        int idade = 29;
        char sexo = 'm';
        String nomeCompleto = "paulo",
               profissao = "estudante";
        
        u.setIdade(idade);
        u.setSexo(sexo);
        u.setNomeCompleto(nomeCompleto);
        u.setProfissao(profissao);
        
        Resposta r = new Resposta();
        String inResp = "oi",
        inIdPerg = "02";
        
        r.setResp(inResp);
        r.setIdPergunta(inIdPerg);
        
        u.addR(r);
        
        assertEquals(idade, u.getIdade());
        assertEquals(sexo, u.getSexo());
        assertEquals(nomeCompleto, u.getNomeCompleto());
        assertEquals(profissao, u.getProfissao());
        assertEquals(inResp, u.getR().get(0).getResp());
        assertEquals(inIdPerg, u.getR().get(0).getIdPergunta());
    }
}






















