import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File f = new File("daxi.txt");
        File f2 = new File("daxi2.txt");

        System.out.println(f.length());

      /*  if(f.exists()){
            if(f.delete()){
                System.out.println("El fichero se ha borrado correctamente");
            }else{
                System.out.println("El fichero no se ha borrado correctamente");
            }
        }

       */

       /* if(!f2.exists()){
            try{
                f.createNewFile();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }

        */
    }
}