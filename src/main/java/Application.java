import conditions.ConditionHandler;
import conditions.ConditionsChecker;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

import static java.util.Collections.reverseOrder;

public class Application {



    public static void main(String[] args) throws IOException {

        ConditionHandler conditionHandler = ConditionsChecker.setConditionHandler(args);
        String[] conditions = conditionHandler.getConditions(args);
        Document document = Parser.getDocument();
        Map<String, Long> stats = ParseHandler.getStats(conditions, document);
        stats.entrySet()
                .stream()
                .sorted(reverseOrder(Map.Entry.comparingByValue()))
                .forEach((entry) -> System.out.println("Слово \""+ entry.getKey() + "\" встречается " + entry.getValue() + " раз."));
    }
}
