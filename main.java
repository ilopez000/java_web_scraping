import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.europarl.europa.eu/meps/en/197490/MAGDALENA_ADAMOWICZ/home");

        // Obtener el HTML directamente con Jsoup
        Document document = Jsoup.connect(url.toString()).get();

        // Seleccionar todos los elementos <p>
        Elements paragraphs = document.select("p");

        // Iterar sobre todos los elementos <p> y extraer el texto
        for (Element paragraph : paragraphs) {
            System.out.println(paragraph.text());
        }
    }
}
