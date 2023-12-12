import java.util.Scanner;

public class Main {

    /*Reto2: Realiza una calculadora de IVA. para ello se deberán seguir la siguiente
    secuencia de acciones:
        a. Se pedirá al usuario que introduzca por consola un valor numérico (el
           precio de adquisición de un artículo (sin IVA)) y también se le pedirá que
           introduzca otro valor numérico (el IVA que se le ha aplicado).
        b. El sistema calculará el precio del producto tanto sin IVA como con él
        c. Finalmente se mostrarán ambos precios formateados
     */

    public static void main (String[] args){

        // Declaracion de variables, usamos double por si el cliente introduce decimales
        double precio;
        double iva;
        double resultado;

        //Usamos la clase Scanner para introducir datos en consola
        Scanner scn = new Scanner(System.in);

        //Le pedimos al cliente lo que necesitamos, mediante un mensaje en consola a traves del System.out.println
        System.out.println("Introduzca el valor numérico del artículo adquirido:");

        //Almacenamos los datos en nuestras variables con los datos introducidos por el cliente.
        precio = scn.nextDouble();

        System.out.println("Introduzca el valor numérico del IVA que se le ha aplicado:");
        iva = scn.nextDouble();

        //Almacenamos mas datos mediante operaciones con los datos obtenidos anteriormente.
        resultado = (iva*precio)/100;

        //Imprimimos en pantalla los resultados obtenidos mediante System.out.printf en este caso ya que,
        // usaremos formatos como solo 2 decimales (%.2f) y saltos de linea (%n)
        System.out.printf("El precio del artículo adquirido es de %.2f euros sin IVA. %n",precio);
        System.out.printf("El precio del IVA aplicado es de: %.2f euros.%n",resultado);
        System.out.printf("El precio final aplicando el IVA de %.1f%% es de: %.2f euros.",iva,(precio+resultado));




    }
}
