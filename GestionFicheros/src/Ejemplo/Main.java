package Ejemplo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //1º Creo objeto File

        File f = new File("file.txt");

        //2º Compruebo si el fichero es de una linea o más
        //Si es de una linea usamos FileReader
        //Si es más de una linea usamos BufferReader
        //Comprobar si existe el fichero

        if (f.exists()) {
            FileReader fileReader = null;
            try {
                fileReader = new FileReader(f);
/*                for (int i=0; i<f.length();i++){
                    System.out.print((char) fileReader.read());
                }*/
/*                int lectura = 0;
                do{
                    lectura = fileReader.read();
                    System.out.println(lectura);
                }while(lectura!=-1);*/
                int lectura = 0;
                while ((lectura = fileReader.read()) != -1) {
                    System.out.print((char) lectura);
                }
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            System.out.println("Error no encontramos el fichero");
        }
    }
}