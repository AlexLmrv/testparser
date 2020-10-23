package conditions;

import conditions.impl.ArgsConditionHandler;
import conditions.impl.FileConditionHandler;

public class ConditionsChecker {

    public static ConditionHandler setConditionHandler(String[] args) {
        if (args.length < 2) {
            System.out.println("Необходимо наличие параметров способа передачи и источника условий поиска!");
            System.exit(10);
        }
        if ("file".equalsIgnoreCase(args[0])) {
            return new FileConditionHandler();
        } else if ("args".equalsIgnoreCase(args[0])) {
            return new ArgsConditionHandler();
        } else {
            System.out.println("Необходимо указать корректный способ передачи условий поиска!");
            System.exit(20);
        }
        return null;
    }
}
