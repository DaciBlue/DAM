import java.util.Scanner;

public class NueveNyprimos {
    /*9. Realizar un programa que nos pida un número n,
     y nos diga cuantos números hay entre 1 y n que son primos.
     */
    public static void main (String []args){
        int num;
        int primo=0;
        Scanner scn=new Scanner(System.in);

        System.out.println("Introduzca un numero integro:");
        num=scn.nextInt();
        for(int i=1;i<num;i++){
            if (i%2!=0){
                primo++;
            }
        }
        System.out.printf("Entre 1 y el numero %d hay %d numeros que son primos.",num,primo);
    }
}
