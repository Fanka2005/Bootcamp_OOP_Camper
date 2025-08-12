public class Backpack {
    private Bottle bottle = new Bottle("Bottle", 1.00, 1.0);
    private FlintAndSteel flintAndSteel = new FlintAndSteel("Flint and Steel", 0.50);
    private Bedroll bedroll = new Bedroll("Bedroll", 7.00);
    private Item[] items = {this.bedroll, this.bottle, this.flintAndSteel};

    // Getter Method
    public Item[] getItems(){
        return this.items;
    }
}
