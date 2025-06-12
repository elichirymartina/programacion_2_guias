package poo.ej_1_GestionDePedidos;

public class ItemPedido {
    public Producto producto;
    int cantidadSolicitada;


    public ItemPedido(Producto producto, int cantidadSolicitada) {
        this.producto = producto;
        this.cantidadSolicitada = cantidadSolicitada;
    }

    // Getters
    public Producto obtenerProducto() {
        return producto;
    }
    public int obtenerCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void establecerCantidadSolicitada(int nuevaCantidad){
        this.cantidadSolicitada = nuevaCantidad;
    }

    public double calcularSubtotal() {
        return producto.obtenerPrecio() * cantidadSolicitada;
    }
}
