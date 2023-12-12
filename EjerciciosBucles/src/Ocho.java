import java.util.Scanner;

public class Ocho {
    public static void main (String[]args){
        /*Pedir 5 números y escribir la suma total.
        En el código sólo puede estar escrita una vez la sentencia System.out.print("Introduzca número: ")
         */
        int num;
        int suma=0;
        Scanner scn=new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.println("Introduzca numero:");
            num=scn.nextInt();
            suma+=num;
        }
        System.out.println("La suma total es "+suma+".");
    }
}
