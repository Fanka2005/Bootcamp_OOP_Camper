public class Bottle extends Item{
    private float capacity;

    public Bottle(String _name, float _weight, float _capacity){
        super(_name, _weight);
        this.capacity = _capacity;
    }


    // Getter Method
    @Override
    public String toString(){
        return super.getName() + " has weight of " + super.getWeight() + " and a capacity of " + this.capacity;
    }

    public float getCapacity(){
        return this.capacity;
    }

    // Setter Method
    public void setCapacity(float _capacity){
        this.capacity = _capacity;
    }
}
