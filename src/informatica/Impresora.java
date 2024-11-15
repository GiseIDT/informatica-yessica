package informatica;

public class Impresora extends Producto {

    protected int velocidad;

    public Impresora() {
    }
    protected String color;

    public Impresora(int velocidad, String color) {
        this.velocidad = velocidad;
        this.color = color;
    }

    public Impresora(int velocidad, String color, double precio, String marca, int stock) {
        super(precio, marca, stock);
        this.velocidad = velocidad;
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   
}
