public class DosAsignatura {
    /*
    2.	Escribir un programa que almacene las asignaturas de un curso
    (por ejemplo, Matemáticas, Física, Química, Historia y Lengua) en un array
    y la muestre por pantalla el mensaje Yo estudio <asignatura>,
    donde <asignatura> es cada una de las asignaturas de la lista.
     */

    public static void main (String []args){

        String [] asignatura = {"Matematicas","Fisica","Quimica","Historia","Lengua"};
        for(int i=0;i< asignatura.length;i++){
            System.out.println("Yo estudio "+asignatura[i]);
        }
    }
}
