import java.util.Scanner;

public class Uno {
    public static void main (String []args){
        /*Tabla de multiplicar del 1 al 10 de un nº dado por teclado.
        Forzar a que el nº introducido esté entre el 1 y el 20, sino el programa no avanza.
         */
        int num;
        Scanner scn= new Scanner (System.in);
        System.out.println("Introduzca un numero para obtener la tabla de multiplicar:");
        num= scn.nextInt();
        while (num<0 || num>20){
            System.out.println("Numero no válido, introduzca un numero integro entre 1 y 20:");
            num= scn.nextInt();
        }
        System.out.println("La tabla del numero "+num+" es:");
        for(int i=1; i<=10;i++){
            System.out.printf("\t%d x %d = %d\n",num,i,num*i);
        }
    }
}
