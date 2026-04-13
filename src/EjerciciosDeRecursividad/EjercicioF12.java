package EjerciciosDeRecursividad;

import java.util.Scanner;

public class EjercicioF12 {

    // suma de matriz
    public static int suma(int[][] m, int i, int j) {
        if (i == m.length) {
            return 0;
        }
        if (j == m[i].length) {
            return suma(m, i + 1, 0);
        }
        return m[i][j] + suma(m, i, j + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese filas: ");
        int f = sc.nextInt();

        System.out.print("Ingrese columnas: ");
        int c = sc.nextInt();

        int[][] matriz = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Ingrese valor: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int resultado = suma(matriz, 0, 0);

        System.out.println("Suma total: " + resultado);
    }
}