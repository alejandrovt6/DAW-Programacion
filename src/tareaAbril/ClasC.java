package tareaAbril; 

public class ClasC extends ClasA {
	
	// Atributos
	private int atr1ClasC;
	private boolean atr2ClasC;

	// Constructor con el total de parámetros
	public ClasC(int atr1ClasA, String atr2ClasA, int atr1ClasC, boolean atr2ClasC) {
		
		super(atr1ClasA, atr2ClasA);		
		this.atr1ClasC = atr1ClasC;
		this.atr2ClasC = atr2ClasC;
		
	}
	
	// Getter y Setter
	public int getAtr1ClasC() {
		return atr1ClasC;
	}
	
	public void setAtr1ClasC(int atr1ClasC) {
		this.atr1ClasC = atr1ClasC;
	}
	
	public boolean isAtr2ClasC() {
		return atr2ClasC;
	}
	
	public void setAtr2ClasC(boolean atr2ClasC) {
		this.atr2ClasC = atr2ClasC;
	}
	
	
	// Método toString y super.toString
	@Override
	public String toString() {
        return super.toString() + ", atr1ClasC=" + atr1ClasC + ", atr2ClasC=" + atr2ClasC;
		}
/*
	@Override
	public void metodoAbstracto() {
		// TODO Auto-generated method stub
*/		
	}
	

