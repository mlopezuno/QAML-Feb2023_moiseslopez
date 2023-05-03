import Utilidades.Combustible;
import Utilidades.Marcas;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CuatroRuedasTest {
    @Test
    public void nombreMarca(){
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOLINA, Marcas.CHEVROLET);
        cuatroRuedas.getMarca();
        System.out.println(cuatroRuedas.getMarca());
        Assert.assertEquals(cuatroRuedas.getMarca(),Marcas.CHEVROLET);
    }

    @Test
    public void numeroDeLlantas(){
        CuatroRuedas cuatroRuedas = new CuatroRuedas(4);
        System.out.println(cuatroRuedas.getNumeroLlantas());
        Assert.assertEquals(cuatroRuedas.getNumeroLlantas(),4);
    }

    @Test
    public void encenderCuatroRuedasTest(){
        CuatroRuedas cuatroRuedas = new CuatroRuedas(Combustible.GASOLINA, Marcas.MAZDA);
        boolean encendio = cuatroRuedas.arrancarApagarVehiculo(true);
        Assert.assertEquals(encendio, true);
    }
}
