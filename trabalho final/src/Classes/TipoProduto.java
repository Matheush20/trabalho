package Classes;

public class TipoProduto {
    private int codTipoProduto;
    private String descricao;
    private int qtdeMaxRecpt;
    private String UPC;
    private int codCategoria;

    public TipoProduto() {
    }

    public TipoProduto(int codTipoProduto, String descricao, int qtdeMaxRecpt, String UPC, int codCategoria) {
        this.codTipoProduto = codTipoProduto;
        this.descricao = descricao;
        this.qtdeMaxRecpt = qtdeMaxRecpt;
        this.UPC = UPC;
        this.codCategoria = codCategoria;
    }

    public int getCodTipoProduto() {
        return codTipoProduto;
    }


    public void setCodTipoProduto(int codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

 
    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdeMaxRecpt() {
        return qtdeMaxRecpt;
    }

  
    public void setQtdeMaxRecpt(int qtdeMaxRecpt) {
        this.qtdeMaxRecpt = qtdeMaxRecpt;
    }

    
    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

  
    public int getCodCategoria() {
        return codCategoria;
    }

    
    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode() == hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.codTipoProduto;
        return hash;
    }
    
    
    
    
    
    
  
    
}