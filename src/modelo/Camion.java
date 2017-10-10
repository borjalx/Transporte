
package modelo;

public class Camion extends VehiculoCarga{

    public Camion(int PMA, String matricula) {
        super(PMA, matricula);
    }

    @Override
    public double calcularAlquiler(int dias) {
        
        
        double alquiler = super.calcularAlquiler(dias)+40;
        
        return alquiler;
    }

     
}
