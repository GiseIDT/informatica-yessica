
package informatica;


public class Accesorio extends Producto {
    protected String compatibilidad;

    public Accesorio() {
    }

    public Accesorio(String compatibilidad, double precio, String marca, int stock) {
        super(precio, marca, stock);
        this.compatibilidad = compatibilidad;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }
    
    
}
