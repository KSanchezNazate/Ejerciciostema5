/*Producir un algoritmo que el usuario introduzca notas que quiera en una tabla. Al final usar -1 para salir, mostrar todas las calificaciones y su media. */

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<Double>();
        double nota = 0.0;
        do {
            System.out.println("Ingrese una nota (o -1 para salir):");
            nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notas.add(nota);
            } else if (nota != -1) {
                System.out.println("Nota inválida, debe estar entre 0 y 10.");
            }
        } while (nota != -1);
        System.out.println("Notas ingresadas:");
        for (Double n : notas) {
            System.out.println(n);
        }
        if (notas.size() > 0) {
            double sum = 0;
            for (Double n : notas) {
                sum += n;
            }
            double media = sum / notas.size();
            System.out.println("Media de las notas ingresadas: " + media);
        } else {
            System.out.println("No se ingresaron notas.");
        }
    }
}
