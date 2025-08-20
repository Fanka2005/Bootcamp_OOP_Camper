import java.util.List;
import java.util.ArrayList;

public class Campsite {
    private Camper camper = new Camper("Fauzanda");
    private List<Item> items = new ArrayList<>();

    public boolean add(Item _item){
        this.items.add(_item);
        return true;
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

    public List<Action> allowableActions(){
        List<Action> actions = new ArrayList<>();
        for(Item item: this.items){
            actions.add(item.getPackAction());
        }
        return actions;
    }

    public void simulate() {
        System.out.println("Welcome to FIT2099 Camping Site");
        System.out.println(camper.toString());
        System.out.println("Here are the Items that " + camper.getCamperName() + " has in the backpack:");

        camper.checkAllItems();

        System.out.println("Glad that you enjoy your time here!");
    }
}
