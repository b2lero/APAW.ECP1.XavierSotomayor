package strategy;

import java.util.Arrays;
import java.util.Comparator;

public class ByDateAlbumSorting implements AlbumSortingStrategy {
    @Override
    public void sort(Album[] albums) {
        Arrays.sort(albums, new Comparator<Album>() {
            @Override
            public int compare(Album o1, Album o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
    }
}