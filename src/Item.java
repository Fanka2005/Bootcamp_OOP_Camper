public class Item {
    // Attribute
    private String name;
    private float weight;

    // Constructor
    public Item(String name, float weight){
        this.name = name;
        this.weight = weight;
    }

    // Getter Method
    public String toString(){
        return this.name + " has weight of " + this.weight;
    }

    // Setter Method
    public void setName(String name){
        this.name = name;
    }

    //
    public void setWeight(float weight){
        this.weight = weight;
    }


}
