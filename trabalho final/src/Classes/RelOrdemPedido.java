package Classes;

import java.util.Objects;

public class RelOrdemPedido {
    private int codOrdemCompra;
    private int codPedidoCompra;

    public RelOrdemPedido() {
    }

    public RelOrdemPedido(int codOrdemCompra, int codPedidoCompra) {
        this.codOrdemCompra = codOrdemCompra;
        this.codPedidoCompra = codPedidoCompra;
    }

    public int getOrdemCompra() {
        return codOrdemCompra;
    }

    public void setOrdemCompra(int codOrdemCompra) {
        this.codOrdemCompra = codOrdemCompra;
    }
    
    public int getCodPedidoCompra() {
        return codPedidoCompra;
    }

    public void setCodPedidoCompra(int codPedidoCompra) {
        this.codPedidoCompra = codPedidoCompra;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode() == hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.codOrdemCompra);
        hash = 53 * hash + Objects.hashCode(this.codPedidoCompra);
        return hash;
    }
    
    
    
}