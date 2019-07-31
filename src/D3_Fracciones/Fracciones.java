package D3_Fracciones;

import java.util.Scanner;

public class Fracciones {

    private int num;
    private int den;

    public Fracciones() {
    }

    public Fracciones(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fracciones  objeto = new Fracciones();
        System.out.println("Ingrese el primer numero: ");
        objeto.getNum();
        System.out.println("Ingrese el denominador: ");
        objeto.getDen();
             

    }

}
