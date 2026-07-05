package SongIterator;

import songCollection.Playlist;

public class backwordIterator implements Iterator {
    private Playlist playlist;
    private int index;
    public backwordIterator(Playlist playlist) {
        this.playlist = playlist;
        this.index = playlist.getSongs().length - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public String next() {
        return playlist.getSongs()[index--];
    }
}
