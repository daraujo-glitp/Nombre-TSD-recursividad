package EjerciciosDeRecursividad;

import java.util.Scanner;

public class EjercicioE11 {

    // suma de vector
    public static int suma(int[] v, int n) {
        if (n == 0) {
            return 0;
        }
        return v[n - 1] + suma(v, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamano del vector: ");
        int n = sc.nextInt();

        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese valor: ");
            v[i] = sc.nextInt();
        }

        int resultado = suma(v, n);

        System.out.println("Suma total: " + resultado);
    }
}