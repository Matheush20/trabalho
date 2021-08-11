package Classes;

public class notaCompra {

    private int codFornecedor;
    private int codTipoProduto;
    private int codPedidoCompra;
    private int codNotaCompra;

    public notaCompra() {
    }

    public notaCompra(int codFornecedor, int codTipoProduto, int codPedidoCompra, int codNotaCompra) {
        this.codFornecedor = codFornecedor;
        this.codTipoProduto = codTipoProduto;
        this.codPedidoCompra = codPedidoCompra;
        this.codNotaCompra = codNotaCompra;
    }

   
    public int getCodFornecedor() {
        return codFornecedor;
    }

   
    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

  
    public int getCodTipoProduto() {
        return codTipoProduto;
    }

 
    public void setCodTipoProduto(int codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

    
    public int getCodPedidoCompra() {
        return codPedidoCompra;
    }

    
    public void setCodPedidoCompra(int codPedidoCompra) {
        this.codPedidoCompra = codPedidoCompra;
    }

  
    public int getCodNotaCompra() {
        return codNotaCompra;
    }

    public void setCodNotaCompra(int codNotaCompra) {
        this.codNotaCompra = codNotaCompra;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.codNotaCompra;
        return hash;
    }
    
    
    
    
}
