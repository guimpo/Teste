/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Programa.Pergunta;
import Programa.Persistencia;
import Programa.Questionario;
import Programa.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author paulo
 */
public class PersistenciaTest
{
    @Test
    public void ct01()
    {
        Persistencia pers = new Persistencia();
        Questionario q = new Questionario();
        Pergunta p = new Pergunta();
        
        String inNome = "questionarioNome",
               inDescQ = "questionárioDescricao",
               inId = "01",
               inDescP = "pergunta",
               caminho = "/home/paulo/f.txt";
        
        Usuario uMock = mock(Usuario.class);
        when(uMock.getIdade()).thenReturn(29);
        when(uMock.getNomeCompleto()).thenReturn("paulo");
        when(uMock.getProfissao()).thenReturn("estudante");
        when(uMock.getSexo()).thenReturn('m');
        
        pers.setCaminho(caminho);
        assertEquals(caminho, pers.getCaminho());
        assertTrue(pers.salvarRespostas(q, uMock));
        
    }
}
