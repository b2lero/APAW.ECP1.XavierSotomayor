import java.util.HashMap;
import java.util.Map;

public class AlbumFactory {

    public static final AlbumFactory instance = new AlbumFactory();
    public Map<String, Album> albumList;

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
    }

}
