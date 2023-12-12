import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        EXAMEN: un metodo un solo return

        1.Metodo sin return y sin parametros
        2.Metodo sin return y con parametros
        3.Metodo con return y sin parametros
        4.Metodo con return y con parametros
         */
        Scanner scn= new Scanner(System.in);
        String texto;
        System.out.println("Introduzca su nombre por pantalla");
        texto= scn.next();
        holaMundo(texto);
        int num1 = 10;
        int num2 = 5;
        int [] num= {2,3,4};
        recorrer(num);

        System.out.println("La suma: "+sumar(num1,num2));
        System.out.println("La resta: "+restar(num1,num2));
        System.out.println("La multiplicación: "+multiplicar(num1,num2));
    }
    static void recorrer(int []array){
        for(int i =0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
    static void holaMundo(String nombre){
        System.out.println("Hola mundo " + nombre);
    }
    static int sumar(int n1, int n2){

        int suma;
        suma = n1 + n2;
        return suma;
    }
    static int restar(int n1, int n2){

        int resta;
        resta = n1 - n2;
        return resta;
    }
    static int multiplicar(int n1, int n2){

        int multi;
        multi = n1 * n2;
        return multi;
    }
}