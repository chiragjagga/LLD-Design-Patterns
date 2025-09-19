public class PlaceTemplateFactory{
    private readonly IDictionary<PlaceCategory, PlaceTemplate> templates = new Dictionary<PlaceCategory, PlaceTemplate>();

    public PlaceTemplate getTemplate(PlaceCategory placeCategory){
        if(!templates.ContainsKey(placeCategory)){
            templates.Add(placeCategory, new PlaceTemplate(placeCategory));
        }
        return templates[placeCategory];
    }

    public int getNumberOfTemplates(){
        return templates.Count;
    }
}