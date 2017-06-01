/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Programa.Resposta;
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
public class RespostaTest
{
    @Test
    public void ct01()
    {
        Resposta r = new Resposta();
        String inResp = "oi",
               inIdPerg = "02";
        r.setResp(inResp);
        r.setIdPergunta(inIdPerg);
        assertEquals(inResp, r.getResp());
        assertEquals(inIdPerg, r.getIdPergunta());
    }
}
