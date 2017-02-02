package niet.andreu.DinoProfessor;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Camions {

	@XmlElement(name="camio")
	private List<Camio> Camions;

	public Camions() {
		
	}

	public Camions(List<Camio> camions) {
		super();
		Camions = camions;
	}
	
	
}
