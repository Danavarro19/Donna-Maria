package sennoramaria;

public class User {

    private final String nombreUsuario;
    private String contra;

    public User(String nombreUsuario, String contra) {
        this.nombreUsuario = nombreUsuario;
        this.contra = contra;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
