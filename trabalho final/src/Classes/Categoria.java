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
public class Categoria {
    
    private int codCategoria;
    private String descricao;

    public Categoria() {
    }

    public Categoria(int codCategoria, String descricao) {
        this.codCategoria = codCategoria;
        this.descricao = descricao;
    }

  
    public int getCodCategoria() {
        return codCategoria;
    }


    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
            
        return o.hashCode()  ==  hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.codCategoria;
        return hash;
    }
    
    
    
    
    
    
}
