/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Objects;

/**
 *
 * @author MatheusH
 */
public class Produto {

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    private String UPC;
    private String descricao;
    private int quant_em_estoque;
    private int id_empresa;
    private String tipo;
    
    public Produto() {
    }

    public Produto(String UPC, String descricao, int quant_em_estoque, int id_empresa, String tipo) {
        this.UPC = UPC;
        this.descricao = descricao;
        this.quant_em_estoque = quant_em_estoque;
        this.id_empresa = id_empresa;
        this.tipo = tipo;
    }

    /**
     * @return the UPC
     */
    public String getUPC() {
        return UPC;
    }

    /**
     * @param UPC the UPC to set
     */
    public void setUPC(String UPC) {
        this.UPC = UPC;
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
     * @return the estoque
     */
    public int getEstoque() {
        return quant_em_estoque;
    }

    
    public void setEstoque(int quant_em_estoque) {
        this.quant_em_estoque = quant_em_estoque;
    }

    /**
     * @return the id_empresa
     */
    public int getId_empresa() {
        return id_empresa;
    }

    /**
     * @param id_empresa the id_empresa to set
     */
    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    @Override
    public boolean equals(Object o) {
      return o.hashCode()  == hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.UPC);
        return hash;
    }

    
    
    
}
