package ec.edu.epn.ProyectoGrupo1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class InventarioTest {

    Inventario inventario;

    @Before
    public void setUp(){
        inventario = new Inventario();
    }

    @Test
    public void given_name_product_when_exists_then_error() {
        boolean expected= inventario.verificarProducto("001");
        assertFalse(expected);
    }

}