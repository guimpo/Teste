/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

/**
 *
 * @author Bruno
 */
public class Senha {
    String senha = "AiDeMim";
    
    public boolean recebeSenha(String senha){
        if (this.senha == null ? senha == null : this.senha.equals(senha))
              return true;
        else
               return false;
    }
}
