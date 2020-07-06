package OOP_exe2;

import java.lang.invoke.MethodType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Meeting meeting1 = new Meeting(
                "Coffe with friends",
                "Kaliska 21",
                LocalDate.of(2020, 06, 07),
                (int)(Math.random()*30)+50);

        Meeting meeting2 = new Meeting(
                "Tea with friends",
                "Poznanska 21",
                LocalDate.of(2020, 02, 01),
                (int)(Math.random()*30)+50);

        Meeting meeting3 = new Meeting(
                "Coffe with friends",
                "Kaliska 21",
                LocalDate.of(2020, 06, 07),
                (int)(Math.random()*30)+50);

        Meeting meeting4 = new Meeting(
                "Coffe with friends",
                "Kaliska 21",
                LocalDate.of(2020, 06, 07),
                (int)(Math.random()*30)+50);

        System.out.println(meeting1.delayMeeting(2));
        List<Meeting> meetings = new ArrayList<>();

        meetings.add(meeting1);
        meetings.add(meeting2);
        meetings.add(meeting3);
        meetings.add(meeting4);

        meetings.forEach(meeting -> System.out.println(meeting.getDescription()));


    }
}
