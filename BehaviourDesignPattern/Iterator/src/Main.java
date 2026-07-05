
import SongIterator.Iterator;
import songCollection.*;
void main() {
   songCollection playlist = new Playlist(
           new String[]{"A","B","C"}
   );

    Iterator forward = playlist.createForwardIterator();
    Iterator reverse = playlist.createReverseIterator();

    //print forward
    System.out.println("Printing Forward Songs");
    while(forward.hasNext()){
        System.out.println(forward.next());
    }



    //print Backward
    System.out.println("Printing Backward Songs");
    while(reverse.hasNext()){
        System.out.println(reverse.next());
    }

}
