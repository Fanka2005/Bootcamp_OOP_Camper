package campobjects;

import actions.Action;
import actions.Menu;
import items.Bedroll;
import items.Item;
import java.util.List;
import java.util.ArrayList;

/**
 * <h1>Campsite class</h1>
 * This Campsite class is used to represent the campsite
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Campsite {

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
   *
   * Initiate all Campsite class attribute
   */
  public Campsite() {
    this.camper = new Camper("Fauzanda");
    this.items.add(new Bedroll("Kamui", 7.00));
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
  public List<Action> allowableActions() {
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
    actions.addAll(this.allowableActions());
    actions.addAll(camper.allowableActions());

    System.out.println("#################################################");
    System.out.println("Welcome to FIT2099 Camping Site");
    System.out.println(camper.toString());
    System.out.println(
        "Here are the Items that " + camper.getCamperName() + " has in the campobjects.Backpack ("
            + camper.getWeight() + ") :");

    camper.checkAllItems();

    System.out.println("Here are the items that we have on campsite:");
    this.listOutAllItems();
    System.out.println("#################################################");

    Action action = Menu.showMenu(actions, camper);
    System.out.println(action.execute(camper, this));

  }
}
