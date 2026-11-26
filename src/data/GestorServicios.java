package data;

import java.util.ArrayList;
import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

public class GestorServicios {

    public ArrayList<ServicioTuristico> crearServicios() {
        ArrayList<ServicioTuristico> servicios = new ArrayList<>();
        servicios.add(new RutaGastronomica("Ruta del Kuchen en Frutillar", 3, 4));
        servicios.add(new RutaGastronomica("Sabores de Puerto Varas", 4, 5));
        servicios.add(new PaseoLacustre("Paseo por el Lago Llanquihue", 2, "Catamarán"));
        servicios.add(new PaseoLacustre("Navegación al amanecer", 3, "Velero"));
        servicios.add(new ExcursionCultural("Museo Colonial Alemán", 2, "Frutillar"));
        servicios.add(new ExcursionCultural("Recorrido patrimonial", 3, "Iglesia del Sagrado Corazón"));
        return servicios;
    }
}
