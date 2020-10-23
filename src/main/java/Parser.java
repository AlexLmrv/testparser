import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;

public class Parser {

    private static final String URL = "https://news.yandex.ru/computers.html";

    public static Document getDocument() throws IOException {
        return Jsoup.parse(new URL(URL), 10000);
    }
}
