package Implementations;

import java.util.ArrayList;
import java.util.List;

import Interfaces.SongCollection;
import Interfaces.SongIterator;

public class SeventiesHits implements SongCollection {

    private List<String> bestSongs;

    public SeventiesHits(){
        bestSongs = new ArrayList<>();
        addSong("Bohemian Rhapsody", "Queen", 1975);
        addSong("Stairway to Heaven", "Led Zeppelin", 1971);
        addSong("Hotel California", "Eagles", 1976);
    }

    public void addSong(String songName, String bandName, int yearReleased) {
        bestSongs.add(songName + " by " + bandName + ", " + yearReleased);
    }

    @Override
    public SongIterator createIterator() {
        return new SeventiesHitsIterator(bestSongs);
    }
    
}
