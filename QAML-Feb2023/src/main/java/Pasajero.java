import Utilidades.ITipoPasajero;
import Utilidades.TipoPasajeroEnum;
import java.util.HashMap;
import java.util.Map;

public class Pasajero implements ITipoPasajero, IDAtosPersonalesPasajero {
    Map<Integer, String> tablaPasajeros = new HashMap<>();
    private Integer idPasajero;
    private String nombrePasajero;
    private TipoPasajeroEnum tipoPasajeroEnum;

    public Pasajero(){
        tablaPasajeros.put(1, "Pablo Gutierrez");
        tablaPasajeros.put(5, "Ester Gonzalez");
        tablaPasajeros.put(10, "Martha Debayle");
    }

    @Override
    public String getPasajeroNombre() {//aqui tiene que estar igual que en la interfaz
        return this.nombrePasajero;
    }

    @Override
    public void setPasajeroNombre(String pasajeroNombre) {
        this.nombrePasajero=pasajeroNombre;
    }

    @Override
    public TipoPasajeroEnum getTipoPasajero() {
        return this.tipoPasajeroEnum;
    }

    @Override
    public void setTipoPasajero(TipoPasajeroEnum tipoPasajero) {
        this.tipoPasajeroEnum=tipoPasajero;
    }
}
