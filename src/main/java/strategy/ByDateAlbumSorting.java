package strategy;

import main.Album;

import java.util.Arrays;

public class ByDateAlbumSorting implements AlbumSortingStrategy {


    @Override
    public void sort(Album[] albums) {
        Arrays.sort(
                albums,
                (o1, o2) -> o1.getDate().compareTo(o2.getDate()));
    }


}

