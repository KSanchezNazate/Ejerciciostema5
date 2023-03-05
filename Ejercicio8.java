import java.util.Scanner;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Definimos la posición del barco al azar
        //el random es para que el barco aparezca en una posicion aleatoria.
        int filaBarco = rand.nextInt(4);
        int columnaBarco = rand.nextInt(4);

        // Inicializamos el tablero con todas las casillas ocultas
        char[][] tablero = new char[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = '?';
            }
        }

        // Bucle principal del juego
        boolean encontrado = false;
        while (!encontrado) {
            // Imprimimos el tablero actual
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }

            // Pedimos al usuario que introduzca las coordenadas
            System.out.print("¿Qué columna? ");
            int columna = sc.nextInt() - 1;
            System.out.print("¿Qué fila? ");
            int fila = sc.nextInt() - 1;

            // Comprobamos si el usuario ha acertado o no
            if (fila == filaBarco && columna == columnaBarco) {
                tablero[fila][columna] = 'X';
                encontrado = true;
                System.out.println("Tocado y hundido");
            } else {
                tablero[fila][columna] = '~';
                System.out.println("Agua");
            }
        }

        // Imprimimos el tablero final
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("¡Ha ganado!");
    }
}