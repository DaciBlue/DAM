import java.sql.SQLOutput;
import java.util.Scanner;

public class MainSuma {

    // Una clase tiene VARIABLES y METODOS

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operacion suma");
        System.out.println("Primer operando");
        int operandoUno;
        int operandoDos;
        int suma;
        System.out.println("Operacion suma");
        System.out.println("Introduce el operando");
        operandoUno = scanner.nextInt();

        System.out.printf("Primer operando %d%n" ,operandoUno);
        System.out.println("introduce el operando");
        operandoDos=scanner.nextInt();

        System.out.printf("Segundo operando %d%n", operandoDos);
        suma = operandoUno + operandoDos;
        System.out.printf("El resultado de la suma entre %d y %d es: %d",operandoUno , operandoDos, suma);



    }

}
