import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilesLecture {
    public static void main(String[] args) throws IOException {
        String directory = "test";
        String filename = "test.txt";
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            try {
                Files.createDirectories(dataDirectory);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (Files.notExists(dataFile)) {
            try {
                Files.createFile(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] names = {"bob", "joe", "tim", "pizza"};
        List<String> people = Arrays.asList(names);
        Files.write(Paths.get("test", "test.txt"), people);
//        try {
//            Files.write(
//                    Paths.get("test", "test.txt"),
//                    Arrays.asList("pizza"),
//                    StandardOpenOption.APPEND
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        List<String> newList = new ArrayList<>();
        for (String line : people) {
            if (line.equals("pizza")) {
                newList.add("frog");
                continue;
            }
            newList.add(line);
        }
        Files.write(Paths.get("test", "test.txt"), newList);
    }
}
