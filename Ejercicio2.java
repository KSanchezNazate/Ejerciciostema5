public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int numero;
        do {
            System.out.print("Introduce un número entre 0 y 9 (-1 para salir): ");
            numero = sc.nextInt();
            if (numero >= 0 && numero <= 9) {
                numeros[numero]++;
            }
        } while (numero != -1);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número " + i + " se ha introducido " + numeros[i] + " veces.");
        }
    }
}