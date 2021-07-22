package poop11;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author Gutierrez Adrian, De La cruz Marlene
 */
public class POOP11 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        
        try{
            File archivo = new File("archivo.txt");
            System.out.println(archivo.exists());
            boolean seCreo = archivo.createNewFile();
            System.out.println(seCreo);
            System.out.println(archivo.exists());
        }catch(IOException e){}
        
    } 
}
