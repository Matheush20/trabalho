/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author MatheusH
 */
abstract class Setor {
    
    private String nome_setor;
    private int id_setor;

    public Setor() {
    }

    public Setor(String nome_setor, int id_setor) {
        this.nome_setor = nome_setor;
        this.id_setor = id_setor;
    }

    /**
     * @return the nome_setor
     */
    public String getNome_setor() {
        return nome_setor;
    }

    /**
     * @param nome_setor the nome_setor to set
     */
    public void setNome_setor(String nome_setor) {
        this.nome_setor = nome_setor;
    }

    /**
     * @return the id_setor
     */
    public int getId_setor() {
        return id_setor;
    }

    /**
     * @param id_setor the id_setor to set
     */
    public void setId_setor(int id_setor) {
        this.id_setor = id_setor;
    }

 
    @Override
    public boolean equals(Object o) {
        return o.hashCode() == hashCode();
 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id_setor;
        return hash;
    }
    
    public abstract void funcionalidade();
    
}
