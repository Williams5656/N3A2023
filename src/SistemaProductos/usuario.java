
package SistemaProductos;

public class usuario {
    int contraseña=1234;
    String usuarion="admin";

    public usuario(int contraseña, String usuarion) {
        this.contraseña = contraseña;
        this.usuarion = usuarion;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuarion() {
        return usuarion;
    }

    public void setUsuarion(String usuarion) {
        this.usuarion = usuarion;
    }
}
