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
public class Corredor {
    
    private int numero_corredor;
    private List<Receptaculo>receptaculo;

    public Corredor() {
    }

    public Corredor(int numero_corredor, List<Receptaculo> receptaculo) {
        this.numero_corredor = numero_corredor;
        this.receptaculo = receptaculo;
    }

    /**
     * @return the numero_corredor
     */
    public int getNumero_corredor() {
        return numero_corredor;
    }

    /**
     * @param numero_corredor the numero_corredor to set
     */
    public void setNumero_corredor(int numero_corredor) {
        this.numero_corredor = numero_corredor;
    }

    /**
     * @return the receptaculo
     */
    public List< Receptaculo> getReceptaculo() {
        return receptaculo;
    }

    /**
     * @param receptaculo the receptaculo to set
     */
    public void setReceptaculo(List< Receptaculo> receptaculo) {
        this.receptaculo = receptaculo;
    }

    
    
    
}
