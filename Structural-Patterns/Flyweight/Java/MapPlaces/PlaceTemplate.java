package MapPlaces;

public class PlaceTemplate {
    private final PlaceCategory placeCategory;
    private final byte[] icon;
    private final String categoryName;
    private final int renderPriority;

    public PlaceTemplate(PlaceCategory placeCategory){
        this.placeCategory = placeCategory;
        this.icon = new byte[1024];

        if(placeCategory == PlaceCategory.COFFEE_SHOP){
            this.categoryName = "Coffee Shop";
            this.renderPriority = 4;
        }
        else if(placeCategory == PlaceCategory.GAS_STATION){
            this.categoryName = "Gas Station";
            this.renderPriority = 2;
        }
        else if(placeCategory == PlaceCategory.RESTAURANT){
            this.categoryName = "Restaurant";
            this.renderPriority = 3;
        }
        else{
            this.categoryName = "Hospital";
            this.renderPriority = 1;
        }
    }

    public void draw(int latitude, int longitude) {
        System.out.printf("Drawing a %s icon [Category: %s, Priority: %d] at coordinates (%d, %d).\n", 
            placeCategory, categoryName, renderPriority, latitude, longitude);
    }
    
    public byte[] getIcon(){
        return this.icon;
    }

    public int getRenderPriority(){
        return this.renderPriority;
    }
}
