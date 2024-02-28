import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.prateducacio.com/lescola-prat-educacio/");

        // Obtener el HTML directamente con Jsoup
        Document document = Jsoup.connect(url.toString()).get();
        //getElementByID

        // Seleccionar los tags
        Elements headers = document.select("h4.media-heading");

        for(int i=0; i<headers.size(); i++){
            System.out.println(headers.get(i).text());
        }


  


    }
}
