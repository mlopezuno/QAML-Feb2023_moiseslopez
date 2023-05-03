import Utilidades.Combustible;
import Utilidades.Marcas;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AereoTest {

    @Test
    public void tipoCombustible(){
        Aereo aereo = new Aereo(Combustible.TURBOSINA, Marcas.BOEING, false);
        System.out.println(aereo.getCombustible());
        Assert.assertEquals(aereo.getCombustible(),Combustible.TURBOSINA);
    }

    @Test
    public void modeloAvion(){
        Aereo aereo = new Aereo("Boeing 747");
        System.out.println(aereo.getModelo());
        Assert.assertEquals(aereo.getModelo(),"Boeing 747");
    }

    @Test
    public void comprobarSiAvionEsComercial(){
        Aereo aereo = new Aereo(Combustible.TURBOSINA, Marcas.BOEING, true);
        Assert.assertEquals(aereo.comercial,true);
    }
}
