package Classes;

public class PedidoCompra {
    
    private int codPedidoCompra;
    private float valTotal;

    public PedidoCompra() {
    }

    public PedidoCompra(int codPedidoCompra, float valTotal, int fornecedor) {
        this.codPedidoCompra = codPedidoCompra;
        this.valTotal = valTotal;
    }

    public int getCodPedidoCompra() {
        return codPedidoCompra;
    }

    public void setCodPedidoCompra(int codPedidoCompra) {
        this.codPedidoCompra = codPedidoCompra;
    }

    public float getValTotal() {
        return valTotal;
    }

    public void setValTotal(float valTotal) {
        this.valTotal = valTotal;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode()==hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codPedidoCompra;
        return hash;
    }
    
    
    
}