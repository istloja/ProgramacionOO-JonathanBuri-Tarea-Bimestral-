package D8_Productos;
public class Productos {
    private String Nombre;
    private double Precio;

    public Productos() {
    }

    public Productos(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

   
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    
}
