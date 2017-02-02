package niet.andreu.DinoProfessor;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws IOException, JAXBException {

		Document doc = Jsoup.connect("http://localhost:9090/camio").get();
		Elements articles = doc.select("li.article");

		for (int i = 1; i < articles.size(); i++) {
			System.out.println(articles.get(i).text());
			Elements quantitat = articles.get(i).select("span");
			System.out.println(quantitat.text());
		}

		// generarXml();
	}

	private static void generarXml() throws JAXBException {

		List<Camio> camio = Arrays.asList(new Camio("Birba", "12"), new Camio("Pitu Sort", "12"));
		Camions camions = new Camions(camio);

		JAXBContext context = JAXBContext.newInstance(Camions.class);
		Marshaller creador = context.createMarshaller();

		creador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		creador.marshal(camions, System.out);
	}
}
