package conditions.impl;

import conditions.ConditionHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileConditionHandler implements ConditionHandler {
    public String[] getConditions(String[] args) {

//        составляем список искомых слов из файла
        try {
            return Files.readString(Path.of(args[1]), StandardCharsets.UTF_8).split("([ \\n])");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при чтении файла условий!");
            System.exit(30);
        }
        return new String[0];
    }
}
