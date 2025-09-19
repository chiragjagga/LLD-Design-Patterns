package MapPlaces;

public class PointOfInterest {
    private final int latitude;
    private final int longitude;
    private final String name;
    private final String address;
    private final PlaceTemplate placeTemplate;

    public PointOfInterest(int latitude, int longitude, String name, String address, PlaceTemplate template){
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.address = address;
        this.placeTemplate = template;
    }

    public void draw(int currentPriority){
        if(placeTemplate.getRenderPriority() <=  currentPriority){
            System.out.printf("POI: '%s' (%s) - ", name, address);
            placeTemplate.draw(latitude, longitude);
        }
        else{
            System.out.printf("--> Skipping render for '%s' as priority is not reached.\n", name);
        }
    }
}
