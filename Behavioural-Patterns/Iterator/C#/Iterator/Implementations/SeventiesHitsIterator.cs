public class SeventiesHitsIterator : SongIterator {
    private List<String> songs;
    private int position = 0;

    public SeventiesHitsIterator(List<String> songs){
        this.songs = songs;
    }

    public bool hasNext() {
        return position < songs.Count && songs[position] != null;
    }

    public String next() {
        String song = songs[position];
        position++;
        return song;
    }
    
}
