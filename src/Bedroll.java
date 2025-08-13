public class Bedroll extends Item{
    // Constructor
    public Bedroll(String _name, double _weight){
        super(_name, _weight);
    }

    @Override
    public String toString(){
        return super.getName() + " has weight of " + super.getWeight() + " - rest.";
    }
}
