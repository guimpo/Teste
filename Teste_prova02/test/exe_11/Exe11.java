/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe_11;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo
 */

/**
 *valorDaCompra - valor da compra que sera realizada
 *  tipoPagamento - "dinheiro", "cartao" ou "cheque"
 *  clienteTemCadastro - verdadeiro caso o cliente tenha cadastro na loja
 * e falso, caso contrário.
 * possiveis saidas sao:
 * - "pode realizar venda"
 * - "chame o supervisor"
 * - "consulte sistema comercial"
 * - "consulte sistema SPC"
 */

public class Exe11
{     
    // 
    @Test
    public void ct00()
    {
        // condições
        float valorDaCompra = 49.99F;
        String tipoPagamento = "cheque";
        boolean clienteTemCadastro = true;
        TomadorDeDecisao td = new TomadorDeDecisao();
        
        // saída esperada
        String saidaEsperada = "pode realizar venda";
         
        // saída obtida
        String saidaObtida = td.tomarDecisao(valorDaCompra, tipoPagamento, clienteTemCadastro);
        
        // teste
        assertEquals(saidaEsperada, saidaObtida);
    }
}
