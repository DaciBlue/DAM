package EjercicosNoEvaluables.src;

import java.util.Scanner;

public class Cinco {

    /*
    5.  Pedir un número de 0 a 99 y mostrarlo escrito.
    Por ejemplo, para 56 mostrar: cincuenta y seis
     */

    public static void main (String []args){

        int num;
        int unidad;
        int decena;
        String uni = "";
        String raraD = "";
        String decenaN = "";

        Scanner scn = new Scanner(System.in);
        System.out.println("Numero a texto");
        System.out.println("Ingresa un número");
        num = scn.nextInt();

        decena = num/10;
        unidad = num%10;

        if(unidad == 0){
            uni = "cero";
        }else if(unidad == 1){
            uni = "uno";
        }else if(unidad == 2){
            uni = "dos";
        }else if(unidad == 3){
            uni = "tres";
        }else if(unidad == 4){
            uni = "cuatro";
        }else if(unidad == 5){
            uni = "cinco";
        }else if(unidad == 6){
            uni = "seis";
        }else if(unidad == 7){
            uni = "siete";
        }else if(unidad == 8){
            uni = "ocho";
        }else if(unidad == 9){
            uni = "nueve";
        }


        if(decena == 1 && unidad == 0){
            raraD = "diez";
        }else if(decena == 1 && unidad == 1){
            raraD = "once";
        }else if(decena == 1 && unidad == 2){
            raraD = "doce";
        }else if(decena == 1 && unidad == 3){
            raraD = "trece";
        }else if(decena == 1 && unidad == 4){
            raraD = "catorce";
        }else if(decena == 1 && unidad == 5){
            raraD = "quince";
        }else if(decena == 1 && unidad == 6){
            raraD = "diciseis";
        }else if(decena == 1 && unidad == 7){
            raraD = "dicisiete";
        }else if(decena == 1 && unidad == 8){
            raraD = "dieciocho";
        }else if(decena == 1 && unidad == 9){
            raraD = "diecinueve";
        }


        if(decena == 2){
            decenaN = "veinte";
        }else if(decena == 3){
            decenaN = "treinta";
        }else if(decena == 4){
            decenaN = "cuarenta";
        }else if(decena == 5){
            decenaN = "cincuenta";
        }else if(decena == 6){
            decenaN = "sesenta";
        }else if(decena == 7){
            decenaN = "setenta";
        }else if(decena == 8){
            decenaN = "ochenta";
        }else if(decena == 9){
            decenaN = "noventa";
        }


        if(num < 10){
            System.out.println("El numero es: "+uni);
        }else if(num <20){
            System.out.println("El numero es: "+raraD);
        }else if(num<100){
            if(num % 10 == 0){
                System.out.println("El numero es: "+decenaN);
            }else{
                System.out.println("El numero es "+decenaN+" y "+uni);

            }
        }
    }
}
