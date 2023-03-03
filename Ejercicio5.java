public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una palabra y después # : ");
        String palabra = sc.nextLine();
        sc.close();
        // Quitamos el "#" final
        palabra = palabra.substring(0, palabra.length()-1);
        // Creamos una cadena invertida de la palabra usando StringBuilder que es más eficiente que String para concatenar cadenas de caracteres.
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
        // Comparamos las dos cadenas
        if (palabra.equals(palabraInvertida)) {
            System.out.println(palabra + " es un palíndromo");
        } else {
            System.out.println(palabra + " no es un palíndromo");
        }
    }
}