package model;

public class Guia {
    private String nombre;
    private String numero;
    private Operador operador;

    public Guia(String nombre, String numero, Operador operador) {
        setNombre(nombre);
        this.numero = numero;
        setOperador(operador);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del guía no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public Operador getOperador() { return operador; }
    public void setOperador(Operador operador) {
        if (operador == null) {
            throw new IllegalArgumentException("El guía debe tener un operador");
        }
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Número: " + numero + ", Operador: [" + operador + "]";
    }
}