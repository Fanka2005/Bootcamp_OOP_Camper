public class Backpack {
    private Item[] items = new Item[3];

    public Backpack(Bottle bottle, FlintAndSteel flintAndSteel, Bedroll bedroll){
        items[0] = bottle;
        items[1] = flintAndSteel;
        items[2] = bedroll;
    }
    // Getter Method
    public Item[] getItems(){
        return this.items;
    }
}
