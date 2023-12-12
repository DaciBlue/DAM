import java.util.Scanner;

public class Cuatro {
    public static void main (String[]args){
        /*Leer un nº y mostrar su cuadrado,
        repetir el proceso hasta que se introduzca un número negativo
         */
        int num;
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca un numero para saber su cuadrado:");
        num= scn.nextInt();
        while (num>=0){
            System.out.printf("\tEl cuadrado de %d es: %d.\n",num,(num*num));
            System.out.println("Introduzca otro numero o un numero negativo para terminar.");
            num=scn.nextInt();
        }
        System.out.println("Gracias por participar.");
    }
}
