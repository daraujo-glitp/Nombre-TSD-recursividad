package EjerciciosDeRecursividad;

import java.util.Scanner;

public class Ejercicio6 {

    // potencia recursiva
    public static int potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * potencia(base, exp - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exp = sc.nextInt();

        if (exp < 0) {
            System.out.println("El exponente no puede ser negativo");
        } else {
            int resultado = potencia(base, exp);
            System.out.println("Resultado: " + resultado);
        }
    }
}