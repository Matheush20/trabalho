
package Classes;



public class Produto {

    
    private int codProduto;
    private String UPC;
    private TipoProduto codTipoProduto;
    private OrdemCompra codOrdemCompra;

    public Produto() {
    }

    public Produto(int codProduto, String UPC, TipoProduto codTipoProduto, OrdemCompra codOrdemCompra) {
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

  
    public TipoProduto getCodTipoProduto() {
        return codTipoProduto;
    }

  
    public void setCodTipoProduto(TipoProduto codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

  
    public OrdemCompra getCodOrdemCompra() {
        return codOrdemCompra;
    }

   
    public void setCodOrdemCompra(OrdemCompra codOrdemCompra) {
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
