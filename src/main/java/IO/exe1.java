package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {

        List<String> capitols = new ArrayList<>();

        capitols.add("Warsaw");
        capitols.add("Berlin");
        capitols.add("Moscow");
        capitols.add("Madrid");
        capitols.add("Paris");
        capitols.add("Rome");

        try (PrintWriter printWriter = new PrintWriter("file.txt")) {
            for (String capitol : capitols) {
                printWriter.println(capitol);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File file = new File("villages.txt");
        try (Scanner scanner = new Scanner(file)) {
            String line;
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
