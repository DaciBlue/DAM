import java.util.Scanner;

public class SieteMediaNum {
    /*7. Pedir números hasta que se introduzca uno negativo,
            y calcular la media.
     */
    public static void main (String []args){

        Scanner scn= new Scanner(System.in);
        int sumaNum=0;
        int media=0;
        int num;

        System.out.println("Introduzca un número positivo para continuar:");
        num=scn.nextInt();
        while(num>=0){
            sumaNum+=num;
            media++;
            System.out.println("Introduzca otro número positivo para continuar o negativo para calcular la media de los numeros introducidos:");
            num=scn.nextInt();
        }
        System.out.printf("La media de los numeros introducidos es de %d",(sumaNum/media));
    }
}
