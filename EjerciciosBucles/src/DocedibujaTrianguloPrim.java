import java.util.Scanner;

public class DocedibujaTrianguloPrim {
    /*12. Escribir un programa que pida al usuario un número entero
    y muestre por pantalla un triángulo rectángulo como el de más abajo.
            1
            3 1
            5 3 1
            7 5 3 1
            9 7 5 3 1
     */
    public static void main (String []args){
        Scanner scn= new Scanner(System.in);
            System.out.println("Introduzca el numero del triangulo:");
            int num=scn.nextInt();
            String triangulo= " ";
            if (num>0){
                for (int i=1;i<=num;i+=2){ //para obtener numeros impares incrementamos de dos en dos
                    for (int j=i;j>0;j-=2){  //para obtener numeros impares decrementamos de dos en dos
                        System.out.print(j+" ");
                    }System.out.printf("%n");
                }


                //probando
        }
    }
}
