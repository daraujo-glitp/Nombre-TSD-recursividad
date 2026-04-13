package EjerciciosDeRecursividad;

import java.util.Scanner;

public class Ejercicio8 {

    // copiar cadena caracter por caracter
    public static String copiar(String texto, int i) {
        if (i == texto.length()) {
            return "";
        }
        return texto.charAt(i) + copiar(texto, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String texto = sc.nextLine();

        String copia = copiar(texto, 0);

        System.out.println("Cadena copiada: " + copia);
    }
}