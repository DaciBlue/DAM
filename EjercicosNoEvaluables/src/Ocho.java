package EjercicosNoEvaluables.src;

import java.util.Scanner;

public class Ocho {
    public static void main (String []args ) {
        /*En una determinada empresa, sus empleados son evaluados al final de cada año.
        Los puntos que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando,
        traduciéndose en mejores beneficios.
        Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más,
        pero no valores intermedios entre las cifras mencionadas.
        A continuación se muestra una tabla con los niveles correspondientes a cada puntuación.
        La cantidad de dinero conseguida en cada nivel es de 2.400€ multiplicada por la puntuación del nivel.
                Nivel	        Puntuación
                Inaceptable	    0.0
                Aceptable	    0.4
                Meritorio	    0.6 o más
        Escribir un programa que lea la puntuación del usuario e indique su nivel de rendimiento,
        así como la cantidad de dinero que recibirá el usuario.
         */

        float dinero;
        Scanner scn = new Scanner(System.in);
        int opcion;

        System.out.println("Escriba el numero de la linea acorde a su puntuacion:");
        System.out.println("1 -> Puntuación: 0.0");
        System.out.println("2 -> Puntuación: 0.4");
        System.out.println("3 -> Puntuación: 0.6 o más");

        opcion=scn.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Su puntuación es Inaceptable, cantidad a recibir es de: "+(2400*0)+ "€.");
                break;
            case 2:
                System.out.println("Su puntuación es Aceptable, cantidad a recibir es de: "+(2400*0.4)+ "€.");
                break;
            case 3:
                System.out.println("Su puntuación es Meritorio, cantidad a recibir es de: "+(2400*0.6)+ "€.");
                break;
        }
    }
}
