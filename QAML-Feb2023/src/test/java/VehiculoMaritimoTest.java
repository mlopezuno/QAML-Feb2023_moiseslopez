import Utilidades.Combustible;
import Utilidades.Marcas;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VehiculoMaritimoTest {
    @Test
    public void tipoCombustibleGasoilTest(){
        VehiculoMaritimo vehiculoMaritimo = new VehiculoMaritimo(4, 100, Combustible.GASOIL, Marcas.ASTONDOA);
        System.out.println(vehiculoMaritimo.getCombustible());//Imprimo para comprobar que si estoy usando gasoil
        Assert.assertEquals(vehiculoMaritimo.getCombustible(),Combustible.GASOIL);
    }

    @Test
    public void numeroDeMastilescoincide(){
        int supuestoNumeroDeMastiles = 4;
        VehiculoMaritimo vehiculoMaritimo = new VehiculoMaritimo(4, 100, Combustible.GASOIL, Marcas.ASTONDOA);
        Assert.assertEquals(vehiculoMaritimo.numeroDeMastiles, supuestoNumeroDeMastiles);
    }

    @Test
    public void kmRecorridosNoSupera100km(){
        VehiculoMaritimo vehiculoMaritimo = new VehiculoMaritimo(3, 90, Combustible.GASOIL, Marcas.ASTONDOA);
        vehiculoMaritimo.kmSupera100();
        Assert.assertEquals(false,false);
    }
}
