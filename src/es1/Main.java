package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inserisci la base del primo rettangolo");
        Scanner sc = new Scanner(System.in);
        double w1 = Double.parseDouble(sc.nextLine());
        System.out.println("Inserisci l'altezza del primo rettangolo");
        double h1 = Double.parseDouble(sc.nextLine());
        System.out.println("Inserisci la base del secondo rettangolo");
        double w2 = Double.parseDouble(sc.nextLine());
        System.out.println("Inserisci l'altezza del secondo rettangolo");
        double h2 = Double.parseDouble(sc.nextLine());
        Rettangolo a = new Rettangolo(h1,w1);
        Rettangolo b = new Rettangolo(h2,w2);

        stampaRettangolo(a);
        stampaDueRettangoli(a,b);

    }
    private static void stampaRettangolo(Rettangolo x){
        System.out.println("Area = "+x.area());
        System.out.println("Perimetro = "+x.perimeter());
    }private static void stampaDueRettangoli(Rettangolo x, Rettangolo y){
        System.out.println("Area1 = "+x.area());
        System.out.println("Area2 = "+y.area());
        System.out.println("Perimetro1 = "+x.perimeter());
        System.out.println("Perimetro2 = "+y.perimeter());
        System.out.println("Somma delle aree = "+(x.area() + y.area()));
        System.out.println("Somma dei perimetri = "+(x.perimeter() + y.perimeter()));
    }

}
