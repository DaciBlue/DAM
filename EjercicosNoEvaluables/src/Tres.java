package EjercicosNoEvaluables.src;

import java.util.Scanner;

public class Tres {
    /*3.  Comparar 3 números introducidos por pantalla,
    y mostrarlos ordenados de mayor a menor
     */

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduzca numero 1");
        num1 = scn.nextInt();

        System.out.println("Introduzca numero 2");
        num2 = scn.nextInt();

        System.out.println("Introduzca numero 3");
        num3 = scn.nextInt();

        /*
        num1>num2>num3 -> if(num1>num2 && num2>num3)
        num1>num3>num2
        num2>num1>num3
        num2>num3>num1
        num3>num1>num2
        num3>num2>num1
         */

        if (num1>num2 && num2>num3){
            System.out.println(num1 + " " + num2 + " " + num3);
        }else if(num1>num3 && num3>num2){
            System.out.println(num1 + " " + num3 + " " + num2);
        }else if(num2>num1 && num1>num3) {
            System.out.println(num2 + " " + num1 + " " + num3);
        }else if(num2>num3 && num3>num1) {
            System.out.println(num2 + " " + num3 + " " + num1);
        }else if(num3>num1 && num1>num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        }else if(num3>num2 && num2>num1) {
            System.out.println(num3 + " " + num2 + " " + num1);
        }
    }
}