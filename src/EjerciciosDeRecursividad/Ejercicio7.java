package EjerciciosDeRecursividad;

import java.util.Scanner;

public class Ejercicio7 {

    // mcd con euclides
    public static int mcd(int m, int n) {
        if (n == 0) {
            return m;
        }
        return mcd(n, m % n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();

        int resultado = mcd(a, b);

        System.out.println("MCD: " + resultado);
    }
}