package D5_Libro;

public class Ejecutar extends Libro {
    public static void main(String[] args) {
        Libro L1 = new Libro("Las Rosas", "12531", "Artuto", 120);
        Libro L2 = new Libro("Los Mares", "12546", "Cristian", 125);
        System.out.println(L1.toString());
        System.out.println(L2.toString());
        System.out.println(L1.Mayor(0));
    }

    public Ejecutar(String los_Mares, String string, String cristian, int i) {
        super(los_Mares, string, cristian, i);
    }
}
    

