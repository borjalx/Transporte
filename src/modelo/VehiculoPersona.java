
package modelo;

public abstract class VehiculoPersona extends Vehiculo {

    private int plazas;

    public VehiculoPersona(int plazas, String matricula) {
        super(matricula);
        this.plazas = plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

}
