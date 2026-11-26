package app;

import java.util.List;
import java.util.Scanner;
import model.Tour;
import service.GestorDatos;

public class Main {
    public static void main(String[] args) {
        GestorDatos gestor = new GestorDatos();
        List<Tour> tours = gestor.cargarTours("resources/tours.txt");

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Todos los tours (" + tours.size() + ") ===");
        for (Tour t : tours) {
            System.out.println(t);
        }

        System.out.println("\n=== Filtro por precio maximo ===");
        double precioMax = -1;
        while (precioMax < 0) {
            System.out.print("Ingrese precio maximo (solo numeros, ej: 50000): ");
            String texto = sc.nextLine().trim().replace(",", ".");
            try {
                precioMax = Double.parseDouble(texto);
                if (precioMax < 0) {
                    System.out.println("El precio no puede ser negativo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un numero valido.");
            }
        }

        int encontrados = 0;
        for (Tour t : tours) {
            if (t.getPrecio() <= precioMax) {
                System.out.printf("%s - $%.0f%n", t.getNombre(), t.getPrecio());
                encontrados++;
            }
        }
        if (encontrados > 0) {
            System.out.println("Total: " + encontrados);
        } else {
            System.out.println("No se encontraron tours con ese precio.");
        }

        System.out.println("\n=== Busqueda por operador ===");
        System.out.print("Ingrese nombre del operador: ");
        String operadorBuscado = sc.nextLine().trim();

        if (operadorBuscado.isEmpty()) {
            System.out.println("Debe ingresar un nombre para buscar.");
        } else {
            int coincidencias = 0;
            for (Tour t : tours) {
                if (t.getGuia().getOperador().getNombre().toLowerCase().contains(operadorBuscado.toLowerCase())) {
                    System.out.println(t.getNombre() + " - guia: " + t.getGuia().getNombre()
                            + " - operador: " + t.getGuia().getOperador().getNombre());
                    coincidencias++;
                }
            }
            if (coincidencias == 0) {
                System.out.println("No hay tours asociados a ese operador.");
            }
        }

        sc.close();
    }
}