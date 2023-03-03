import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Crear tabla bidimensional de tamaño 20x30
        char[][] tabla = new char[20][30];

        // Crear objeto Random para generar caracteres al azar
        Random random = new Random();

        // Llenar la tabla con caracteres aleatorios
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {
                tabla[i][j] = (char) (random.nextInt(26) + 'a'); // Generar letra aleatoria
            }
        }

        // Mostrar la tabla generada
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println(); // Salto de línea después de cada fila
        }
    }
}