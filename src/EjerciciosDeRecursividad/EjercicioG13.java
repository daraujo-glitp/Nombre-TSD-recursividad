package EjerciciosDeRecursividad;

import java.util.Scanner;

public class EjercicioG13 {

    // fibonacci recursivo
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("El numero debe ser positivo");
        } else {
            int resultado = fib(n);
            System.out.println("Resultado: " + resultado);
        }
    }
}