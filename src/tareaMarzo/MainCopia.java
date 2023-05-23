package tareaMarzo;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class MainCopia {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileWriter out = null;

        try {
            String rutaFicheroALeer = "./src/tarea1Marzo/archivo.txt";
            String rutaFicheroAEscribir = "./src/tarea1Marzo/copia.txt";
            System.out.println(rutaFicheroALeer);

            in = new FileInputStream(rutaFicheroALeer);
            out = new FileWriter(rutaFicheroAEscribir);

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
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







/*
package tarea1Marzo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class MainCopia {
    public static void main(String[] args) throws IOException {
    	
    	FileInputStream in = null;
    	FileOutputStream out =null;

    	try {
    		String rutaFicheroALeer = System.getProperty("user.dir") + "/src/tarea1Marzo/archivo.txt";
    		String rutaFicheroAEscribir = System.getProperty("user.dir") + "/src/tarea1Marzo/copia.txt";
    		System.out.println(rutaFicheroALeer); 
    		in = new FileInputStream("./src/tarea1Marzo/archivo.txt");
    		out = new FileOutputStream("./src/tarea1Marzo/copia.txt");

    		int c;
    		while ((c=in.read())!=1) {
    			out.write(c);
    		}
    	} finally {
    		if (in!=null)
    			in.close();
    		if (out!=null)
    			out.close();
    	}
  
    }
}
*/