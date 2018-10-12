import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class AlbumFactoryTest {

    @BeforeEach
    void before(){
        AlbumFactory albumFactory = AlbumFactory.getInstance();
        Album newAlbum = new Album("1","Thriller");
        albumFactory.addAlbumList(newAlbum);
    }

    @Test
    void testIsSingleton(){
        assertSame(AlbumFactory.getInstance(), AlbumFactory.getInstance());
    }

    @Test
    void testGetAlbumList(){
        AlbumFactory albumFactory = AlbumFactory.getInstance();
        assertEquals("1", albumFactory.getAlbumList("1").getId());
        assertEquals("Thriller", albumFactory.getAlbumList("1").getName());
    }

}
