package tareaAbril; 

public abstract class ClasB extends ClasA {
	
	// Atributos
    private EnumA enumA;
    
	// Constructor con el total de parámetros
    public ClasB(EnumA enumA, int atr1ClasA, String atr2ClasA, int valor) {
    	
    	super(atr1ClasA, atr2ClasA);
    	this.enumA = enumA;
    	
    }

	// Getter y Setter
	public EnumA getEnumA() {
		return enumA;
	}

	public void setEnumA(EnumA enumA) {
		this.enumA = enumA;
	}

	
	// Método abstracto
//	 public abstract double operacion(int parametro);
    protected double constante = 2.5;
    public abstract double abstracto1(int valor);



	 // toString y supertoString 
		@Override
	public String toString() {
			return super.toString() + ", enumA=" + enumA.toString();
		}

}

