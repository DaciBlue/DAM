import java.util.Scanner;

public class SeisNumPosNegCero {
    /*6.	Programa Java que guarda en un array 10 números enteros
    que se leen por teclado.
    A continuación, se recorre el array
    y calcula cuántos noúmeros son positivos, cuántos negativos y cuántos ceros.
     */
    public static void main (String[]args){
        Scanner scn= new Scanner(System.in);
        int array []=new int[10];
        int positivo=0;
        int negativo=0;
        int cero=0;
        System.out.println("Introduzca 10 numeros enteros");

        for(int i=0;i<10;i++){
            System.out.println("Introduzca el "+(i+1)+" numero entero:");
            array[i]=scn.nextInt();
            if (array[i]>0){
                positivo++;
            } else if (array[i]<0) {
                negativo++;
            }else {
                cero++;
            }
        }
        System.out.printf("De los numeros introducidos %d son positivos, %d son negativos y un total de %d ceros.",positivo,negativo,cero);
    }
}
