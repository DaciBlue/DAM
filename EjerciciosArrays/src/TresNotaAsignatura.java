import java.util.Scanner;

public class TresNotaAsignatura {
    /*3.	Escribir un programa que almacene las asignaturas de un curso
    (por ejemplo, Matemáticas, Física, Química, Historia y Lengua) en un array,
    pregunte al usuario la nota que ha sacado en cada asignatura,
    y después las muestre por pantalla con el mensaje
    En <asignatura> has sacado <nota> donde <asignatura> es cada una de las asignaturas del array
    y <nota> cada una de las correspondientes notas introducidas por el usuario.
     */

    public static void main (String []args){
        String []asignatura= {"Matematicas","Fisica","Quimica","Historia","Lengua"};
        Scanner scn = new Scanner(System.in);
        int []nota = new int[5];
        for (int i=0;i< asignatura.length;i++){
            System.out.println("¿Que nota has sacado en "+asignatura[i]+ "?");
            nota[i]=scn.nextInt();
        }
        for (int i=0;i<nota.length;i++){
            System.out.println("En "+asignatura[i]+" tu nota es: "+nota[i]);
        }
    }
}
