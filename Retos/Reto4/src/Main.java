import java.util.Scanner;

public class Main {
    /*Realiza un conversor de bases. Para ello se deberán seguir la siguiente
secuencia de acciones:
        a. El sistema pedirá por consola un valor numérico el cual será el número en
            base10 (decimal) del que se quiere calcular su base2 (binario).
        b. El sistema realizará los cálculos necesarios para realizar el cambio
            (divisiones sucesivas entre 2). Puedes basarte en este ejemplo
            http://recursostic.educacion.es/secundaria/edad/4esotecnologia/quincena
            5/4q2_contenidos_2c.htm
        c. Por último, se mostrará por consola el numero traducido en base
     */
    public static void main (String []args){
        // Declaracion de variables
        // int para numeros enteros, scanner para pedir datos en consola, string para alamcenar un texto en este caso en blanco
        int num;
        Scanner scn = new Scanner(System.in);
        String binario = " ";
        int resultado;

        //Pedimos los datos que necesitamos que introduzcan mediante un mensaje en consola usando el system.out.println
        System.out.println("Introduzca el numero que quiere pasar a binario");

        //Almacenmos los datos introducidos con un scn.nextInt() ya que son numeros enteros
        num=scn.nextInt();

        //Usamos el bucle while para que haga nuestras operaciones en bucle
        while (!(num>0)){
            System.out.println("El numero introducido no es válido, introduzca un numero mayor que 0:");
            num=scn.nextInt();
        }
        while(num > 0 ){
            resultado= num%2; //almacenamos el resto de num
            num/=2; // dividmos el num entre 2 hasta que no se pueda mas
            binario =resultado+binario; // alamcenmos los datos en un string para que no se sumen entre si
        }
        System.out.printf("El numero introducido pasado a binario es: %s.",binario);
    }
}