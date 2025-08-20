public class Bedroll extends Item{
    // Constructor
    public Bedroll(String _name, double _weight){
        super(_name, _weight);
    }

    @Override
    public String getSimpleName(){
        return "Bedroll";
    }

    @Override
    public String toString(){
        return super.getName() + " (" + this.getSimpleName() + ") " + " has weight of " + super.getWeight() + " - rest.";
    }

}
