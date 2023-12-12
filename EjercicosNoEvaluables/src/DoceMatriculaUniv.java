package EjercicosNoEvaluables.src;

import java.util.Scanner;

public class DoceMatriculaUniv {
    /*La universidad ha categorizado las matrículas de acuerdo a la facultad que va a estudiar el postulante.
     Ingrese por teclado el nombre del postulante
     y la facultad que va a estudiar,
     muestre el importe, la mensualidad,
     el IGV 18% (importe + mensualidad) y el monto final a pagar. (Use el control switch).
          mfinal= matricula + mensualidad + igv;
         (La tabla esta en el doc Ejercicios No Evaluables)
     */

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String nombre;
        String facultad;
        int matricula =0;
        int mensualidad=0;
        double igv;
        double mfinal;

        System.out.println("Introduzca el nombre del postulante");
        nombre=scn.next();

        System.out.println("Introduzca el nombre de la facultad");
        facultad=scn.next();

        switch (facultad){
            case "sistemas":
                matricula = 350;
                mensualidad = 650;
                break;
            case "derecho":
                matricula = 300;
                mensualidad= 550;
                break;
            case "naviera":
                matricula = 300;
                mensualidad = 500;
                break;
            case "pesquera":
                matricula = 310;
                mensualidad = 460;
                break;
            case "contabilidad":
                matricula = 280;
                mensualidad= 490;
                break;
            case "administracion":
                matricula = 360;
                mensualidad = 520;
                break;
            default:
                System.out.println("Facultado incorrecta");
        }
        igv= 0.18*(matricula+mensualidad);
        mfinal=matricula+mensualidad+igv;
        System.out.println("Total a pagar por el postulante "+nombre);
        System.out.println("Matricula "+matricula);
        System.out.println("Mensualidad "+mensualidad);
        System.out.println("IGV "+igv);
        System.out.println("Monto final "+mfinal);
    }
}
