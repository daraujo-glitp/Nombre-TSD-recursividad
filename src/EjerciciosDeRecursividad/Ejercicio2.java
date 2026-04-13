package EjerciciosDeRecursividad;

import java.util.Scanner;

public class Ejercicio2 {

    public static int invertir(int n, int resultado) {
        if (n == 0) {
            return resultado;
        }
        return invertir(n / 10, resultado * 10 + (n % 10));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        int invertido = invertir(num, 0);

        System.out.println("Numero invertido: " + invertido);
    }
}