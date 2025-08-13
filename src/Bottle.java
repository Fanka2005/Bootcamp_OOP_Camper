public class Bottle extends Item{
    private double capacity;

    // Constructor
    public Bottle(String _name, double _weight, double _capacity){
        super(_name, _weight);
        this.capacity = _capacity;
    }


    // Getter Method
    @Override
    public String toString(){
        return super.getName() + " has weight of " + super.getWeight() + " - to drink with " + this.capacity + " litre left.";
    }

}
