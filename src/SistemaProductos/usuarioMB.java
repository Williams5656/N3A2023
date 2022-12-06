
package SistemaProductos;

import javax.swing.JTextField;

public class usuarioMB {
    int codigo;
    String nombre;
    String usuario;
    String contraseña;
    int cedula;
    public usuarioMB(){
    }

    public usuarioMB(int codigo, String nombre, String usuario, String contraseña, int cedula) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
}
