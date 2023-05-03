import Utilidades.Combustible;
import Utilidades.Marcas;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DosRuedasTest {
    @Test //anotacion o descripcion de metodo
    public void encenderDosRuedasTest(){//metodos de prueba siempre deben ser publicos
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA, Marcas.HONDA);
        //Si yo le doy true a arrancarApagarVehiculo tiene que regresar un true
        boolean encendio = dosRuedas.arrancarApagarVehiculo(true);
        Assert.assertEquals(encendio, true);
    }

    @Test
    public void tipoCombustibleGasolinaTest(){
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA, Marcas.HONDA);
        System.out.println(dosRuedas.getCombustible());
        Assert.assertEquals(dosRuedas.getCombustible(),Combustible.GASOLINA);
    }

    @Test
    public void tipoCombustibleIsNotTurbosina(){
        DosRuedas dosRuedas = new DosRuedas(Combustible.GASOLINA, Marcas.HONDA);
        System.out.println(dosRuedas.getCombustible());
        Assert.assertNotEquals(dosRuedas.getCombustible(),Combustible.TURBOSINA);//Comparo que no son iguales
    }
}
