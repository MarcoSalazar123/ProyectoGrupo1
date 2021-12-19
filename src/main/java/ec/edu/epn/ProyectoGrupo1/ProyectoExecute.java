package ec.edu.epn.ProyectoGrupo1;

public class ProyectoExecute {
    public static void main(String[] args){
        System.out.println(" == Proyecto Execute ==");

        Inventario inventario = new Inventario();
        Producto producto = new Producto("001", "Coca Cola", 50);
        inventario.registrarProducto(producto);
        System.out.println(inventario.productos);

        System.out.println("\n == Segunda historia de usuario ==");

        inventario.retirarCantidadProducto("001",25);
        System.out.println(inventario.productos);

    }
}