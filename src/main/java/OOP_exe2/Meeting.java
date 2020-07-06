package OOP_exe2;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Meeting {
    private String description;
    private String address;
    private LocalDate date;
    private int size;

    public Meeting(String description, String address) {
        this.description = description;
        this.address = address;
        this.date = LocalDate.now();
        this.size = 18;
    }

    public Meeting(String description, String address, LocalDate date, int size) {
        this.description = description;
        this.address = address;
        this.date = date;
        this.size = size;
    }

    public String getDescription() {
        return this.description + " " + this.date + " " + this.size;
    }

    public LocalDate delayMeeting(int days){
        return this.date.plusDays(days);
    }
}
