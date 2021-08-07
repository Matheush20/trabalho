package Classes;


public class Fornecedor {
    
    private int codFornecedor;
    private Cidade codCidade;
    private String cnpj;
    private String nome;
    private String contato;
    private String endereco;

    public Fornecedor(int codFornecedor, Cidade codCidade, String cnpj, String nome, String contato, String endereco) {
        this.codFornecedor = codFornecedor;
        this.codCidade = codCidade;
        this.cnpj = cnpj;
        this.nome = nome;
        this.contato = contato;
        this.endereco = endereco;
    }
    
    public int getCodFornecedor() {
        return codFornecedor;
    }

   
    public void setCodFornecedor(int codFornecedor) {
        this.codFornecedor = codFornecedor;
    }


    public Cidade getCodCidade() {
        return codCidade;
    }


    public void setCodCidade(Cidade codCidade) {
        this.codCidade = codCidade;
    }


    public String getCnpj() {
        return cnpj;
    }


    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getContato() {
        return contato;
    }


    public void setContato(String contato) {
        this.contato = contato;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode() == hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.codFornecedor;
        return hash;
    }
    
    
    
    
}