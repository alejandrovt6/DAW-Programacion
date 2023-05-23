package tareaMayo;

public class Modulo {
	
	// Atributos
	int idModulo;
	String nomModulo;
	int numHoras;
	String nomProfe;
	int numUnit;
	int notaFinal;
	
	// Constructor BBDD
	public Modulo(String nomModulo, int numHoras, String nomProfe, int numUnit, int notaFinal) {
//		this.idModulo = idModulo;
		this.nomModulo = nomModulo;
		this.numHoras = numHoras;
		this.nomProfe = nomProfe;
		this.numUnit = numUnit;
		this.notaFinal = notaFinal;
	}

/*	public Modulo(String string, int i, String string2, int j, int notaFinal2) {
		// TODO Auto-generated constructor stub
	}*/

	// Getter y Setter
/*	public int getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}
*/
	public String getNomModulo() {
		return nomModulo;
	}

	public void setNomModulo(String nomModulo) {
		this.nomModulo = nomModulo;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public String getNomProfe() {
		return nomProfe;
	}

	public void setNomProfe(String nomProfe) {
		this.nomProfe = nomProfe;
	}
	
	public int getnumUnit() {
		return numUnit;
	}

	public void setnumUnit(int numUnit) {
		this.numUnit = numUnit;
	}

	public int getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	
	
}
