import java.util.Scanner;

public class MainPares {

    //ºCrear una clase con su metodo main asociado donde se realizan las sig operaciones:
    //ªPedir por cons ola dos numeros
    //ºIndicar si ambos numeros son pares

    public static void main (String []args){

        MainPares mainPares = new MainPares();
        Scanner scanner = new Scanner(System.in);
        int numeroUno, numeroDos; // podemos declarar varias variables seguidas del mismo tipo
        System.out.println("Introduce el primer numero a evaluar:");
        numeroUno = scanner.nextInt();
        System.out.println("Introduce el segundo numero a evaluar:");
        numeroDos = scanner.nextInt();

        // saber si el numeroUno es par o impar
        // los pares son 0 2 4 6 8 10 12 14 16..
        // es par si lo divido entre 2 y el resto es 0
        // para el resto podemos usar el %

     /*   int restoDivisionUno = numeroUno%2;
        int restoDivisionDos = numeroDos%2;
        boolean parUno= restoDivisionUno==0;


        System.out.printf("El numero %d es par: %b%n", numeroUno,parUno);
        System.out.printf("El numero %d es par: %b%n", numeroDos,restoDivisionDos==0);
    */

        System.out.printf("El numero %d es par: %b%n", numeroUno,mainPares.evaluarPar(numeroUno));
        System.out.printf("El numero %d es par: %b%n", numeroDos,mainPares.evaluarPar(numeroDos));
    }

    public boolean evaluarPar(int numero){

        boolean respuesta = numero%2 == 0;
        return respuesta;

    }

}
