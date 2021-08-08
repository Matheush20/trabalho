
package Classes;





public class Receptaculo {
    
    private int codReceptaculo;
    private Corredor codCorredor;
    private TipoProduto codTipoProduto;
    private int quantidade;

    public Receptaculo() {
    }

    public Receptaculo(int codReceptaculo, Corredor codCorredor, TipoProduto codTipoProduto, int quantidade) {
        this.codReceptaculo = codReceptaculo;
        this.codCorredor = codCorredor;
        this.codTipoProduto = codTipoProduto;
        this.quantidade = quantidade;
    }

    public int getCodReceptaculo() {
        return codReceptaculo;
    }

 
    public void setCodReceptaculo(int codReceptaculo) {
        this.codReceptaculo = codReceptaculo;
    }

    public Corredor getCodCorredor() {
        return codCorredor;
    }

 
    public void setCodCorredor(Corredor codCorredor) {
        this.codCorredor = codCorredor;
    }

  
    public TipoProduto getCodTipoProduto() {
        return codTipoProduto;
    }

    public void setCodTipoProduto(TipoProduto codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode() == hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codReceptaculo;
        return hash;
    }
    
    
    
    
    
    
    
      
}
