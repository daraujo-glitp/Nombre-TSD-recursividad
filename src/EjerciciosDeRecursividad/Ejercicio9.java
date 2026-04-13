package EjerciciosDeRecursividad;

import java.util.Scanner;

public class Ejercicio9 {

    // division usando restas
    public static int division(int a, int b) {
        if (a < b) {
            return 0;
        }
        return 1 + division(a - b, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el divisor: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("No se puede dividir entre cero");
        } else {
            int resultado = division(a, b);
            System.out.println("Resultado: " + resultado);
        }
    }
}