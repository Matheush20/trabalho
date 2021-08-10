
package Classes;


public class Cidade {
    private int codCidade;
    private String descricao;
    private int codEstado;

    public Cidade() {
    }

    public Cidade(int codCidade, String descricao, int codEstado) {
        this.codCidade = codCidade;
        this.descricao = descricao;
        this.codEstado = codEstado;
    }

    public int getCodCidade() {
        return codCidade;
    }

 
    public void setCodCidade(int codCidade) {
        this.codCidade = codCidade;
    }

    public String getDescricao() {
        return descricao;
    }

  
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

  
    public int getCodEstado() {
        return codEstado;
    }

   
    public void setCodEstado(int codEstado) {
        this.codEstado = codEstado;
    }

    @Override
    public boolean equals(Object o) {
        
        return o.hashCode() == hashCode();
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.codCidade;
        return hash;
    }
    
    
    
    
}
