import java.util.List;
import java.util.ArrayList;

public class Camper {
    private String camperName;
    private Backpack backpack;

    //Constructor
    public Camper(String _camperName){
        this.camperName = _camperName;
        this.backpack = new Backpack(new Bottle("Bottle", 1.00, 1.0), new FlintAndSteel("Flint and Steel", 0.50), new Bedroll("Bedroll", 7.00));
    }

    // Getter Method
    public void checkAllItems(){
        List<Item> items = backpack.getItems();

        for(Item item : items){
            System.out.println(item.toString());
        }

    }

    public String getCamperName(){
        return this.camperName;
    }
}
