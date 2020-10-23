package conditions.impl;

import conditions.ConditionHandler;

import java.util.Arrays;

public class ArgsConditionHandler implements ConditionHandler {

    public String[] getConditions(String[] args) {
//        возвращаем остальной массив после первого индекса
        return Arrays.copyOfRange(args, 1, args.length);
    }
}
