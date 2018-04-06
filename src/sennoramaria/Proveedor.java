package sennoramaria;

import java.util.ArrayList;

public class Proveedor {

    private String nombre;
    private ArrayList<Empresa> Empresas=new ArrayList<Empresa>();
    

    public Proveedor(String nombre, ArrayList<Empresa> empresas, String administrador) {
        this.nombre = nombre;
        Empresas = empresas;

    }


}
