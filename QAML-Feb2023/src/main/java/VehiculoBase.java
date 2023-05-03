import Utilidades.Combustible;
import Utilidades.Marcas;

public class VehiculoBase {
    private Combustible Combustible;
    public String Modelo;
    public Marcas Marca;
    protected int numeroLlantas;

    public VehiculoBase (Combustible tipoCombustible, Marcas marcas){
        this.Combustible=tipoCombustible;
        this.Marca=marcas;
    }

    public VehiculoBase(int numeroLlantas){
        this.numeroLlantas=numeroLlantas;
    }

    public VehiculoBase(String Modelo){
        this.Modelo=Modelo;
    }
    public boolean arrancarApagarVehiculo(boolean encender){
        System.out.println("El vehiculo necesita encender: "+encender);
        if (encender) {
            System.out.println("Vehiculo encendido");
            return true;
        }else {
            System.out.println("Vehiculo apagado");
            return false;
        }
    }

    public Combustible getCombustible(){
        return this.Combustible;
    }

    public Marcas getMarca(){
        return this.Marca;
    }

    public String getModelo(){
        return this.Modelo;
    }

    public int getNumeroLlantas(){
        return this.numeroLlantas;
    }
}