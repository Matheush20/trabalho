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
public class Estado {
    
    private int codEstado;
    private String descricao;
    private String sigla;

    public Estado() {
    }

    public Estado(int codEstado, String descricao, String sigla) {
        this.codEstado = codEstado;
        this.descricao = descricao;
        this.sigla = sigla;
    }

    /**
     * @return the codEstado
     */
    public int getCodEstado() {
        return codEstado;
    }

    /**
     * @param codEstado the codEstado to set
     */
    public void setCodEstado(int codEstado) {
        this.codEstado = codEstado;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode()== hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.codEstado;
        return hash;
    }
    
    
    
    
}
