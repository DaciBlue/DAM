package EjercicosNoEvaluables.src;

import java.util.Scanner;

public class OnceCajero {
    /*Hacer un programa que simule un cajero automático
    con un saldo inicial de 1000 dólares,
     con el siguiente menú de opciones: ingresar, retirar y salir.
     */
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int opcion;
        double saldo =1000;
        double ingreso;
        double retiro;

        System.out.println("Introduzca la opcion a realizar:\n 1.Ingresar\n 2.Retirar\n 3.Salir");
        opcion= scn.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Introduzca la cantidad que quiere ingresar:");
                ingreso=scn.nextDouble();
                if (ingreso<0){
                    System.out.println("Ingreso incorrecto.");
                }else{
                    saldo=saldo+ingreso;
                }
                break;
            case 2:
                System.out.println("Introduzca la cantidad que quiere retirar:");
                retiro=scn.nextDouble();
                if (retiro>saldo){
                    System.out.println("No se puede retirar mas de lo que tienes.");
                }else{
                    saldo=saldo - retiro;
                }break;
            case 3:
                System.out.println("Salir");
                break;

            default:
                System.out.println("Opcion incorrecta.");
        }
        System.out.println("Saldo total "+ saldo);
    }
}
