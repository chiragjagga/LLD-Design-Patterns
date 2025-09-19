// See https://aka.ms/new-console-template for more information
        PlaceTemplateFactory templateFactory = new PlaceTemplateFactory();
        List<PointOfInterest> mapPlaces = new List<PointOfInterest>();
        
        Console.WriteLine("--- Initializing places on map ---");
        
        mapPlaces.Add(new PointOfInterest(10,20, "Third Wave", "Indiranagar", 
            templateFactory.getTemplate(PlaceCategory.COFFEE_SHOP)));
        mapPlaces.Add(new PointOfInterest(30,25, "Costa Coffee", "FORUM Mall", 
            templateFactory.getTemplate(PlaceCategory.COFFEE_SHOP)));
        mapPlaces.Add(new PointOfInterest(7,13, "Johns Hospital", "Kormangala", 
            templateFactory.getTemplate(PlaceCategory.HOSPITAL)));
        mapPlaces.Add(new PointOfInterest(10,20, "Mcdonalds", "Bellandur", 
            templateFactory.getTemplate(PlaceCategory.RESTAURANT)));
        mapPlaces.Add(new PointOfInterest(10,20, "Indian Oil", "Yemalur", 
            templateFactory.getTemplate(PlaceCategory.GAS_STATION)));

        
        // rendering with priority 2
        int currentPriority = 2;

        foreach (PointOfInterest place in mapPlaces){
            place.draw(currentPriority);
        }
        
        // rendering with priority 4
        currentPriority = 4;
        foreach (PointOfInterest place in mapPlaces){
            place.draw(currentPriority);
        }
