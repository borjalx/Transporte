
package modelo;

public class Camion extends VehiculoCarga{

    public Camion(int PMA, String matricula) {
        super(PMA, matricula);
    }

    @Override
    public double calcularAlquiler(int dias) {
        
        double base = 50*dias;
        double carga = 50* getPMA();
        double alquiler = base+carga+40;
        
        return alquiler;
    }

     
}
