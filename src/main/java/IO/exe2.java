package IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class exe2 {
    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("C:/Users/lukasz.rakowiecki/Desktop/Projekty/Java_Advanced/file.txt");

        boolean exists = Files.exists(p1);
        System.out.println(exists);

        System.out.println(Files.size(p1));

        //Files.createDirectory(Paths.get("C:/Users/lukasz.rakowiecki/Desktop/Projekty/new_dir")); // tworzenie katalogu

       try{
            List<String> lines = Files.readAllLines(p1);
            lines.add("Test");
            lines.add("Tes2t");
            lines.add("Te3st");

/*            for (String line :
                    lines) {
                System.out.println(line);
            }*/
        }catch (IOException e){
            e.printStackTrace();
        }

        Files.lines(p1).forEach(System.out::println);


    }
}
