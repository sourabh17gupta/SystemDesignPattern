package SongIterator;

import songCollection.Playlist;

public class forwardIterator implements Iterator {
    private Playlist playlist;
    private int index = 0;
    public forwardIterator(Playlist playlist) {
        this.playlist = playlist;
    }
    @Override
    public boolean hasNext() {
        return index < playlist.getSongs().length;
    }

    @Override
    public String next() {
        return playlist.getSongs()[index++];
    }
}
