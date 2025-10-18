package Implementations;

import Interfaces.SongCollection;
import Interfaces.SongIterator;

public class NinetiesHits implements SongCollection {
    private String[] bestSongs;
    private int arrayValue = 0;

    public NinetiesHits(){
        bestSongs = new String[3];
        addSong("Smells Like Teen Spirit", "Nirvana", 1991);
        addSong("One", "U2", 1992);
        addSong("Wonderwall", "Oasis", 1995);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        String song = songName + " by " + bandName + ", " + yearReleased;
        bestSongs[arrayValue] = song;
        arrayValue++;
    }

    @Override
    public SongIterator createIterator() {
        return new NinetiesHitsIterator(bestSongs);
    }
}
