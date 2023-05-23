package tareaAbril;

public class ClasE extends ClasB implements InterB {
	
	// Atributos
	private final int FIJO2 = 10;
	private String atr2ClasE;
	private String atr3ClasE;
	
	// Constructor con el total de parámetros
	public ClasE(String atr2ClasE, String atr3ClasE, int atr1ClasA, String atr2ClasA) {
		
		super(EnumA.VALOR1, atr1ClasA, atr2ClasA, atr1ClasA);
		this.atr2ClasE = atr2ClasE;
		this.atr3ClasE = atr3ClasE;
		
	}
	
	// Getter y Setter
	public String getAtr2ClasE() {
		return atr2ClasE;
	}

	public void setAtr2ClasE(String atr2ClasE) {
		this.atr2ClasE = atr2ClasE;
	}

	public String getAtr3ClasE() {
		return atr3ClasE;
	}

	public void setAtr3ClasE(String atr3ClasE) {
		this.atr3ClasE = atr3ClasE;
	}

	public int getFIJO2() {
		return FIJO2;
	}


	// Métodos abstractos que habrá que implementar

	
	// Método toString y super.toString
	@Override
	public String toString() {
		return "ClasE [FIJO2=" + FIJO2 + ", atr2ClasE=" + atr2ClasE + ", atr3ClasE=" + atr3ClasE + "]" + super.toString();
	}
	
	
	// Métodos abstractos
	@Override
	public double abstracto1(int valor) {
		return 0;
	}

	@Override
	public void abstracto2(ClasE obj2) {

	}
		
}

