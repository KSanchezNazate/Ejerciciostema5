import java.util.Scanner;

public class TresEnRaya {

    // Matriz de juego de 3x3
    private static char[][] tablero = new char[3][3];

    // Símbolos de los jugadores
    private static char jugador1 = 'X';
    private static char jugador2 = 'O';

    // Jugador actual
    private static char jugadorActual = jugador1;

    // Indica si el juego ha terminado
    private static boolean finJuego = false;

    // Método para inicializar el tablero
    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    // Método para dibujar el tablero de juego
    private static void dibujarTablero() {
        System.out.println("Tablero de juego:");
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // Método para leer la jugada del jugador
    private static void leerJugada() {
        Scanner scanner = new Scanner(System.in);
        int fila = -1;
        int columna = -1;
        while (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
            System.out.print("Jugador " + jugadorActual + ", introduce la fila (0-2): ");
            fila = scanner.nextInt();
            System.out.print("Jugador " + jugadorActual + ", introduce la columna (0-2): ");
            columna = scanner.nextInt();
            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Jugada no válida. Introduce valores entre 0 y 2.");
            }
        }
        if (tablero[fila][columna] != '-') {
            System.out.println("Jugada no válida. La celda ya está ocupada.");
            leerJugada();
        } else {
            tablero[fila][columna] = jugadorActual;
        }
    }

    // Método para cambiar el jugador actual
    private static void cambiarJugador() {
        if (jugadorActual == jugador1) {
            jugadorActual = jugador2;
        } else {
            jugadorActual = jugador1;
        }
    }

    // Método para comprobar si el juego ha terminado
    private static void comprobarFinJuego() {
        // Comprobación de las filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                finJuego = true;
            }
        }
        // Comprobación de las columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] != '-' && tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j]) {
                finJuego = true;
            }
        }
        // Comprobación de las diagonales
        if (tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            finJuego = true;
        }
        if (tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            finJuego = true;
        }
    }

    // Método principal
    public static void main(String[] args) {
        inicializarTablero();
        while (!finJuego) {
            dibujarTablero();
            leerJugada();
            comprobarFinJuego();
            cambiarJugador();
        }
        dibujarTablero();
        System.out.println("Fin del juego. Ha ganado el jugador " + jugadorActual);
    }
}

