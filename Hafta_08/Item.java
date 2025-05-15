import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private String name;
    private LocalDateTime creationTime;

    public Item(String name, LocalDateTime creationTime) {
        this.name = name;
        this.creationTime = LocalDateTime.now();
    }
    public String getName() {
        return name;
    }
    public LocalDateTime getCreationTime() {
        return creationTime;
    }
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return name + " (Oluşturulma tarihi: " + creationTime.format(formatter) + ")";
    }
}
