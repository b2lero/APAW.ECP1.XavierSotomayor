package main;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class AlbumFactory {

    public static final AlbumFactory instance = new AlbumFactory();
    public Map<String, Album> albumList;

    private List<Consumer<String>> consumers;

    private AlbumFactory() {
        this.albumList = new HashMap<>();
    }

    public static AlbumFactory getInstance(){
        return instance;
    }

    public Album getAlbumList(String id){
      return albumList.get(id);
    };

    public void removeAlbumList(String id){
        this.albumList.remove(id);
    }

    public void addAlbumList(Album a){
        this.albumList.put(a.getId(), a);
        this.consumers.forEach(c -> c.accept(a.getName()));
    }

    public Consumer<String> subscribe(Consumer<String> consumer){
        consumers.add(consumer);
        return consumer;
    }

    public void unsubscribe(Consumer<String> consumer){
        consumers.remove(consumer);
    }
}
