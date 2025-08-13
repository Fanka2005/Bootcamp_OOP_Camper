public class Item {
    // Attribute
    private String name;
    private double weight;

    // Constructor
    public Item(String _name, double _weight){
        this.name = _name;
        this.weight = _weight;
    }

    // Getter Method
    public String toString(){
        return this.name + " has weight of " + this.weight;
    }
    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }


}
