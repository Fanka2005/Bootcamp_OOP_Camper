package items;

import actions.Action;
import actions.PackAction;
import actions.UnpackAction;

public abstract class Item {
    // Attribute
    private String name;
    private double weight;

    // Constructor
    public Item(String _name, double _weight){
        this.name = _name;
        this.weight = _weight;
    }

    // Getter Method
    public abstract String toString();
    public String getName(){
        return this.name;
    }
    public double getWeight(){
        return this.weight;
    }

    // Abstract Method
    public abstract String getSimpleName();

    public Action getPackAction(){return new PackAction(this);}

    public Action getUnpackAction(){return new UnpackAction(this);}

}
