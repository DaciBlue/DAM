public class CuatroArrayInverso {
    /*4.	Escribir un programa que almacene en un array
    los números del 1 al 10
    y los muestre por pantalla en orden inverso separados por comas.
     */
    public static void main (String []args){
        int num []={1,2,3,4,5,6,7,8,9,10};

        for(int i = num.length-1;i>=0;i--){
            System.out.print(num[i]+", ");
        }
    }
}
