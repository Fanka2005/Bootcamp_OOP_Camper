package campobjects;

import actions.Action;
import items.Bedroll;
import items.Bottle;
import items.FlintAndSteel;
import items.Item;
import java.util.List;
import java.util.ArrayList;

public class Backpack {
    private List<Item> items = new ArrayList<>();
    private double weightLimit;
    private double totalWeight;

    public Backpack(Bottle _bottle, FlintAndSteel _flintAndSteel, Bedroll _bedroll, double _weightLimit){
        this.items.add(_bottle);
        this.items.add(_flintAndSteel);
        this.items.add(_bedroll);
        this.totalWeight = _bedroll.getWeight() + _bottle.getWeight() + _flintAndSteel.getWeight();
        this.weightLimit = _weightLimit;
    }

    public boolean add(Item _item){
        double estimatedWeight = _item.getWeight() + this.totalWeight;

        if(estimatedWeight > this.weightLimit){
            return false;
        }

        this.items.add(_item);
        this.totalWeight += _item.getWeight();

        return true;
    }

    public boolean remove(Item _item){
        for(int i=0; i < this.items.size(); i++){
            if(this.items.get(i)==_item) {
                this.items.remove(i);
                this.totalWeight -= _item.getWeight();
                return true;
            }
        }

        return false;
    }

    public List<Action> allowableActions(){
        List<Action> actions = new ArrayList<>();
        for(Item item: this.items){
            actions.add(item.getUnpackAction());
        }
        return actions;
    }


    // Getter Method
    public List<Item> getItems(){
        return this.items;
    }

    public String getWeight(){
        return this.totalWeight + "/" + this.weightLimit;
    }
}
