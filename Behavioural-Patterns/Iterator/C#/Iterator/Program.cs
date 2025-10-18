    SongCollection seventies = new SeventiesHits();
    SongCollection nineties = new NinetiesHits();
    
    Console.WriteLine("--- DJ is playing 70s Hits ---");
    printPlaylist(seventies);
    Console.WriteLine("\n--- DJ is playing 90s Hits ---");
    printPlaylist(nineties);

    void printPlaylist(SongCollection collection) {
        SongIterator iterator = collection.createIterator();
        
        while (iterator.hasNext()) {
            String song = iterator.next();
            Console.WriteLine("Now playing: " + song);
        }
    }