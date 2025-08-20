import java.util.List;

public class Camper {
    private String camperName;
    private Backpack backpack;
    private int hydrationLevel;
    private int coldnessLevel;
    //Constructor
    public Camper(String _camperName){
        this.camperName = _camperName;
        this.backpack = new Backpack(new Bottle("Bottle", 1.00, 1.0), new FlintAndSteel("Flint and Steel", 0.50), new Bedroll("Bedroll", 7.00), 10.0);
        this.hydrationLevel = 20;
        this.coldnessLevel = 20;
    }

    // Getter Method
    public void checkAllItems(){
        List<Item> items = backpack.getItems();

        for(Item item : items){
            System.out.println(item.toString());
        }

    }

    // Getter Method
    public boolean add(Item _item){
        return backpack.add(_item);
    }

    public boolean remove(Item _item){
        return backpack.remove(_item);
    }

    public String getCamperName(){
        return this.camperName;
    }

    public String toString(){
        return this.getCamperName() + " has hydration level of " + this.hydrationLevel + " and coldness level of " + this.coldnessLevel;
    }
}
