public class FlintAndSteel extends Item{

    // Constructor
    public FlintAndSteel(String _name, double _weight){
        super(_name, _weight);
    }

    @Override
    public String toString(){
        return super.getName() + " (" + this.getSimpleName() + ") "  + " has weight of " + super.getWeight() + " - to start a fire.";
    }

    @Override
    public String getSimpleName(){
        return "Flint and Steel";
    }
}
