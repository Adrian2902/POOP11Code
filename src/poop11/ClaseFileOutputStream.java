package poop11;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Gutierrez Adrian, De La cruz Marlene

 */
public class ClaseFileOutputStream {
    public static void main(String[] args) {
        System.out.println("Ejejercicio 2");
        
        FileOutputStream fos = null;
        byte[] buffer = new byte[81];
        int nBytes;
        try{
            System.out.println("Escribir el texto a guardar en el archivo");
            nBytes = System.in.read(buffer);
            fos = new FileOutputStream("fos.txt");
            fos.write(buffer,0,nBytes);
            
        }catch(IOException ioe){
            System.out.println("Error: "+ ioe.toString());
        }finally{
            try{
                if(fos != null) fos.close();
            }catch(IOException ioe){
                System.out.println("Error al cerrar el archivo");
            }
        }
    }
}
