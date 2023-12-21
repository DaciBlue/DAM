package EjercicosNoEvaluables.src;

import java.util.Scanner;

public class Nueve {

    public static void main (String[]args){
        /*Escribir un programa para una empresa que tiene salas de juegos para todas las edades y quiere calcular de forma automática el precio que debe cobrar a sus clientes por entrar.
        El programa debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada.
        Si el cliente es menor de 4 años puede entrar gratis,
        si tiene entre 4 y 18 años debe pagar 5€
        y si es mayor de 18 años, 10€.
         */

        int edad;
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca su edad con valores numericos:");
        edad=scn.nextInt();
        if(edad<4){
            System.out.println("El precio de su entrada es: Gratis!");
        } else if (edad<18) {
            System.out.println("El precio de su entrada es: 5€");
        }else{
            System.out.println("El precio de su entrada es: 10€");
        }
    }
}
