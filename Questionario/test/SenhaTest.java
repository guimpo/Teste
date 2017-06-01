/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Programa.Senha;
import org.hamcrest.core.AnyOf;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo
 */
public class SenhaTest
{
    @Test
    public void ct01()
    {
        Senha s = new Senha();
        
        String senha = "senha";
        assertFalse(s.recebeSenha(senha));
        
    }
    
    // branch coverage
    @Test
    public void ct02()
    {
        Senha s = new Senha();
        
        String senha = "AiDeMim";
        assertTrue(s.recebeSenha(senha));
    }
}
