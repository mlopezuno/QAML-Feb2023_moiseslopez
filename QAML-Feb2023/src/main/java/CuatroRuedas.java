import Utilidades.Combustible;

public class CuatroRuedas extends  VehiculoBase{
    public CuatroRuedas(Utilidades.Combustible tipoCombustible, Utilidades.Marcas marcas) {
        super(tipoCombustible, marcas);
    }

    public CuatroRuedas(int numeroLlantas){
        super(numeroLlantas);
    }
}
