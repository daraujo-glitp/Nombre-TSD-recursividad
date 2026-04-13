package EjerciciosDeRecursividad;

import java.util.Scanner;

public class Ejercicio1 {

    // función recursiva para calcular el factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("No se puede calcular el factorial de un numero negativo");
        } else {
            int resultado = factorial(num);
            System.out.println("El factorial de " + num + " es: " + resultado);
        }
    }
}