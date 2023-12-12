package EjercicosNoEvaluables.src;
import java.util.Scanner;

public class Seis {
    /*
    Escribir un programa que almacene la cadena de caracteres "contraseña" en una variable,
    pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida por el usuario
     coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
     */
    public static void main (String []args){
        String contrasenia= "contraseña";
        String intento;
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca la constraseña:");
        intento=scn.next();
        if (intento.equalsIgnoreCase(contrasenia)){
            System.out.println("Contaseña correcta.");
        }else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}
