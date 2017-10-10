package modelo;


public abstract class VehiculoCarga extends Vehiculo{

    private int PMA;
    
    public VehiculoCarga(int PMA, String matricula) {
        super(matricula);
        this.PMA = PMA;
    }

    public int getPMA() {
        return PMA;
    }

    public void setPMA(int PMA) {
        this.PMA = PMA;
    }

    
    
}
