package Classes;

import java.util.Objects;

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