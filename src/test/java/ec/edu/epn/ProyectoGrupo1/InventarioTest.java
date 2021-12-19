package ec.edu.epn.ProyectoGrupo1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class InventarioTest {

    Inventario inventario;
    Inventario inventario2;
    Inventario inventario3;
    Producto producto;
    Producto producto2;
    @Before
    public void setUp(){
        inventario = new Inventario();
        inventario2 = new Inventario();
        inventario3 = new Inventario();
        producto2 = new Producto("001","Coca Cola",8);
        producto = new Producto("002","Manzanas",15);
        inventario2.productos.add(producto);
        inventario3.productos.add(producto2);
    }

    @Test
    public void given_name_product_when_exists_then_error() {
        boolean expected= inventario.verificarProducto("001");
        assertFalse(expected);
    }

    @Test
    public void given_product_when_register_then_registeredProduct() {
        assertArrayEquals(inventario.registrarProducto(producto).toArray(),inventario2.productos.toArray());

    }

    //Segunda historia de usuario == retirar productos

    @Test
    public void given_amount_product_when_sufficientQuantity_then_ok() {
        boolean expected= inventario3.verificarCantidad("001", 8);
        assertTrue(expected);
    }

}