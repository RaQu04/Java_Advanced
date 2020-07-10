package Lambda;

import javax.swing.plaf.basic.BasicBorders;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();

        main.run();


    }

    private void run() {
        List<String> names = new ArrayList<>();

        names.add("Lukasz");
        names.add("Oliwia");
        names.add("Szymon");
        names.add("Ola");
        names.add("Aleksander");
        names.add("Michał");
        names.add("Adam");

//        names.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

/*        names.sort(new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });*/


        modifyAndDisplay(names, s -> s + " " + new Random().nextInt(11));
    }

    private void modifyAndDisplay(List<String> names, Modifier modifier) {
        List<String> modifiedNames = new ArrayList<>();

        for (String name : names) {
            String modifyName = modify(name, modifier);
            modifiedNames.add(modifyName);
        }

        System.out.println(modifiedNames);
    }

    private String modify(String string, Modifier modifier) {

        return modifier.modify(string);
    }
}
