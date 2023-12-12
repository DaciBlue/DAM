import java.util.Scanner;

public class OncedibujaTrianguloRect {
    /*Escribir un programa que pida al usuario un número entero
    y muestre por pantalla un triángulo rectángulo como el de más abajo,
    de altura el número introducido.
            *
            **
            ***
            ****
            *****
     */
    public static void main (String []args){
        Scanner scn= new Scanner (System.in);
        while(true){
            System.out.println("Introduzca el numero del triangulo a dibujar:");
            int num;
            num=scn.nextInt();
            if (num>0){
                for(int i=1;i<=num;i++){
                    System.out.println();
                    for (int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                }{break;}
            }else
                System.out.println("Numero introducido es incorrecto, introduzca un numero entero mayor a 0.");
        }
    }
}
