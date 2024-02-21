import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // URL de ejemplo
        URL url = new URL("https://www.example.com/");

        // Abrir una conexión a la URL
        InputStream inputStream = url.openStream();

        // Parsear el contenido de la URL con BeautifulSoup
        Document document = Jsoup.parse(inputStream, "UTF-8");

        // Cerrar la conexión
        inputStream.close();

        // Imprimir el título de la página
        System.out.println(document.title());
    }
    }
}
