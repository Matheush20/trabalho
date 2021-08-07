
package Classes;

import com.sun.org.apache.regexp.internal.recompile;




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

    /**
     * @return the codReceptaculo
     */
    public int getCodReceptaculo() {
        return codReceptaculo;
    }

    /**
     * @param codReceptaculo the codReceptaculo to set
     */
    public void setCodReceptaculo(int codReceptaculo) {
        this.codReceptaculo = codReceptaculo;
    }

    /**
     * @return the codCorredor
     */
    public Corredor getCodCorredor() {
        return codCorredor;
    }

    /**
     * @param codCorredor the codCorredor to set
     */
    public void setCodCorredor(Corredor codCorredor) {
        this.codCorredor = codCorredor;
    }

    /**
     * @return the codTipoProduto
     */
    public TipoProduto getCodTipoProduto() {
        return codTipoProduto;
    }

    /**
     * @param codTipoProduto the codTipoProduto to set
     */
    public void setCodTipoProduto(TipoProduto codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
    
    
    
    
      
}
