
package Classes;



public class Produto {

    
    private int codProduto;
    private String UPC;
    private int codTipoProduto;
    private int codOrdemCompra;

    public Produto() {
    }

    public Produto(int codProduto, String UPC, int codTipoProduto, int codOrdemCompra) {
        this.codProduto = codProduto;
        this.UPC = UPC;
        this.codTipoProduto = codTipoProduto;
        this.codOrdemCompra = codOrdemCompra;
    }

    public int getCodProduto() {
        return codProduto;
    }

  
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }


    public String getUPC() {
        return UPC;
    }

   
    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

  
    public int getCodTipoProduto() {
        return codTipoProduto;
    }

  
    public void setCodTipoProduto(int codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

  
    public int getCodOrdemCompra() {
        return codOrdemCompra;
    }

   
    public void setCodOrdemCompra(int codOrdemCompra) {
        this.codOrdemCompra = codOrdemCompra;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode() == hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.codProduto;
        return hash;
    }
    
    
  
}
