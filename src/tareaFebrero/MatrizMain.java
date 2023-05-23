package tareaFebrero;

import java.util.*;

public class MatrizMain {

	public static void main(String[] args) {

	    int filas = 4, columnas = 6;
	    
	    String[][] matriz = new String[filas][columnas];
	    
	    System.out.println("***Matriz de 4 filas y 6 columnas***");
	    System.out.println(" ");
	    
	    for (int i = 0; i < filas; i++) {
	      for (int j = 0; j < columnas; j++) {
	        matriz[i][j] = "X";
	      }
	    }
	    
	    for (int i = 0; i < filas; i++) {
	      for (int j = 0; j < columnas; j++) {
	        System.out.print(matriz[i][j] + "	");
	      }
	      
	      System.out.println("\n");	        
	    }
	    
	      // CAMBIAR ELEMENTO 	    
	    int fila, columna;
	    
	    System.out.println("***Introduce las coordenadas del elemento a cambiar*** \n");

	    do {
		    
			System.out.print("Coordenada I(filas): ");
			Scanner cFila = new Scanner(System.in);		    
			fila = cFila.nextInt();
			
			if(fila >= filas || fila < 0) {
				System.out.println("Coordenada I fuera del rango \n");
		    }	    	
		    
	    } while (fila >= filas || fila < 0);
			
	    do {
	    	
	    
		    System.out.print("\n"+"Coordenada J(columnas): ");
		    Scanner cColumna = new Scanner(System.in);	    
		    columna = cColumna.nextInt();
		    
		    if(columna >= columnas || columna < 0) {
		    	System.out.print("Coordenada J fuera del rango \n");
		    }		  
		    
	    } while (columna >= columnas || columna < 0);

	    System.out.println("\n"+"Introduce el nuevo elemento:");
	    Scanner cNuevo = new Scanner(System.in);    
	    String nuevo = cNuevo.next();

	    matriz[fila][columna] = nuevo;

	    // MOSTRAR MATRIZ	  
	    for (int i = 0; i < filas; i++) {
		      for (int j = 0; j < columnas; j++) {
		        System.out.print(matriz[i][j] + "	");
		      }
		      
		      System.out.println("\n");	              
	  }
	    
	  // CÁCLCULAR CARACTERES
	    String cadena = nuevo;
	    int longitud = cadena.length();
	    System.out.println("El elemento nuevo introducido en la matriz tiene " + longitud + " caracteres");
	}
}


