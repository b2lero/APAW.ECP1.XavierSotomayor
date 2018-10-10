import java.time.LocalDateTime;
import java.util.Arrays;

public class Album{
    private String id;
    private String name;
    private LocalDateTime date;

    private Play[] playlist;

    public Album(String id, String name, LocalDateTime date, Play[] playlist) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.playlist = playlist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Play[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Play[] playlist) {
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", playlist=" + Arrays.toString(playlist) +
                '}';
    }
}