import java.util.Scanner;

public class DiezdibujaCuadrado {
    /*10. Dibuja un cuadrado de n elementos de lado utilizando *.
    Los n elementos los introduce el usuario por pantalla
     */
    public static void main(String []args){

        int num;
        Scanner scn=new Scanner(System.in);
        System.out.println("Introduzca el numero para dibujar su cuadrado:");
       // String columna= " ";
       // String fila=" ";
        num=scn.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
