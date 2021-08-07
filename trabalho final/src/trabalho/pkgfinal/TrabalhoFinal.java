/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.pkgfinal;
import Classes.Cliente;

public class TrabalhoFinal {


    public static void main(String[] args) {
       Cliente teste = new Cliente();
       Cliente  teste2 = new Cliente();
       teste.setCnpj("teste1");
       teste2.setCnpj("teste1");
       System.out.println(teste.hashCode());
       System.out.println(teste2.hashCode());
       
    }
    
}
