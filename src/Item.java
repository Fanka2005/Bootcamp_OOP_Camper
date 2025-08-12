public class Item {
    // Attribute
    private String name;
    private float weight;

    // Constructor
    public Item(String _name, float _weight){
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
    public float getWeight(){
        return this.weight;
    }
    // Setter Method
    public void setName(String _name){
        this.name = _name;
    }
    public void setWeight(float _weight){
        this.weight = _weight;
    }


}
