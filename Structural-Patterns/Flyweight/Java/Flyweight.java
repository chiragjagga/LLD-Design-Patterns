import java.util.ArrayList;
import java.util.List;

import Factory.PlaceTemplateFactory;
import MapPlaces.PlaceCategory;
import MapPlaces.PointOfInterest;

public class Flyweight {
    public static void main(String[] args) {
        PlaceTemplateFactory templateFactory = new PlaceTemplateFactory();
        List<PointOfInterest> mapPlaces = new ArrayList<>();
        
        System.out.println("--- Initializing places on map ---");
        
        mapPlaces.add(new PointOfInterest(10,20, "Third Wave", "Indiranagar", 
            templateFactory.getTemplate(PlaceCategory.COFFEE_SHOP)));
        mapPlaces.add(new PointOfInterest(30,25, "Costa Coffee", "FORUM Mall", 
            templateFactory.getTemplate(PlaceCategory.COFFEE_SHOP)));
        mapPlaces.add(new PointOfInterest(7,13, "Johns Hospital", "Kormangala", 
            templateFactory.getTemplate(PlaceCategory.HOSPITAL)));
        mapPlaces.add(new PointOfInterest(10,20, "Mcdonalds", "Bellandur", 
            templateFactory.getTemplate(PlaceCategory.RESTAURANT)));
        mapPlaces.add(new PointOfInterest(10,20, "Indian Oil", "Yemalur", 
            templateFactory.getTemplate(PlaceCategory.GAS_STATION)));

        
        // rendering with priority 2
        int currentPriority = 2;

        for(PointOfInterest place : mapPlaces){
            place.draw(currentPriority);
        }
        
        // rendering with priority 4
        currentPriority = 4;
        for(PointOfInterest place : mapPlaces){
            place.draw(currentPriority);
        }
    }
}
