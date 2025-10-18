import Implementations.NinetiesHits;
import Implementations.SeventiesHits;
import Interfaces.SongCollection;
import Interfaces.SongIterator;

public class Iterator{
    public static void main(String[] args) {
        SongCollection seventies = new SeventiesHits();
        SongCollection nineties = new NinetiesHits();

        
        System.out.println("--- DJ is playing 70s Hits ---");
        printPlaylist(seventies);

        System.out.println("\n--- DJ is playing 90s Hits ---");
        printPlaylist(nineties);
    }

    public static void printPlaylist(SongCollection collection) {
        SongIterator iterator = collection.createIterator();
        
        while (iterator.hasNext()) {
            String song = iterator.next();
            System.out.println("Now playing: " + song);
        }
    }
}