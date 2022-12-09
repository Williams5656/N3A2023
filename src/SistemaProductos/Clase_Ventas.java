package SistemaProductos;

public class Clase_Ventas {
    
   
    int cantidad;
    double precio_total;

    public Clase_Ventas(int cantidad, double precio_total) {
        this.cantidad = cantidad;
        this.precio_total = precio_total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }   
}
