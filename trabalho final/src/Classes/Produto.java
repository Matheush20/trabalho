
package Classes;

import java.util.Objects;


public class Produto {

  
    public String getTipo() {
        return tipo;
    }

   
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

   
    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

  
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    public int getEstoque() {
        return quant_em_estoque;
    }

    
    public void setEstoque(int quant_em_estoque) {
        this.quant_em_estoque = quant_em_estoque;
    }

    public int getId_empresa() {
        return id_empresa;
    }

   
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
