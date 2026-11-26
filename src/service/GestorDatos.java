package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Guia;
import model.Operador;
import model.Tour;

public class GestorDatos {
    public List<Tour> cargarTours(String rutaArchivo) {
        List<Tour> tours = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            int numeroLinea = 0;

            while ((linea = br.readLine()) != null) {
                numeroLinea++;
                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] partes = linea.split(";");
                if (partes.length != 8) {
                    System.out.println("Línea " + numeroLinea + " omitida: se esperaban 8 campos y se encontraron " + partes.length + ".");
                    continue;
                }

                try {
                    double precio = Double.parseDouble(partes[2].trim());
                    Operador operador = new Operador(partes[5].trim(), partes[6].trim(), partes[7].trim());
                    Guia guia = new Guia(partes[3].trim(), partes[4].trim(), operador);
                    Tour tour = new Tour(partes[0].trim(), partes[1].trim(), precio, guia);
                    tours.add(tour);
                } catch (NumberFormatException e) {
                    System.out.println("Línea " + numeroLinea + " omitida: precio no válido ('" + partes[2].trim() + "').");
                } catch (IllegalArgumentException e) {
                    System.out.println("Línea " + numeroLinea + " omitida: " + e.getMessage() + ".");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return tours;
    }
}