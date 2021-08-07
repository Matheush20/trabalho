package Classes;

public class RelOrdemPedido {
    private OrdemCompra codOrdemCompra;
    private PedidoCompra codPedidoCompra;

    public RelOrdemPedido() {
    }

    public RelOrdemPedido(OrdemCompra codOrdemCompra, PedidoCompra codPedidoCompra) {
        this.codOrdemCompra = codOrdemCompra;
        this.codPedidoCompra = codPedidoCompra;
    }

    public OrdemCompra getOrdemCompra() {
        return codOrdemCompra;
    }

    public void setOrdemCompra(OrdemCompra codOrdemCompra) {
        this.codOrdemCompra = codOrdemCompra;
    }
    
    public PedidoCompra getCodPedidoCompra() {
        return codPedidoCompra;
    }

    public void setCodPedidoCompra(PedidoCompra codPedidoCompra) {
        this.codPedidoCompra = codPedidoCompra;
    }
}