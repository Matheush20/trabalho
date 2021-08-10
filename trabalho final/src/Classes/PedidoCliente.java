package Classes;

public class PedidoCliente {
    
    private int codPedidoCliente;
    private int codTipoProduto;
    private int codCliente;
    private int quantidade;

    public PedidoCliente(int codPedidoCliente, int codTipoProduto, int codCliente, int quantidade) {
        this.codPedidoCliente = codPedidoCliente;
        this.codTipoProduto = codTipoProduto;
        this.codCliente = codCliente;
        this.quantidade = quantidade;
    }

    public int getCodPedidoCliente() {
        return codPedidoCliente;
    }

    public void setCodPedidoCliente(int codPedidoCliente) {
        this.codPedidoCliente = codPedidoCliente;
    }

    public int getCodTipoProduto() {
        return codTipoProduto;
    }

    public void setCodTipoProduto(int codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode()== hashCode();
   
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.codPedidoCliente;
        return hash;
    }
    
    
    
}
