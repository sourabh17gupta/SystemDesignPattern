package songCollection;

import SongIterator.Iterator;

public interface songCollection {
    Iterator createForwardIterator();
    Iterator createReverseIterator();
}
