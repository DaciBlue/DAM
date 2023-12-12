import java.sql.SQLOutput;
import java.util.Scanner;

public class MainDivision {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int operandoUno = 0;
        int operandDos = 0;
        double division = 0.0;

        System.out.println("Operacion division");
        System.out.println("introduce el operando");
        operandoUno = scanner.nextInt();
        System.out.printf("Primer operando: %d%n", operandoUno);

        System.out.println("introduce el operando");
        operandDos = scanner.nextInt();
        System.out.printf("Segundo operando: %d%n",operandDos);

        division = (double) operandoUno/ (double) operandDos;
        System.out.printf("La division entre %d y %d es %.2f",operandoUno,operandDos,division);

    }
}
