import java.util.Scanner;

public class Seis {
    public static void main (String []args){
        /*Pedir números hasta que se teclee un 0,
        mostrar la suma de todos los números introducidos.
         */
        double num;
        double suma=0;
        Scanner scn= new Scanner(System.in);
        System.out.println("Introduzca un numero distinto a 0 para empezar:");
        num=scn.nextDouble();
        do{
            suma+=num;
            System.out.println("Introduzca un numero para seguir sumando o un 0 para mostrar el resultado de la suma.");
            num=scn.nextDouble();
        }while(!(num==0));
        System.out.printf("La suma de los numeros introducidos es de %.2f.",suma);
    }
}
