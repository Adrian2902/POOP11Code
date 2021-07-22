package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author Gutierrez Adrian, De La cruz Marlene
 */
public class ClaseFileWriter {
    public static void main(String[] leer) {
        String texto = "";
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribir texto:");
            texto = br.readLine();
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            salida.close();
        }catch(IOException ioe){
            System.out.println("Error al abrir o guardar el archivo:");
            ioe.printStackTrace();
        }catch(Exception e){
            System.out.println("Error al leer del teclado:");
            e.printStackTrace();
        }
    }
}
