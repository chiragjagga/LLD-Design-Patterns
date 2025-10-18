public class SeventiesHits : SongCollection {

    private List<String> bestSongs;

    public SeventiesHits(){
        bestSongs = new List<string>();
        addSong("Bohemian Rhapsody", "Queen", 1975);
        addSong("Stairway to Heaven", "Led Zeppelin", 1971);
        addSong("Hotel California", "Eagles", 1976);
    }

    public void addSong(String songName, String bandName, int yearReleased)
    {
        bestSongs.Add(songName + " by " + bandName + ", " + yearReleased);
    }
    
    public SongIterator createIterator() {
        return new SeventiesHitsIterator(bestSongs);
    }
    
}
