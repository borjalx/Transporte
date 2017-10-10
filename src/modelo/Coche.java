
package modelo;

public class Coche extends VehiculoPersona {

    public Coche(int plazas, String matricula) {
        super(plazas, matricula);
    }

    @Override
    public double calcularAlquiler(int dias) {
        
        double base = 50* dias;
        double alquiler = base + (1.5 * getPlazas() * dias);
        
        return alquiler;
    }

    
}
