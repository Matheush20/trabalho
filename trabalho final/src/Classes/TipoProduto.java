package Classes;

public class TipoProduto {
    private int codTipoProduto;
    private String descricao;
    private int qtdeMaxRecept;

    public TipoProduto() {
    }

    public TipoProduto(int codTipoProduto, String descricao, int qtdeMaxRecept){
        this.codTipoProduto = codTipoProduto;
        this.descricao = descricao;
        this.qtdeMaxRecept = qtdeMaxRecept;
    }

    public int getCodTipoProduto() {
        return codTipoProduto;
    }

    public void setCodTipoProduto(int codTipoProduto) {
        this.codTipoProduto = codTipoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdeMaxRecept() {
        return qtdeMaxRecept;
    }

    public void setQtdeMaxRecept(int qtdeMaxRecept) {
        this.qtdeMaxRecept = qtdeMaxRecept;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode() == hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codTipoProduto;
        return hash;
    }
    
    
    
}