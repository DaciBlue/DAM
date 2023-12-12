public class AreayVolumenCirculo {
    public static void main(String[] args) {
        /*
         * Crea dos métodos:
         * 1. Va a resolver el area del circulo = PI*r*r
         * 2. Va a resolver el volumen de un cilindro Ab * h (Area del circulo * h)
         * */
        int r = 20;
        int h = 30;
        System.out.println("El area del circulo es " + areaCirculo(r));
        System.out.println("El volumen del circulo es "+volumenCilindro(r,h));
    }

    static double areaCirculo(int radio) {

        double pi = 3.14;
        double resultado = radio * radio * pi;
        return resultado;
    }
    static double volumenCilindro(int ra, int altura) {

        double resultado = areaCirculo(ra) * altura;
        return resultado;
    }
}
