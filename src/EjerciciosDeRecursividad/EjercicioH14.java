package EjerciciosDeRecursividad;

import java.util.Scanner;

public class EjercicioH14 {

    // funcion de ackermann
    public static int ackermann(int m, int n) {
        if (m == 0) return n + 1;
        if (m > 0 && n == 0) return ackermann(m - 1, 1);
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese m: ");
        int m = sc.nextInt();

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        if (m < 0 || n < 0) {
            System.out.println("Los valores deben ser positivos");
        } else {
            int resultado = ackermann(m, n);
            System.out.println("Resultado: " + resultado);
        }
    }
}