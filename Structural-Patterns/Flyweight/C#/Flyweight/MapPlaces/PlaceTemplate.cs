public class PlaceTemplate {
    private readonly PlaceCategory placeCategory;
    private readonly byte[] icon;
    private readonly String categoryName;
    private readonly int renderPriority;

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
        Console.WriteLine($"Drawing a {placeCategory} icon [Category: {categoryName}, Priority: {renderPriority}] at coordinates ({latitude}, {longitude}).\n");
    }
    
    public byte[] getIcon(){
        return this.icon;
    }

    public int getRenderPriority(){
        return this.renderPriority;
    }
}
