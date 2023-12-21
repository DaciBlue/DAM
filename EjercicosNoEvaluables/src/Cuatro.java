import java.util.Scanner;

public class Cuatro {

    /* 4. Hay 2 bombillas apagadas(b1 y b2). Introducir por teclado valores válidos para el día del mes y el mes.
    Si día del mes y el mes es par encender b1.
    Si día o el mes es impar encender b2.
    USAR VARIABLES DE TIPO BOOLEAN.
     */

    public static void main (String[]args){

        boolean b1= false;
        boolean b2= false;
        int dia, mes;
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca el valor del mes:");
        mes = scn.nextInt();
        System.out.println("Introduzca el valor del dia:");
        dia = scn.nextInt();

        if (dia%2 == 0 && mes%2 ==0){
            b1 = true;
        }else{
            b2 = true;
        }

        System.out.println(b1);
        System.out.println(b2);
    }
}
