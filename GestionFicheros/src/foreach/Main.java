package foreach;

public class Main {
    public static void main (String[] args){
        int [] num = {1,2,3};

        for(int i= 0; i<num.length; i++ ){ //bucle for normal
            System.out.println(num[i]);
        }

        for (int i:num){    // bucle for each
            System.out.println(i);
        }
    }
}
