package informatica;

import java.util.ArrayList;
import java.util.List;

public class Informatica {

    public static void main(String[] args) {

        List<Impresora> impresoras = new ArrayList<>();
        impresoras.add(new Impresora(50, "negro", 5000, "Hp", 3));
        impresoras.add(new Impresora(50, "blanco", 4500, "Philips", 1));

        List<Computadora> computadoras = new ArrayList<>();
        computadoras.add(new Computadora("O34", 128, 256, true, 30000, "hp", 6));
        computadoras.add(new Computadora("y456", 640, 128, true, 28000, "hp", 1));

        List<Accesorio> accesorios = new ArrayList<>();
        accesorios.add(new Accesorio("SI", 1000, "Samsung", 2));
        accesorios.add(new Accesorio("no", 2000, "Lg", 5));

        
        List<Cajero> vendedor = new ArrayList<>();
        vendedor.add ( new Cajero(impresoras.get(0), computadoras.get(1), accesorios.get(0)));
        vendedor.add ( new Cajero(impresoras.get(1), computadoras.get(0), accesorios.get(1)));
        
        System.out.println("Datos a mostrar");
        //System.out.println( vendedor.get(1));
        
        System.out.println(vendedor);
    }

}
