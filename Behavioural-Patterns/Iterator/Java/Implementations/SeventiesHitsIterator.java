package Implementations;

import java.util.List;

import Interfaces.SongIterator;

public class SeventiesHitsIterator implements SongIterator {
    private List<String> songs;
    private int position = 0;

    public SeventiesHitsIterator(List<String> songs){
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size() && songs.get(position) != null;
    }

    @Override
    public String next() {
        String song = songs.get(position);
        position++;
        return song;
    }
    
}
