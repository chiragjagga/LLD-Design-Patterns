package Implementations;

import Interfaces.SongIterator;

public class NinetiesHitsIterator implements SongIterator{

    private String[] songs;
    private int position = 0;

    public NinetiesHitsIterator(String[] songs){
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.length && songs[position] != null;
    }

    @Override
    public String next() {
        String song = songs[position];
        position++;
        return song;
    }
    
}
