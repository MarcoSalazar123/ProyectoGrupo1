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

    public ArrayList<Producto> registrarProducto(Producto p) {
        if( this.verificarProducto(p.getCodigo())) {
            return this.productos;

        }else {
            this.productos.add(p);
            return this.productos;
        }
    }

    //Segunda historia de usuario == retirar productos

    public boolean verificarCantidad(String codigo, int cantidad) {
        for (Producto p : this.productos) {
            if (p.getCodigo().equals(codigo)) {
                if (p.getCantidad() >= cantidad) {
                    return true;
                }
            }
        }
        return false;
    }

}
