package Factory;

import java.util.HashMap;
import java.util.Map;

import MapPlaces.PlaceCategory;
import MapPlaces.PlaceTemplate;

public class PlaceTemplateFactory{
    private final Map<PlaceCategory, PlaceTemplate> templates = new HashMap<>();

    public PlaceTemplate getTemplate(PlaceCategory placeCategory){
        if(!templates.containsKey(placeCategory)){
            templates.put(placeCategory, new PlaceTemplate(placeCategory));
        }
        return templates.get(placeCategory);
    }

    public int getNumberOfTemplates(){
        return templates.size();
    }
}