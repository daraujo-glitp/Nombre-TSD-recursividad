package EjerciciosDeRecursividad;

import java.util.Scanner;

public class Ejercicio4 {

    // suma recursiva de digitos
    public static int sumaDigitos(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = num * -1; // por si es negativo
        }

        int resultado = sumaDigitos(num);

        System.out.println("Suma de digitos: " + resultado);
    }
}