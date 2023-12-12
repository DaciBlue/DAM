import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        /*Se introduce una contraseña en el código.
        Por teclado se pide que se introduzca otra contraseña.
        Hasta que se introduzca la misma seguirá preguntándola
         */
        String contra="contraseña";
        Scanner scn = new Scanner(System.in);
        String intento;
        do {
            System.out.println("Introduzca cual puede ser la contraseña guardada:");
            intento =scn.next();
        }while(!intento.equalsIgnoreCase(contra));
        System.out.println("Contraseña correcta.");
    }
}