package songCollection;

import SongIterator.Iterator;
import SongIterator.backwordIterator;
import SongIterator.forwardIterator;

public class Playlist implements songCollection {
    private String[] songs;

    public Playlist(String[] songs) {
        this.songs = songs;
    }

    public String[] getSongs(){
        return songs;
    }

    @Override
    public Iterator createForwardIterator() {
        return new forwardIterator(this);
    }

    @Override
    public Iterator createReverseIterator() {
        return new backwordIterator(this);
    }
}
