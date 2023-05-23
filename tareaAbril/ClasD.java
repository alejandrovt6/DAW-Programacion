package tareaAbril;

public class ClasD extends ClasB  implements InterA, InterB {
	
	// Atributos
	private final int FIJO1 = 5;
	private double atr2ClasD;
	private String atr3ClasD;
	
	// Constructor con el total de parámetros
	public ClasD(int atr1ClasA, String atr2ClasA, double atr2ClasD, String atr3ClasD) {
		
		super(EnumA.VALOR1, atr1ClasA, atr2ClasA, atr1ClasA);
		this.atr2ClasD = atr2ClasD;
		this.atr3ClasD = atr3ClasD;
	}

	// Getter y Setter
	public double getAtr2ClasD() {
		return atr2ClasD;
	}


	public void setAtr2ClasD(double atr2ClasD) {
		this.atr2ClasD = atr2ClasD;
	}


	public String getAtr3ClasD() {
		return atr3ClasD;
	}


	public void setAtr3ClasD(String atr3ClasD) {
		this.atr3ClasD = atr3ClasD;
	}


	public int getFIJO1() {
		return FIJO1;
	}


	// Métodos a implementar de otras clases e interfaces 
    public void mensaje1(ClasD obj1) {
        System.out.println("Método de la interface A en la clase ClasD");
    }
	
	
	// Método toString y super.toString
	@Override
	public String toString() {
		return "ClasD [FIJO1=" + FIJO1 + ", atr2ClasD=" + atr2ClasD + ", atr3ClasD=" + atr3ClasD + "]" + super.toString();
	}


	// Métodos abstractos

	@Override
	public double abstracto1(int valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void abstracto2(ClasE obj2) {
		// TODO Auto-generated method stub
		
	}		

}
	