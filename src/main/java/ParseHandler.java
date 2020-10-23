import org.jsoup.nodes.Document;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseHandler {

    public static Map<String, Long> getStats(String[] conditions, Document document) {
        Map<String, Long> stats = new HashMap<>();
        List<String> words = Arrays.asList(document.body().text().split("([ <>;,.!?])|(\b<\\w+>\b)"));
        for (String condition : conditions) {
            long count = words.stream()
                    .filter(condition::equalsIgnoreCase)
                    .count();
            stats.put(condition, count);
        }
        return stats;
    }
}
