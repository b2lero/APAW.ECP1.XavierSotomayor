package main;


import java.time.LocalDate;
import java.util.Arrays;

public class Album{
    private String id;
    private String name;
    private LocalDate date;

    private Play[] playlist;

    public Album(String id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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
        return "main.Album{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", playlist=" + Arrays.toString(playlist) +
                '}';
    }
    
    
}