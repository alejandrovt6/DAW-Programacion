package tareaMarzo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainArchivo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("./src/tarea1Marzo/archivo.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("./src/tarea1Marzo/archivo2.txt");

            String linea;
            while ((linea = br.readLine()) != null) {
                fw.write(linea);
                fw.write("\n");
            }
            
        }  catch (IOException e) {
                System.out.println("No se pudo encontrar el archivo indicado");

        } finally {
            if (fr != null)
                fr.close();
            if (br != null)
                br.close();
            if (fw != null)
                fw.close();
        }
    }
}

