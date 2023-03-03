import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Inicializar contadores para cada candidato
        int contadorEmilia = 0;
        int contadorGerardo = 0;
        int contadorMaria = 0;
        int contadorNadia = 0;

        // Pedir votos a los usuarios hasta que se introduzca el código especial
        Scanner sc = new Scanner(System.in);
        int codigo = 0;
        do {
            System.out.println("Ingrese su voto o ingrese el código especial para finalizar la votación:");
            System.out.println("1-Emilia TERREROS");
            System.out.println("2-Gerardo ESCODAR");
            System.out.println("3-María AGUAVIVA");
            System.out.println("4-Nadia LETUX");
            int voto = sc.nextInt();
            if (voto == 1) {
                contadorEmilia++;
            } else if (voto == 2) {
                contadorGerardo++;
            } else if (voto == 3) {
                contadorMaria++;
            } else if (voto == 4) {
                contadorNadia++;
            } else if (voto == 68753421) {
                codigo = voto;
                break;
            } else {
                System.out.println("Voto inválido, por favor intente de nuevo.");
            }
        } while (codigo != 68753421);

        // Calcular porcentajes de votos para cada candidato
        int totalVotos = contadorEmilia + contadorGerardo + contadorMaria + contadorNadia;
        double datoEmilia = (double) contadorEmilia / totalVotos * 100;
        double datoGerardo = (double) contadorGerardo / totalVotos * 100;
        double datoMaria = (double) contadorMaria / totalVotos * 100;
        double datoNadia = (double) contadorNadia / totalVotos * 100;

        //mostar porcetaje
        //La libreria numberformat permite dar formato a los numeros e este caso porcentaje
        NumberFormat formatoPorcentaje = NumberFormat.getPercentInstance();
        String porcentajeEmilia = formatoPorcentaje.format(datoEmilia);
        String porcentajeGerardo = formatoPorcentaje.format(datoGerardo);
        String porcentajeMaria = formatoPorcentaje.format(datoMaria);
        String porcentajeNadia = formatoPorcentaje.format(datoNadia);

        // Mostrar resultados
        System.out.println("Resultados de la votación:");
        System.out.println("Emilia TERREROS: "+ porcentajeEmilia);
        System.out.println("Gerardo ESCODAR: "+ porcentajeGerardo);
        System.out.println("María AGUAVIVA: " + porcentajeMaria);
        System.out.println("Nadia LETUX: " + porcentajeNadia);
    }
}
