package actions;

import campobjects.Camper;
import campobjects.Campsite;
import items.Item;

public abstract class Action {
    private Item item;

    public Action(Item _item){
        this.item = _item;
    }

    public Item getItem(){
        return this.item;
    }

    public abstract String execute(Camper _camper, Campsite _campsite);

    public abstract String menuDescription(Camper _camper);

}
