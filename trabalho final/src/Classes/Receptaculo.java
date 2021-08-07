
package Classes;

import java.util.List;


public class Receptaculo {
    
    
    private  List<Produto> prod;
    private int numero_recept;
    private Corredor localizacao;

    public Receptaculo() {
    }

    public Receptaculo(List<Produto> prod, int numero_recept, Corredor localizacao) {
        this.prod = prod;
        this.numero_recept = numero_recept;
        this.localizacao = localizacao;
    }

  
    public List<Produto> getProd() {
        return prod;
    }

    public void setProd(List<Produto> prod) {
        this.prod = prod;
    }

    
    public int getNumero_recept() {
        return numero_recept;
    }

   
    public void setNumero_recept(int numero_recept) {
        this.numero_recept = numero_recept;
    }

    public Corredor getLocalizacao() {
        return localizacao;
    }

   
    public void setLocalizacao(Corredor localizacao) {
        this.localizacao = localizacao;
    }
    
    
    
    
    
    
    
   
    
    
}
