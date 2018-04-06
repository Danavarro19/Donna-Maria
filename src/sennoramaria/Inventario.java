package sennoramaria;

import java.util.ArrayList;

public class Inventario{

    private static Inventario inventario;
    private ArrayList<Producto> stock=new ArrayList<Producto>();

    private Inventario(){

    }

    public static Inventario getInstance(){
        if (inventario==null)
            inventario= new Inventario();
        return inventario;

    }

    /**
     * Toma un producto y lo agrega al stock
     * @param producto nuevo que se ofrecera en la tienda
     */
    public void addProducto(Producto producto){
        stock.add(producto);

    }

    /**
     * Toma un producto y lo remueve del stock
     * @param producto que no sera vendido en la tienda
     */
    public void removeProducto(Producto producto){
        stock.remove(producto);
    }


}
