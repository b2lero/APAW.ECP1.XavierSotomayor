import main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PublisherCompositeTest {

    private PublisherComponent root;
    private PublisherComponent sub11;
    private PublisherComponent leaf;

    private List<Album> albumList = new ArrayList<Album>();

    private Publisher publisherLeaf;


    @BeforeEach
    void before(){

        PublisherComponent sub1;
        PublisherComponent sub12;

        this.albumList.add(new Album("01", "Thriller", null));
        this.albumList.add(new Album("02", "Starboy", null));

        this.root = new PublisherComposite("root");
        this.publisherLeaf = new Publisher("1", "publisherLeaf_01",albumList);
        this.leaf = new PublisherLeaf(publisherLeaf);
        this.root.add(leaf);
        sub1 = new PublisherComposite("sub1");
        this.root.add(sub1);
        this.root.add(new PublisherLeaf(new Publisher("2", "publisherLeaf_02", albumList)));

        this.sub11 = new PublisherComposite("sub11");
        sub1.add(sub11);
        sub1.add(new PublisherLeaf(new Publisher("4", "publisherLeaf_04", albumList)));

        sub12 = new PublisherComposite("sub12");
        sub1.add(sub12);

        sub12.add(new PublisherLeaf(new Publisher("5", "publisherLeaf_05", albumList)));
        this.sub11.add(new PublisherLeaf(new Publisher("6", "publisherLeaf_06", albumList)));

    }

    @Test
    void testIsComposite(){
        assertTrue(sub11.isComposite());
    }

    @Test
    void testLeafId(){
        assertEquals("1", publisherLeaf.getId());
    }

    @Test
    void testViewNameComposite(){
        assertEquals("sub11", sub11.view());
    }

    @Test
    void testAddLeaf() {
        Publisher temp = new Publisher("23", "name publisher",albumList );
        assertThrows(UnsupportedOperationException.class, () -> this.leaf.add(new PublisherLeaf(temp)));
    }


}
