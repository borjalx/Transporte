
package modelo;


public class Microbus extends VehiculoPersona{

    public Microbus(int plazas, String matricula) {
        super(plazas, matricula);
    }

    @Override
    public double calcularAlquiler(int dias) {
        double base = 50 * dias;
        double alquiler = base + (2 * getPlazas());
        
        return alquiler;
    }

    
}
