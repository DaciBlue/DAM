package EjercicosNoEvaluables.src;

import java.util.Scanner;

public class Numromano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para convertirlo a romano: ");
        int numero = scanner.nextInt();
        System.out.println("Número Romano: " + convertirARomano(numero));
    }

    public static String convertirARomano(int numero) {
        String romano = "";
        if (numero >= 1000) { romano += "M"; numero -= 1000; }
        if (numero >= 900) { romano += "CM"; numero -= 900; }
        if (numero >= 500) { romano += "D"; numero -= 500; }
        if (numero >= 400) { romano += "CD"; numero -= 400; }
        if (numero >= 100) { romano += "C"; numero -= 100; }
        if (numero >= 90) { romano += "XC"; numero -= 90; }
        if (numero >= 50) { romano += "L"; numero -= 50; }
        if (numero >= 40) { romano += "XL"; numero -= 40; }
        if (numero >= 10) { romano += "X"; numero -= 10; }
        if (numero >= 9) { romano += "IX"; numero -= 9; }
        if (numero >= 5) { romano += "V"; numero -= 5; }
        if (numero >= 4) { romano += "IV"; numero -= 4; }
        if (numero >= 1) { romano += "I"; numero -= 1; }
        return romano;
    }
}
