package strategy;

import main.Album;

import java.util.Arrays;

public class ByNameAlbumSorting implements AlbumSortingStrategy {
    @Override
    public void sort(Album[] albums) {
        Arrays.sort(
                albums,
                (o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

}
