package EjerciciosDeRecursividad;

import java.util.Scanner;

public class Ejercicio5 {

    // suma recursiva
    public static int suma(int n) {
        if (n == 1) {
            return 1;
        }
        return n + suma(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("El numero debe ser mayor que cero");
        } else {
            int resultado = suma(num);
            System.out.println("Resultado: " + resultado);
        }
    }
}