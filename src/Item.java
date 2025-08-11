public class Item {
    // Attribute
    private String name;
    private float weight;

    // Constructor
    public Item(String name, float weight){
        this.name = name;
        this.weight = weight;
    }

    // Method
    public String toString(){
        return this.name + " has weight of " + this.weight;
    }
}
