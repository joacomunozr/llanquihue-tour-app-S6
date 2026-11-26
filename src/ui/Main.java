package ui;

import data.GestorServicios;
import java.util.ArrayList;
import model.ServicioTuristico;

public class Main {
    public static void main(String[] args) {
        GestorServicios gestor = new GestorServicios();
        ArrayList<ServicioTuristico> servicios = gestor.crearServicios();
        for (ServicioTuristico s : servicios) {
            System.out.println(s);
        }
    }
}