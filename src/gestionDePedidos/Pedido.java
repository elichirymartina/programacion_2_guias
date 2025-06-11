package gestionDePedidos;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    private ArrayList<ItemPedido> items;
    public String idPedido;
    public String estado;

    public Pedido (String IdPedido){
        this.idPedido = idPedido;
        this.estado = "pedido";
        this.items = new ArrayList<>();
    }

   public void agregarItem(ItemPedido item){
        items.add(item);
   }

   public void calcularTotal() {

        double total = 0;

        for (int i = 0; i< items.size(); i++) {
            total += items.get(i).calcularSubtotal();
        }

    }

    public void validarDisponibilidad(ItemPedido item, Scanner scanner){
        Producto producto = item.obtenerProducto();

        while (item.obtenerCantidadSolicitada() > producto.obtenerCantidadDisponible()){
            System.out.println("Cantidad solicitada de " + producto.obtenerNombre() +
                    " supera el stock (" + producto.obtenerCantidadDisponible() + ").");
            System.out.print("Ingrese una nueva cantidad válida: ");
            int nuevaCantidad = scanner.nextInt();
            item.establecerCantidadSolicitada(nuevaCantidad);
        }

    }

    public void procesarPedido() {
        for (ItemPedido item : items) {
            Producto producto = item.obtenerProducto();
            int empaquetado = 0;
            int cantidadSolicitada = item.obtenerCantidadSolicitada();

            do {
                producto.reducirCantidad(1);
                empaquetado++;
                System.out.println("Empacando " + producto.obtenerNombre() + "... ("
                        + empaquetado + "/" + cantidadSolicitada + ")");
            } while (empaquetado < cantidadSolicitada && producto.obtenerCantidadDisponible() > 0);
        }

        cambiarEstado("Completado");
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    // Getters
    public String obtenerIdPedido() { return idPedido; }
    public String obtenerEstado() { return estado; }
    public ArrayList<ItemPedido> obtenerItems() { return items; }
}
