package ficheros;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File d = new File("C:\\Users\\Daci\\Desktop");
        listasDirectorio(d);

    }

    static void listasDirectorio(File d){
        File[] ficheros = d.listFiles(); // listFiles lo que va hacer es coger mi directorio "d" y hacer una lista que se guardara en el array
        System.out.println("Contenido de: "+d.getAbsolutePath()); //getAbsolutePath saca la ruta de un fichero o directorio

        for (File f:ficheros){ // guardamos en una variable a la que llamamos F lo que hay en ficheros
            System.out.println(f.getAbsolutePath()); //mostramos lo que hay en F

        }
    }


//        File f = new File("file.txt");
//        File f2 = new File("daxi2.txt");
/*
        System.out.println(f.length());
*/
    /*
        if(f.canRead()){
            try{
                f2.createNewFile();
            }catch(IOException ex){ //IOException es el nombre de clase que usamos para comprobar que no haya ningun tipo de fallo con el tema de los ficheros
                ex.printStackTrace(); //este metodo imprime el contenido del error
            }
        }

        //canRead()>>> mira a ver si el fichero se puede leer
        //canWrite()>>> mira a ver si el fichero se puede escribir

            System.out.println("Esto es un fichero");
        }else{
            System.out.println("Esto no es un fichero");
            }
        }


       if(f.exists()){
            if(f.delete()){
                System.out.println("El fichero se ha borrado correctamente");
            }else{
                System.out.println("El fichero no se ha borrado correctamente");
            }
        }

            if(!f2.exists()){
        try{
            f2.createNewFile();
        }catch(IOException ex){ //IOException es el nombre de clase que usamos para comprobar que no haya ningun tipo de fallo con el tema de los ficheros
            ex.printStackTrace(); //este metodo imprime el contenido del error
        }
    }


      */


}