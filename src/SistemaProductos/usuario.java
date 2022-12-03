
package SistemaProductos;

import javax.swing.JTextField;

public class usuario {
    int contraseña;
    String usuario;

    public usuario(int contraseña, String usuario) {
        this.contraseña = contraseña;
        this.usuario = usuario;
    }

    public int getContraseña() {
        return contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

}
