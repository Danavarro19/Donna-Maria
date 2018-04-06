package sennoramaria;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Venta {

    private ArrayList<Producto> venta;
    private DecimalFormat precioTotal = new DecimalFormat("#.##");
    private int cantProductos;

    public Venta() {
        this.venta= new ArrayList<Producto>();
    }

    public DecimalFormat getPrecioTotal() {
        return precioTotal;
    }

    public int getCantProductos() {
        return cantProductos;
    }

    public void agregarProducto(Producto producto){

    }
}



