package niet.andreu.DinoProfessor;

public class Camio {

	private String conductor;
	private String paquets;
	
	public Camio() {
		
	}

	public Camio(String conductor, String paquets) {
		super();
		this.conductor = conductor;
		this.paquets = paquets;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	public String getPaquets() {
		return paquets;
	}

	public void setPaquets(String paquets) {
		this.paquets = paquets;
	}
	
	
}
