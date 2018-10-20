package main;

import java.util.List;

public class Publisher {

    private String id;
    private String name;
    private String label;

    private List<Album> albumList;

    public Publisher(String id, String name, List<Album> albumList){
        this.id = id;
        this.name = name;
        this.albumList = albumList;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    public void setName(String name) {
        this.name = name;
    }
}
