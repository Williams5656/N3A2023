package SistemaProductos;

public class Clase_Ventas {
    
    protected String nombre;
    protected int cantidad;
    protected double precio;
    protected double precio_total;

    public Clase_Ventas(String nombre, int cantidad, double precio, double precio_total) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.precio_total = precio_total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }
    
    

   
}
