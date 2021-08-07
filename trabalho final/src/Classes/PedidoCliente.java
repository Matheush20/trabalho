package Classes;

public class PedidoCliente {
    
    private int codPedidoCliente;
    private TipoProduto codTipoProduto;
    private Cliente codCliente;
    private int quantidade;

    public PedidoCliente(int codPedidoCliente, TipoProduto codTipoProduto, Cliente codCliente, int quantidade) {
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

    public TipoProduto getCodTipoProduto() {
        return codTipoProduto;
    }

    public void setCodTipoProduto(TipoProduto codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

    public Cliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Cliente codCliente) {
        this.codCliente = codCliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
