import java.util.List;
import java.util.ArrayList;

public class Backpack {
    private List<Item> items = new ArrayList<>();

    public Backpack(Bottle _bottle, FlintAndSteel _flintAndSteel, Bedroll _bedroll){
        items.add(_bottle);
        items.add(_flintAndSteel);
        items.add(_bedroll);
    }

    // Getter Method
    public List<Item> getItems(){
        return this.items;
    }
}
