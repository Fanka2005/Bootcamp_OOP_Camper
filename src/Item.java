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
    // Setter Method
    public void setName(String _name){
        this.name = _name;
    }
    public void setWeight(double _weight){
        this.weight = _weight;
    }


}
