import java.time.LocalDateTime;

public class Album{
    private String id;
    private String name;
    private LocalDateTime date;

    private Play[] playlist;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return date;
    }

}