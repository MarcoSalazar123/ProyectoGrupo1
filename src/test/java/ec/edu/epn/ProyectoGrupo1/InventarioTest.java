package ec.edu.epn.ProyectoGrupo1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class InventarioTest {

    Inventario inventario;
    Inventario inventario2;
    Producto producto;
    @Before
    public void setUp(){
        inventario = new Inventario();
        inventario2 = new Inventario();
        producto = new Producto("002","Manzanas",15);
        inventario2.productos.add(producto);
    }
    //Primera historia de usuario == Registrar un producto
    @Test
    public void given_name_product_when_exists_then_error() {
        boolean expected= inventario.verificarProducto("001");
        assertFalse(expected);
    }

    @Test
    public void given_product_when_register_then_registeredProduct() {
        assertArrayEquals(inventario.registrarProducto(producto).toArray(),inventario2.productos.toArray());

    }



}