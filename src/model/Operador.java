package model;

public class Operador {
    private String nombre;
    private String ubicacion;
    private String numero;

    public Operador() {}

    public Operador(String nombre, String ubicacion, String numero) {
        setNombre(nombre);
        this.ubicacion = ubicacion;
        this.numero = numero;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del operador no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Ubicación: " + ubicacion + ", Número: " + numero;
    }
}