package Classes;

public class OrdemCompra {

    private int codOrdemCompra;
    private float valUnitario;
    private int quantidade;
    private Cliente codCliente;
    private Fornecedor codFornecedor;
    private TipoProduto codTipoProduto;

    public OrdemCompra(int codOrdemCompra, float valUnitario, int quantidade, Cliente codCliente, Fornecedor codFornecedor, TipoProduto codTipoProduto) {
        this.codOrdemCompra = codOrdemCompra;
        this.valUnitario = valUnitario;
        this.quantidade = quantidade;
        this.codCliente = codCliente;
        this.codFornecedor = codFornecedor;
        this.codTipoProduto = codTipoProduto;
    }
    
    public int getCodOrdemCompra() {
        return codOrdemCompra;
    }

    public void setCodOrdemCompra(int codOrdemCompra) {
        this.codOrdemCompra = codOrdemCompra;
    }

    public float getValUnitario() {
        return valUnitario;
    }

    public void setValUnitario(float valUnitario) {
        this.valUnitario = valUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Cliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Cliente codCliente) {
        this.codCliente = codCliente;
    }

    public Fornecedor getCodFornecedor() {
        return codFornecedor;
    }

    public void setCodFornecedor(Fornecedor codFornecedor) {
        this.codFornecedor = codFornecedor;
    }

    public TipoProduto getCodTipoProduto() {
        return codTipoProduto;
    }

    public void setCodTipoProduto(TipoProduto codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode() ==  hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.codOrdemCompra;
        return hash;
    }
    
    
    

}
