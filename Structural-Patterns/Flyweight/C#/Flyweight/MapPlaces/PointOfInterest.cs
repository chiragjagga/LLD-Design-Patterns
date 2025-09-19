public class PointOfInterest {
    private readonly int latitude;
    private readonly int longitude;
    private readonly String name;
    private readonly String address;
    private readonly PlaceTemplate placeTemplate;

    public PointOfInterest(int latitude, int longitude, String name, String address, PlaceTemplate template){
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
        this.placeTemplate = template;
    }

    public void draw(int currentPriority){
        if(placeTemplate.getRenderPriority() <=  currentPriority){
            Console.WriteLine($"Place of interest: '{name}' ({address}) - ");
            placeTemplate.draw(latitude, longitude);
        }
        else{
            Console.WriteLine($"--> Skipping render for '{name}' as priority is not reached.\n");
        }
    }
}
