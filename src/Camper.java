public class Camper {
    private String camperName;
    private Backpack backpack = new Backpack();

    //Constructor
    public Camper(String _camperName){
        this.camperName = _camperName;
    }

    // Getter Method
    public void checkAllItems(){
        Item[] items = backpack.getItems();

        for(Item item : items){
            System.out.println(item.toString());
        }

    }

    public String getCamperName(){
        return this.camperName;
    }
}
