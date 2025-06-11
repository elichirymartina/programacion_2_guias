package gestionDePedidos;

public class Producto {
    String nombre;
    double precio;
    int cantidadDisponible;

    public Producto(String nombre, double precio, int cantidadDisponible){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    //getters

    public String obtenerNombre (){
        return nombre;
    }

    public double obtenerPrecio(){
        return precio;
    }

    public int obtenerCantidadDisponible(){
        return cantidadDisponible;
    }

    public void establecerCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void reducirCantidad(int cantidad) {
        this.cantidadDisponible -= cantidad;
    }

}
