
package SistemaProductos;

import javax.swing.JTextField;

public class usuario {
    int contraseña;
    String usuario;
    int cedula;
    String codigo;

    public usuario(int contraseña, String usuario, int cedula, String codigo) {
        this.contraseña = contraseña;
        this.usuario = usuario;
        this.cedula = cedula;
        this.codigo = codigo;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
