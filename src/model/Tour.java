package model;

public class Tour {
    private String nombre;
    private String ciudad;
    private double precio;
    private Guia guia;

    public Tour(String nombre, String ciudad, double precio, Guia guia) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        setPrecio(precio);
        this.guia = guia;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public Guia getGuia() { return guia; }
    public void setGuia(Guia guia) { this.guia = guia; }

    @Override
    public String toString() {
        return "Tour [Nombre=" + nombre + ", Ciudad=" + ciudad + ", Precio=" + precio + ", Guía=[" + guia + "]]";
    }
}