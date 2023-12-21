package EjercicosNoEvaluables.src;

import java.util.Scanner;

public class Uno {
    public static void main (String []args){
        /*Se da por teclado el precio de una revista,
        el numero de años de antigüedad de un suscriptor y si es estudiante o no.
        Visualizar el precio a pagar por el suscriptor sabiendo que:
            Los suscriptores con más de 5 años tienen un descuento del 20% si son estudiante y un 15% si no lo son.
            A los suscriptores con una antigüedad entre 3 y 5 años se les aplica un 10% si son estudiantes y un 5% si no lo son .
            A los suscriptores con una antigüedad entre 0 y 3 años se les aplica un 8% si son estudiantes y un 3% si no lo son.
            A los estudiantes no suscriptores se les aplica un 2% y a los no suscriptores y no estudiantes no se les aplica descuento
         */

        double precio;
        int antiguedad;
        boolean estudiante;
        Scanner scn = new Scanner(System.in);
        double descuento;

        System.out.println("Indique el precio de la revista:");
        precio=scn.nextFloat();
        System.out.println("Indique el numero de años de antiguedad:");
        antiguedad=scn.nextInt();
        System.out.println("Indique si es estudiante o no como se indica a continuacion:\n"+"Escriba True si es verdadero.\n"+"Escriba False si es falso.");
        estudiante=scn.nextBoolean();

        if (antiguedad>5 && estudiante){
            descuento=precio*0.2;
            System.out.println("Se le aplica un 20% de descuento!\nEl precio de la revista para sus condiciones es de "+(precio-descuento)+"€.");
        }else if (antiguedad>5 && estudiante==false) {
            descuento=precio*0.15;
            System.out.println("Se le aplica un 15% de descuento!\nEl precio de la revista para sus condiciones es de "+(precio-descuento)+"€.");
        }else if (antiguedad>=3 && estudiante) {
            descuento = precio * 0.1;
            System.out.println("Se le aplica un 10% de descuento!\nEl precio de la revista para sus condiciones es de " + (precio - descuento)+"€.");
        }else if (antiguedad>=3 && estudiante==false) {
            descuento = precio * 0.05;
            System.out.println("Se le aplica un 5% de descuento!\nEl precio de la revista para sus condiciones es de " + (precio - descuento)+"€.");
        }else if (antiguedad>0 && estudiante) {
            descuento = precio * 0.08;
            System.out.println("Se le aplica un 8% de descuento!\nEl precio de la revista para sus condiciones es de " + (precio - descuento)+"€.");
        }else if (antiguedad>0 && estudiante==false) {
            descuento = precio * 0.03;
            System.out.println("Se le aplica un 3% de descuento!\nEl precio de la revista para sus condiciones es de " + (precio - descuento)+"€.");
        }else if (antiguedad==0 && estudiante) {
            descuento = precio * 0.02;
            System.out.println("Se le aplica un 2% de descuento!\nEl precio de la revista para sus condiciones es de " + (precio - descuento)+"€.");
        }else{
            System.out.println("No se le puede aplicar ningun descuento.\nEl precio de la revista para sus condiciones es de " + precio+"€.");
        }
    }
}
