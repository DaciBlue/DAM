public class TresSumaParImpar {
    /*Sumar los números pares por un lado y los números impares por otro entre 1 y 99.
    Mostrar el resultado total de cada suma.
     */
    public static void main (String []args){

        int par;
        int impar;
        int sumapar=0;
        int sumaimpar=0;

        for (int i=1; i<100;i++){
            if (i%2==0){
                sumapar+=i;
            }else
                sumaimpar+=i;
        }
        System.out.printf("La suma de 1 a 99 es de %d de los numeros pares y %d de los numeros impares.",sumapar,sumaimpar);
    }
}
