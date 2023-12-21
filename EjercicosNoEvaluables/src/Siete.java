package EjercicosNoEvaluables.src;

import java.util.Scanner;

public class Siete {
    public static void main (String []args){
        /*Los tramos impositivos para la declaración de la renta en un determinado país son los siguientes:
                Renta	                    Tipo impositivo
                Menos de 10000€	            5%
                Entre 10000€ y 20000€	    15%
                Entre 20000€ y 35000€	    20%
                Entre 35000€ y 60000€	    30%
                Más de 60000€	            45%
                Escribir un programa que pregunte al usuario su renta anual y muestre por pantalla el tipo impositivo que le corresponde.
        */

        int renta;
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca su renta anual en valor númerico:");
        renta = scn.nextInt();
        if (renta<10000){
            System.out.println("El tipo impositivo que le corresponde es de 5% el cual es el equivalente a "+(renta*0.05)+ "€.");
        }else if (renta<20000) {
            System.out.println("El tipo impositivo que le corresponde es de 15% el cual es el equivalente a " + (renta * 0.15) + "€.");
        }else if (renta<35000) {
            System.out.println("El tipo impositivo que le corresponde es de 20% el cual es el equivalente a " + (renta * 0.2) + "€.");
        }else if (renta<60000) {
            System.out.println("El tipo impositivo que le corresponde es de 30% el cual es el equivalente a " + (renta * 0.3) + "€.");
        }else {
            System.out.println("El tipo impositivo que le corresponde es de 45% el cual es el equivalente a " + (renta * 0.45) + "€.");
        }
    }
}
