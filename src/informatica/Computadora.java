
package informatica;


public class Computadora extends Producto {
    protected String modelo;
    protected int ram;
    protected int almacenamieto;
    protected boolean rgb;

    public Computadora() {
    }

    public Computadora(String modelo, int ram, int almacenamieto, boolean rgb) {
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamieto = almacenamieto;
        this.rgb = rgb;
    }

    public Computadora(String modelo, int ram, int almacenamieto, boolean rgb, double precio, String marca, int stock) {
        super(precio, marca, stock);
        this.modelo = modelo;
        this.ram = ram;
        this.almacenamieto = almacenamieto;
        this.rgb = rgb;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamieto() {
        return almacenamieto;
    }

    public void setAlmacenamieto(int almacenamieto) {
        this.almacenamieto = almacenamieto;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
    
    
    
}
