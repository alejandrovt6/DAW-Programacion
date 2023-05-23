package tareaAbril; 

public abstract class ClasA {
	
	// Atributos
	private int atr1ClasA;
	private String atr2ClasA;
	private static int contadorObj = 0;
	
	// Constructor con el total de parámetros
	public ClasA(int atr1ClasA, String atr2ClasA) {
		
		this.atr1ClasA = atr1ClasA;
		this.atr2ClasA = atr2ClasA;
		contadorObj++;
	}

	// Getter y Setter
	public int getAtr1ClasA() {
		return atr1ClasA;
	}

	public void setAtr1ClasA(int atr1ClasA) {
		this.atr1ClasA = atr1ClasA;
	}

	public String getAtr2ClasA() {
		return atr2ClasA;
	}

	public void setAtr2ClasA(String atr2ClasA) {
		this.atr2ClasA = atr2ClasA;
	}

	public static int getContadorObj() {
		return contadorObj;
	}

	public static void setContadorObj(int contadorObj) {
		ClasA.contadorObj = contadorObj;
	}
	
	
	// Método toString
	@Override
	public String toString() {
		return "ClasA atr1ClasA=" + atr1ClasA + ", atr2ClasA=" + atr2ClasA + "]"; 
	}

}

	
