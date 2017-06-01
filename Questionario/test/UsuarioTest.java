/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Programa.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo
 */
public class UsuarioTest
{
    @Test
    public void ct01()
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

        assertEquals(idade, u.getIdade());
        assertEquals(sexo, u.getSexo());
        assertEquals(nomeCompleto, u.getNomeCompleto());
        assertEquals(profissao, u.getProfissao());
    }
    
}
