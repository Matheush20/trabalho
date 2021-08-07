package Classes;

public class PedidoCompra {
    
    private int codPedidoCompra;
    private float valTotal;

    public PedidoCompra() {
    }

    public PedidoCompra(int CodPedidoCompra, float valTotal, int fornecedor) {
        this.codPedidoCompra = codPedidoCompra;
        this.valTotal = valTotal;
    }

    public int getCodPedidoCompra() {
        return codPedidoCompra;
    }

    public void setCodPedidoCompra(int CodPedidoCompra) {
        this.codPedidoCompra = codPedidoCompra;
    }

    public float getValTotal() {
        return valTotal;
    }

    public void setValTotal(float valTotal) {
        this.valTotal = valTotal;
    }
}