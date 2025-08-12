public class Backpack {
    private Item[] items = {new Bottle("Bottle", 1.00, 1.0), new FlintAndSteel("Flint and Steel", 0.50), new Bedroll("Bedroll", 7.00)};

    // Getter Method
    public Item[] getItems(){
        return this.items;
    }
}
