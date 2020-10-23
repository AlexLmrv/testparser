import conditions.ConditionHandler;
import conditions.ConditionsChecker;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

public class Application {



    public static void main(String[] args) throws IOException {

        ConditionHandler conditionHandler = ConditionsChecker.setConditionHandler(args);
        String[] conditions = conditionHandler.getConditions(args);
        Document document = Parser.getDocument();
        Map<String, Long> stats = ParseHandler.getStats(conditions, document);
        assert stats != null;
        stats.forEach((word, count) -> System.out.println("Слово \""+ word + "\" встречается " + count + " раз."));

    }
}
