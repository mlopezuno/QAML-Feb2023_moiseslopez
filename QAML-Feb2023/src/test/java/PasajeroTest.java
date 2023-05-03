import Utilidades.TipoPasajeroEnum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasajeroTest {
    @Test
    public void nombrePasajeroTest(){
        //Precondiciones
        String nombreEsperado = "Pablo Aguilar";
        TipoPasajeroEnum tipoPasajeroEsperado = TipoPasajeroEnum.VIP;

        //Empieza el test
        Pasajero pabloAguilar = new Pasajero();
        pabloAguilar.setPasajeroNombre("Pablo Aguilar");
        pabloAguilar.setTipoPasajero(TipoPasajeroEnum.VIP);

        String nombreActual = pabloAguilar.getPasajeroNombre();
        TipoPasajeroEnum tipoPasajeroActual = pabloAguilar.getTipoPasajero();

        Assert.assertEquals(nombreActual, nombreEsperado);
        Assert.assertEquals(tipoPasajeroActual, tipoPasajeroEsperado);
    }

    @Test
    public void tipoPasajeroNoEsVIP(){
        //Precondiciones
        TipoPasajeroEnum tipoPasajeroEsperado = TipoPasajeroEnum.PREMIUM;
        TipoPasajeroEnum tipoPasajeroNoEsperado = TipoPasajeroEnum.VIP;

        //Empieza el test
        Pasajero esterGonzalez = new Pasajero();
        esterGonzalez.setTipoPasajero(tipoPasajeroEsperado);//El setTipoPasajero es PREMIUM

        TipoPasajeroEnum tipoPasajeroActual = esterGonzalez.getTipoPasajero();//el getTipoPasajero me trae el PREMIUM

        Assert.assertNotEquals(tipoPasajeroActual, tipoPasajeroNoEsperado);


    }
}
