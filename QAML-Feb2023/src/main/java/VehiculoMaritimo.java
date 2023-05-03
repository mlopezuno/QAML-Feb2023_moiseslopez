public class VehiculoMaritimo extends VehiculoBase{

    public int numeroDeMastiles;
    public int kmRecorridos;

    public VehiculoMaritimo(int numeroDeMastiles, int kmRecorridos, Utilidades.Combustible tipoCombustible, Utilidades.Marcas marcas) {
        super(tipoCombustible, marcas);
        this.numeroDeMastiles=numeroDeMastiles;
        this.kmRecorridos=kmRecorridos;
    }

    public boolean kmSupera100 (){
        if (kmRecorridos>100) {
            System.out.println("Superaste 100km.");
            return true;
        }else {
            System.out.println("No superaste 100km.");
            return false;
        }
    }
}
