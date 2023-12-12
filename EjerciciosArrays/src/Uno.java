public class Uno {
    public static void main(String[] args) {

        /*
        1.	Escribir un programa que almacene las asignaturas de un curso
        (por ejemplo, Matemáticas, Física, Química, Historia y Lengua)
        en un ARRAY y la muestre por pantalla.
         */

        String [] asig = {"Matematicas", "Fisica", "Quimica", "Historia", "Lengua"};
        for (int i=0;i<asig.length;i++){
            System.out.println(asig[i]);
        }
    }
}