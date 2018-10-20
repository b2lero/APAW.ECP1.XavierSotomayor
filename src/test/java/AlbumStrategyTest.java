import main.Album;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import strategy.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlbumStrategyTest {

    private Album[] albums = new Album[3];
    private Album album1;
    private Album album2;
    private Album album3;

    @BeforeEach
    void before(){

        String date1 = "10-03-2010";
        String date2 = "11-03-2010";
        String date3 = "12-03-2010";

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        album1 = new Album("1", "album one", LocalDate.parse(date1,pattern));
        album2 = new Album("2", "album two", LocalDate.parse(date2,pattern));
        album3 = new Album("3", "album three", LocalDate.parse(date3,pattern));

        albums[0] = album1;
        albums[2] = album2;
        albums[1] = album3;



    }

    @Test
    void testSortByDate(){
        Album[] expectedarray = {album1, album2, album3};
        testSortingStrategy(new ByDateAlbumSorting());
        assertArrayEquals(expectedarray, albums);
    }

    @Test
    void testSortByName(){
        Album[] expected = {album1, album3, album2};
        testSortingStrategy(new ByNameAlbumSorting());
        assertArrayEquals(expected, albums);
    }



    void testSortingStrategy(AlbumSortingStrategy sortStrategy) {
        sortStrategy.sort(albums);
    }

}
