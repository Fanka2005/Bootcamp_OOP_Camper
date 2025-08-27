package campobjects;

import actions.Action;
import actions.Menu;
import items.Bedroll;
import items.Item;
import items.OilLantern;
import items.Torch;
import java.util.List;
import java.util.ArrayList;

/**
 * <h1>Campsite class</h1>
 * This Campsite class is used to represent the campsite
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Campsite implements ActionCapable {

  /**
   * Store the camper name
   */
  private Camper camper;

  /**
   * Store the items scattered in the campsite
   */
  private List<Item> items = new ArrayList<>();

  /**
   * Campsite Constructor
   * <p>
   * Initiate all Campsite class attribute
   */
  public Campsite() {
    this.camper = new Camper("Fauzanda");
    this.items.add(new Bedroll("Kamui", 7.00));
    this.items.add(new OilLantern("Lantern1", 1.50));
    this.items.add(new Torch("Torch1", 1.00));
  }

  /**
   * Add method to add items to the campsite,
   *
   * @param item is the item object
   */
  public void add(Item item) {
    this.items.add(item);
  }

  /**
   * Remove method to remove items from the campsite
   *
   * @param item is the item object
   * @return boolean : true = the item can be removed, false = the item cannot be removed (Item is
   * not in the campsite)
   */
  public boolean remove(Item item) {
    for (int i = 0; i < this.items.size(); i++) {
      if (this.items.get(i) == item) {
        this.items.remove(i);
        return true;
      }
    }

    return false;
  }

  /**
   * Getter Method, to print all of the items in the campsite
   */
  public void listOutAllItems() {

    for (Item item : this.items) {
      System.out.println(item.toString());
    }

  }

  /**
   * Getter Method, to list the allowable action that the campsite can do
   *
   * @return a list of allowable action that the campsite can do
   */
  @Override
  public List<Action> allowableActions(Camper camper) {
    List<Action> actions = new ArrayList<>();
    for (Item item : this.items) {
      actions.add(item.getPackAction());
    }
    return actions;
  }

  /**
   * A method to simulate the campsite
   */
  public void simulate() {
    List<Action> actions = new ArrayList<>();
    actions.addAll(this.allowableActions(this.camper));
    actions.addAll(this.camper.allowableActions(this.camper));

    System.out.println("#################################################");
    System.out.println("Welcome to FIT2099 Camping Site");
    System.out.println(this.camper.toString());
    System.out.println(
        "Here are the Items that " + this.camper.getCamperName()
            + " has in the campobjects.Backpack ("
            + this.camper.getWeight() + ") :");

    this.camper.checkAllItems();

    System.out.println("Here are the items that we have on campsite:");
    this.listOutAllItems();
    System.out.println("#################################################");

    Action action = Menu.showMenu(actions, this.camper);
    System.out.println(action.execute(this.camper, this));

  }
}
