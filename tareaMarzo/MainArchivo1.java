package tareaMarzo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainArchivo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;
        
        try {
            in = new BufferedReader(new FileReader("./src/tarea1Marzo/archivo.txt"));
            out = new BufferedWriter(new FileWriter("./src/tarea1Marzo/archivo1.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
            }
            
        }  catch (IOException e) {
            System.out.println("No se pudo encontrar el archivo indicado");
            
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }
}
