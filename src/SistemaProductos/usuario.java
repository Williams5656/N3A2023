
package SistemaProductos;

public class usuario {
    int codigo;
    int cedula;
    int contraseña;
    String nombre;
    String usuarion;

    public usuario(int codigo, int cedula, int contraseña, String nombre, String usuarion) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.usuarion = usuarion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUssuarion() {
        return usuarion;
    }

    public void setUssuarion(String usuarion) {
        this.usuarion = usuarion;
    }
}
