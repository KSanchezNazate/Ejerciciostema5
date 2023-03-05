import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String nombre;
        int numEmpleado;
        int numSeguridadSocial;
        HashMap<Integer, String> hashEmpleado = new HashMap<Integer, String>();
        HashMap<String, Integer> hashEmpleado2 = new HashMap<String, Integer>();
        HashMap<Integer, Integer> hashEmpleado3 = new HashMap<Integer, Integer>();
        do {
            System.out.println("1. Añadir empleado");
            System.out.println("2. Buscar empleado por nombre");
            System.out.println("3. Buscar empleado por numero de empleado");
            System.out.println("4. Buscar empleado por numero de seguridad social");
            System.out.println("5. Salir");
            System.out.println("Introduce una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1://Añadir empleado
                    System.out.println("Introduce el nombre del empleado");
                    nombre = sc.next();
                    System.out.println("Introduce el numero de empleado");
                    numEmpleado = sc.nextInt();
                    System.out.println("Introduce el numero de seguridad social");
                    numSeguridadSocial = sc.nextInt();
                    hashEmpleado.put(numEmpleado, nombre);
                    hashEmpleado2.put(nombre, numEmpleado);
                    hashEmpleado3.put(numSeguridadSocial, numEmpleado);
                    break;
                case 2://Buscar empleado por nombre
                    System.out.println("Introduce el nombre del empleado");
                    nombre = sc.next();
                    System.out.println("El numero de empleado es: " + hashEmpleado2.get(nombre));
                    break;
                case 3://Buscar empleado por numero de empleado
                    System.out.println("Introduce el numero de empleado");
                    numEmpleado = sc.nextInt();
                    System.out.println("El nombre del empleado es: " + hashEmpleado.get(numEmpleado));
                    break;
                case 4://Buscar empleado por numero de seguridad social
                    System.out.println("Introduce el numero de seguridad social");
                    numSeguridadSocial = sc.nextInt();
                    System.out.println("El numero de empleado es: " + hashEmpleado3.get(numSeguridadSocial));
                    break;
                case 5://Salir
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 5);
    }
}