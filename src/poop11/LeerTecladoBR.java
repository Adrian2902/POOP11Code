package poop11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Gutierrez Adrian, De La cruz Marlene
 */
public class LeerTecladoBR {
    public static void main(String[] args) {
        try{
            String texto = "";
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribir el texto deseado:");
            texto = br.readLine();
            System.out.println("El tetxto escrito fue:" + texto);
        }catch(IOException ioe){
            System.out.println("Error al leer caracteres:" + ioe);
        }
    }
}
