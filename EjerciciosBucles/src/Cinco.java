import java.util.Scanner;

public class Cinco {
    public static void main (String []args){
        /*Leer un nº e indicar si es positivo o negativo.
        El proceso se repetirá hasta que se introduzca un 0
         */
        int num;
        Scanner scn= new Scanner(System.in);
        System.out.println("Introduzca el numero que desea calificar:");
        num=scn.nextInt();
        while(num>0){
            System.out.println("El numero introducido es positivo.\nIntroduzca otro numero para valorar o un 0 para terminar.");
            num= scn.nextInt();
            while (num<0){
                System.out.println("El numero introducido es negativo.\nIntroduzca otro numero para valorar o un 0 para terminar.");
                num= scn.nextInt();
            }
        }
        System.out.println("Gracias por participar.");
    }
}
