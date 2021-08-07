/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.List;

/**
 *
 * @author MatheusH
 */
public class Receptaculo {
    
    
    private  List<Produto> prod;
    private int numero_recept;
    private Corredor localizacao;

    public Receptaculo() {
    }

    public Receptaculo(List<Produto> prod, int numero_recept, Corredor localizacao) {
        this.prod = prod;
        this.numero_recept = numero_recept;
        this.localizacao = localizacao;
    }

    /**
     * @return the prod
     */
    public List<Produto> getProd() {
        return prod;
    }

    /**
     * @param prod the prod to set
     */
    public void setProd(List<Produto> prod) {
        this.prod = prod;
    }

    /**
     * @return the numero_recept
     */
    public int getNumero_recept() {
        return numero_recept;
    }

    /**
     * @param numero_recept the numero_recept to set
     */
    public void setNumero_recept(int numero_recept) {
        this.numero_recept = numero_recept;
    }

    /**
     * @return the localizacao
     */
    public Corredor getLocalizacao() {
        return localizacao;
    }

    /**
     * @param localizacao the localizacao to set
     */
    public void setLocalizacao(Corredor localizacao) {
        this.localizacao = localizacao;
    }
    
    
    
    
    
    
    
   
    
    
}
