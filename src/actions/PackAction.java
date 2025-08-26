package actions;

import campobjects.Camper;
import campobjects.Campsite;
import items.Item;

public class PackAction extends Action{

    public PackAction(Item _item){
        super(_item);
    }

    @Override
    public String execute(Camper _camper, Campsite _campsite) {

        if(_camper.add(super.getItem())) {
            if(_campsite.remove(super.getItem())){
                return  _camper + " packed " + super.getItem().getSimpleName() + " to the backpack";
            }
            return super.getItem().getSimpleName() + " is not in campobjects.Campsite";
        }
        return super.getItem().getSimpleName() + " Cannot be packed as it will exceeds the backpack limit";
    }

    @Override
    public String menuDescription(Camper _camper) {
        return _camper + " will pack " + super.getItem().getSimpleName() + " to the backpack";
    }
}
