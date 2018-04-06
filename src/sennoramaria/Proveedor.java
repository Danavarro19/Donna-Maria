package sennoramaria;

import java.util.ArrayList;

public class Proveedor {

    private String nombre;
    private ArrayList<String> Empresas=new ArrayList<String>();
    private String Administrador;

    public Proveedor(String nombre, ArrayList<String> empresas, String administrador) {
        this.nombre = nombre;
        Empresas = empresas;
        Administrador = administrador;
    }


}
