package campobjects;

import actions.Action;
import actions.Menu;
import items.Bedroll;
import items.Item;
import java.util.List;
import java.util.ArrayList;

public class Campsite {
    private Camper camper = new Camper("Fauzanda");
    private List<Item> items = new ArrayList<>();


    public Campsite(){
        this.items.add(new Bedroll("Kamui", 7.00));
    }

    public void add(Item _item){
        this.items.add(_item);
    }

    public boolean remove(Item _item){
        for(int i=0; i < this.items.size(); i++){
            if(this.items.get(i)==_item) {
                this.items.remove(i);
                return true;
            }
        }

        return false;
    }

    // Getter Method
    public void listOutAllItems(){

        for(Item item : this.items){
            System.out.println(item.toString());
        }

    }


    public List<Action> allowableActions(){
        List<Action> actions = new ArrayList<>();
        for(Item item: this.items){
            actions.add(item.getPackAction());
        }
        return actions;
    }

    public void simulate() {
        List<Action> actions = new ArrayList<>();
        actions.addAll(this.allowableActions());
        actions.addAll(camper.allowableActions());

        System.out.println("#################################################");
        System.out.println("Welcome to FIT2099 Camping Site");
        System.out.println(camper.toString());
        System.out.println("Here are the Items that " + camper.getCamperName() + " has in the campobjects.Backpack (" + camper.getWeight() +") :");

        camper.checkAllItems();

        System.out.println("Here are the items that we have on campsite:");
        this.listOutAllItems();
        System.out.println("#################################################");

        Action action = Menu.showMenu(actions, camper);
        System.out.println(action.execute(camper, this));

    }
}
