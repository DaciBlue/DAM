public class CincoNumMayorMenor {
    /*5.	Escribir un programa que almacene en un array los siguientes precios,
    50, 75, 46, 22, 80, 65, 8,
    y muestre por pantalla el menor y el mayor de los precios.
     */
    public static void main (String []args){
        int num [] = {50, 75, 46, 22, 80, 65, 8};
        int menor = num[0];
        int mayor = num[0];

        for (int i=0;i<num.length;i++){
            if(num[i]>mayor){
                mayor=num[i];
            }if (num[i]<menor){
                menor=num[i];
            }
        }
        System.out.println("El numero menor es: "+menor);
        System.out.println("El numero mayor es: "+mayor);
    }
}
