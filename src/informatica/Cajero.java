
package informatica;


public class Cajero {
    private Impresora impresoras;
    private Computadora computadoras;
    private Accesorio accesorios;

    public Cajero(Impresora impresoras, Computadora computadoras, Accesorio accesorios) {
        this.impresoras = impresoras;
        this.computadoras = computadoras;
        this.accesorios = accesorios;
    }

    public Impresora getImpresoras() {
        return impresoras;
    }

    public void setImpresora1(Impresora impresoras) {
        this.impresoras = impresoras;
    }

    public Computadora getComputadoras() {
        return computadoras;
    }

    public void setCompu1(Computadora compu1) {
        this.computadoras = computadoras;
    }

    public Accesorio getAccesorios() {
        return accesorios;
    }

    public void setAccesorio1(Accesorio accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String toString() {
        return "Vendedor" + "impresora1=" + impresoras + ", compu1=" + computadoras + ", accesorio=" + accesorios + '}';
    }
    
    
    
    
    
}
