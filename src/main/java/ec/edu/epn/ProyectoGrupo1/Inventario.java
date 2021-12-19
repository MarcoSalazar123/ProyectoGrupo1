package ec.edu.epn.ProyectoGrupo1;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Producto> productos = new ArrayList<Producto>();

    public boolean verificarProducto(String s) {
        for (Producto p : this.productos) {
            if (p.getCodigo().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
