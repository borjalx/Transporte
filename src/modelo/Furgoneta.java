
package modelo;


public class Furgoneta extends VehiculoCarga{

    private boolean refrigeracion;

    public Furgoneta(boolean refrigeracion, int PMA, String matricula) {
        super(PMA, matricula);
        this.refrigeracion = refrigeracion;
    }
    

    public boolean isRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(boolean refrigeracion) {
        this.refrigeracion = refrigeracion;
    }


    @Override
    public double calcularAlquiler(int dias) {
        
        double base = 50*dias;
        double carga = 20 * getPMA();
        double alquiler = base + carga;
        
        if(refrigeracion){
            alquiler += 10 * dias;
        }
        
        return alquiler;
    }

}
