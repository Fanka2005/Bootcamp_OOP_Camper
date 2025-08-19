import java.util.List;
import java.util.ArrayList;

public class Backpack {
    private List<Item> items = new ArrayList<>();

    public Backpack(Bottle bottle, FlintAndSteel flintAndSteel, Bedroll bedroll){
        items.add(bottle);
        items.add(flintAndSteel);
        items.add(bedroll);
    }
    // Getter Method
    public List<Item> getItems(){
        return this.items;
    }
}
