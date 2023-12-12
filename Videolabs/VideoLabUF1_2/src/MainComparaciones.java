import java.util.Scanner;

public class MainComparaciones {

     //metodo principal
     // Crear una clase con su método main asociado donde se declaren tres variables, dos
     //de tipo int y una de tipo booleano. Darle el valor que se quiera a cada una de ellas
     //y hacer las comparaciones vistas en los ejemplos anteriores entre las variables.


     public static void main (String [] args){

          Scanner scanner = new Scanner(System.in);
          System.out.println("Introduce el valor del primer númmero:");
          int numeroUno = scanner.nextInt();
          System.out.println("Introduce el valor del segundo númmero:");
          int numeroDos = scanner.nextInt();
          System.out.println("Introduce el valor del booleano (true o false):");
          boolean acierto = scanner.nextBoolean();
          boolean resultado;

          // <>

          resultado = numeroUno > numeroDos;
          System.out.printf("El resultado es: %b%n", resultado); // %b porque sacamos un booleano

          // <= >=

          resultado = numeroUno <= numeroDos;
          System.out.printf("El resultado es: %b%n", resultado);

          /*   resultado = numeroDos >= resultado // no podemos comparar un numero con un booleano*/

          //   (4>=4) AND False
          //     V    && F =>el resultado tendra que ser F
          resultado = (numeroDos >= numeroUno) && acierto;
          System.out.printf("El resultado es: %b%n", resultado);


          //   (4>=4) OR False
          //     V    || F =>el resultado tendra que ser V
          resultado = (numeroDos >= numeroUno) || acierto;
          System.out.printf("El resultado es: %b%n", resultado);

          acierto = true;
          //             (4>=4) AND 4>0 AND true
          //                T   AND  T  AND  T  => resultado tendria que dar verdadero
          resultado = (numeroDos>=numeroUno) && numeroUno>0 && acierto;
          System.out.printf("El resultado es: %b%n", resultado);






     }
}
