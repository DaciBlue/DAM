import java.util.Scanner;

public class Main {

    /*
    Reto3: Realiza una calculadora de sueldo. para ello se deberán seguir la siguiente
        secuencia de acciones:
               a. El programa pedirá por consola al usuario que introduzca dos valores
                    numéricos: el sueldo de un trabajador y su número de pagas.
               b. El programa calculará el sueldo bruto, sueldo bruto mensual, sueldo neto,
                    sueldo neto anual, teniendo en cuenta que se aplica una retención del 0.15
               c. Finalmente se mostrarán por consola todos los resultados obtenidos
     */
    public static void main(String[] args) {

        //Declaracion de variables
        /*Usamos int para los enteros, float para los que pensamos que tendran decimales,
            double para un decimal mas pequeño y final para que no se le pueda cambiar el valor
         */

        int sueldo, pagas;
        float bruto, netoAnual, netoMensual;
        final double Retencion = 0.15f;

        //Usamos scanner para introducir datos mediante la consola
        Scanner scn = new Scanner(System.in);

        //Indicamos en consola mediante System.out.print lo que necesitamos que introduzcan
        //Almacenamos los datos que nos introducen gracias al scn.nextInt()
        System.out.println("Introduzca su sueldo bruto numerico anual:");
        sueldo = scn.nextInt();
        System.out.println("Introduzca su numero de pagas anuales:");
        pagas = scn.nextInt();

        bruto= (float) sueldo /pagas;
        System.out.printf("Su sueldo bruto mensual es de: %.2f euros.  %n",bruto);
        System.out.printf("Su salario bruto anual es de %d euros en %d pagas.%n",sueldo,pagas);

        netoAnual= (float) (sueldo*0.15);
        System.out.printf("Su sueldo neto anual es de %.2f euros. %n",sueldo-netoAnual);

        netoMensual=((sueldo-netoAnual)/pagas);
        System.out.printf("Su sueldo neto mensual es de %.2f euros. %n",netoMensual);

    }
}