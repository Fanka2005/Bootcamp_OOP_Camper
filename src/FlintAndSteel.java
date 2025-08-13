public class FlintAndSteel extends Item{

    // Constructor
    public FlintAndSteel(String _name, double _weight){
        super(_name, _weight);
    }

    @Override
    public String toString(){
        return super.getName() + " has weight of " + super.getWeight() + " - to start a fire.";
    }
}
