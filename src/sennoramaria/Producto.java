package sennoramaria;

import java.text.DecimalFormat;

/**
 * Producto es la abstraccion de un producto disponible a la venta en la tienda de la sennora Maria
 */
public class Producto {

    private DecimalFormat precio= new DecimalFormat("#.##");
    private String nombre;
    //con el atributo cantidad pdremos controlar la cantidad de productos tanto en el inventario como en la venta/compra
    private int cantidad;

    public Producto(String nombre, DecimalFormat precio){

        this.cantidad =0;
        this.nombre=nombre;
        this.precio=precio;

    }

    public DecimalFormat getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(DecimalFormat precio){
        this.precio=precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
