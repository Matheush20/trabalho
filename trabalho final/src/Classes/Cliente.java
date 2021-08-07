
package Classes;

import java.util.Objects;


public class Cliente {

    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }
    
    private int id;
    private String cnpj;
    private String endereco;
    private String nome;
    private String telefone;
    
    public Cliente() {
    }

    public Cliente(String cnpj, String endereco, String nome, String telefone, int id) {
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
       
    }

    public String getCnpj() {
        return cnpj;
    }

  
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

   
    public String getEndereco() {
        return endereco;
    }

   
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

  
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

 


    @Override
    public boolean equals(Object o) {
        return o.hashCode()== hashCode();
     
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.cnpj);
        return hash;
    }



 
    
    
    
    
    
    
    
    
}
