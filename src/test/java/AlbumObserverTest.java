import main.Album;
import main.AlbumFactory;
import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlbumObserverTest {

    AlbumFactory albumFactory;

    Album album1;
    Album album2;
    Album album3;

    @BeforeEach
    void before(){
        albumFactory = AlbumFactory.getInstance();

        album1 = new Album("01","albumOne",null);
        album2 = new Album("02","albumTwo",null);
        album3 = new Album("03","albumThree",null);

        albumFactory.addAlbumList(album1);

    }

    @Test
    void testSubscribe(){
        Consumer<String> subscribe = albumFactory.subscribe(
                s -> LogManager.getLogger(this.getClass()).info("New Album added: " + s)
        );

        albumFactory.addAlbumList(album2);
        albumFactory.unsubscribe(subscribe);
        albumFactory.addAlbumList(album3);
    }

    @Test
    void testSubscribeAssert(){
        albumFactory.addAlbumList(new Album("04", "test",null));
        albumFactory.subscribe(s -> {
            assertEquals("test", s);
        });
    }



}
