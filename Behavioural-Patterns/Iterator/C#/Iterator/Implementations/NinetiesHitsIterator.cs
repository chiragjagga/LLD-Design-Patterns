public class NinetiesHitsIterator : SongIterator{

    private String[] songs;
    private int position = 0;

    public NinetiesHitsIterator(String[] songs){
        this.songs = songs;
    }

    public Boolean hasNext() {
        return position < songs.Length && songs[position] != null;
    }

    public String next() {
        String song = songs[position];
        position++;
        return song;
    }
}
