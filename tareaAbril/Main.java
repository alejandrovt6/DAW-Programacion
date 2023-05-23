package tareaAbril;

public class Main {

	public static void main(String[] args) {

    ClasC objC = new ClasC(50,"Objeto C", 10, true);
    ClasD objD = new ClasD(15,"Objeto D", 5.55,"Atributo D");
    ClasE objE = new ClasE("Objeto E1", "Objeto E2", 1, "Objeto E3");

    System.out.println("***Datos en objC***\n");
	System.out.println(objC.toString() + "\n");
    System.out.println("***Datos en objD***\n");
    System.out.println(objD.toString() + "\n");
    System.out.println("***Datos en objE***\n");
    System.out.println(objE.toString() + "\n");
    
    
    System.out.println("Total de clases ClasA instanciadas: " + ClasA.getContadorObj());
    
    
    System.out.println("Método abstracto declarado en ClasB e implementado en ClasD que devuelve un: " + objC.getAtr1ClasA());
    System.out.println("\"Método abstracto declarado en ClasB e implementado en ClasE que devuelve un: " + objC.getAtr2ClasA());
    

	}
}

