package Zadanie4;

import java.util.Scanner;

public class Main {
    public static double funkcja(double a, double b, double c) {
        double delta = b*b-4*a*c;

        return delta;
    }

    public static void mz(double delta, double a, double b) {
        if(delta == 0) {
            double x0 = -b / (2*a);
            System.out.println("x0 wynosi" + x0 + " delta wynosi: " + delta);
        }
        else if(delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2*a);
            double x2 = (-b + Math.sqrt(delta)) / (2*a);
            System.out.println("x1 i x2 wynoszą: " + x1 + " " + x2 + "delta wynosi: " + delta);
        }
        else if(delta < 0) {
            System.out.println("Brak rozwiązań" + " delta wynosi: " + delta);
        }
    }

    public static void main(String[] args) {
//        System.out.println(Math.pow(2,1));
//        b2-4*a*c

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj a,b,c: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = funkcja(a,b,c);
        mz(delta,a,b);

        double delta1 = funkcja(2,-3,7);
        mz(funkcja(2,-3,7),2,-3);
    }
}
