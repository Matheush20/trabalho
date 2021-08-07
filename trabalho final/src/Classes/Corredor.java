
package Classes;



public class Corredor {
    
   private int codCorredor;
   private Alojamento codAlojamento;

    public Corredor() {
    }

    public Corredor(int codCorredor, Alojamento codAlojamento) {
        this.codCorredor = codCorredor;
        this.codAlojamento = codAlojamento;
    }

    
    public int getCodCorredor() {
        return codCorredor;
    }

    
    public void setCodCorredor(int codCorredor) {
        this.codCorredor = codCorredor;
    }

  
    public Alojamento getCodAlojamento() {
        return codAlojamento;
    }

   
    public void setCodAlojamento(Alojamento codAlojamento) {
        this.codAlojamento = codAlojamento;
    }

    @Override
    public boolean equals(Object o) {
        return o.hashCode() == hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.codCorredor;
        return hash;
    }
   
   
    
    
    
    
    
}
