
package Classes;

import java.util.List;


public class Corredor {
    
    private int numero_corredor;
    private List<Receptaculo>receptaculo;

    public Corredor() {
    }

    public Corredor(int numero_corredor, List<Receptaculo> receptaculo) {
        this.numero_corredor = numero_corredor;
        this.receptaculo = receptaculo;
    }

    public int getNumero_corredor() {
        return numero_corredor;
    }

    
    public void setNumero_corredor(int numero_corredor) {
        this.numero_corredor = numero_corredor;
    }

    
    public List< Receptaculo> getReceptaculo() {
        return receptaculo;
    }

   
    public void setReceptaculo(List< Receptaculo> receptaculo) {
        this.receptaculo = receptaculo;
    }

    
    
    
}
