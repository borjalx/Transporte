package transporte;

//Herencia : 

import java.util.ArrayList;
import modelo.Camion;
import modelo.Coche;
import modelo.Furgoneta;
import modelo.Microbus;
import modelo.Vehiculo;


public class Transporte {

    public static void main(String[] args) {
        
        Furgoneta furgo = new Furgoneta(true, 2500, "123H4T");
        Camion truck = new Camion(10000, "145R7U");
        Coche carro = new Coche(4, "341B2S");
        Microbus micro = new Microbus(10, "112Q3W");
        
        ArrayList<Vehiculo> flota = new ArrayList<>();
        
        flota.add(furgo);
        flota.add(truck);
        flota.add(carro);
        flota.add(micro);
        
        System.out.println("Lista de vehículos");
        for (Vehiculo vehiculo : flota) {
            
            System.out.println("Matricula = " + vehiculo.getMatricula() +
                               " / Alquiler = " + vehiculo.calcularAlquiler(8));
        }
        
        System.out.println("Todos los datos de cada vehículo");
        
        for (Vehiculo vehiculo : flota) {
            System.out.println("Vehículo con matrícula " + vehiculo.getMatricula());
            if(vehiculo instanceof Furgoneta){
                Furgoneta f = (Furgoneta) vehiculo;
                System.out.println("Es una furgoneta "+
                        " / Refrigeración " + f.isRefrigeracion() +
                        " / PMA = " + f.getPMA());
            }
            
        }
    }
    
}
