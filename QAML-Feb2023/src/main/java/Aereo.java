public class Aereo extends VehiculoBase{

    public boolean comercial;
    public Aereo(Utilidades.Combustible tipoCombustible, Utilidades.Marcas marcas, boolean comercial) {
        super(tipoCombustible, marcas);
        this.comercial=comercial;
    }

    public Aereo(String modelo){
        super(modelo);
    }
}
