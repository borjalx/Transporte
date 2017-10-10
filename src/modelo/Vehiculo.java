/*
Calse vehiculo
 */

package modelo;

public abstract class Vehiculo {
  
    private String matricula;
    
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }    
    
    public double calcularAlquiler(int dias){
        return 50 * dias;
    }
}
