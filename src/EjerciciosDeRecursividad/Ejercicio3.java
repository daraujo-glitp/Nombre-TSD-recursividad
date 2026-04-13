package EjerciciosDeRecursividad;

import java.util.Scanner;

public class Ejercicio3 {

    // suma recursiva
    public static double suma(int n) {
        if (n == 1) {
            return 1;
        }
        return (1.0 / n) + suma(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("El numero debe ser mayor que cero");
        } else {
            double resultado = suma(num);
            System.out.println("Resultado: " + resultado);
        }
    }
}