import java.util.List;
import java.util.ArrayList;

public class Campsite {
    private Camper camper = new Camper("Fauzanda");
    private List<Item> items = new ArrayList<>();

    public void simulate() {
        System.out.println("Welcome to FIT2099 Camping Site");
        System.out.println(camper.toString());
        System.out.println("Here are the Items that " + camper.getCamperName() + " has in the backpack:");

        camper.checkAllItems();

        System.out.println("Glad that you enjoy your time here!");
    }
}
