package campobjects;

import actions.Action;
import items.Bedroll;
import items.Bottle;
import items.FlintAndSteel;
import items.Item;
import items.OilLantern;
import items.Torch;
import java.util.List;
import java.util.ArrayList;

/**
 * <h1>Backpack class</h1>
 * This Backpack class is used to represent a Backpack.
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Backpack implements ActionCapable {

  /**
   * Store the list of item objects that is in the backpack
   */
  private List<Item> items = new ArrayList<>();

  /**
   * Store the weight limit of the backpack
   */
  private double weightLimit;

  /**
   * dynamically stores the current total weight of the backpack
   */
  private double totalWeight;

  /**
   * Backpack Constructor
   * <p>
   * Initiate all the backpack class attribute
   *
   * @param bottle        is a bottle
   * @param flintAndSteel is a flintAndSteel
   * @param bedroll       is a bedroll
   * @param weightLimit   is the backpack weight limit
   */
  public Backpack(Bottle bottle, FlintAndSteel flintAndSteel, Bedroll bedroll, double weightLimit) {
    this.items.add(bottle);
    this.items.add(flintAndSteel);
    this.items.add(bedroll);
    this.items.add(new OilLantern("Lantern1", 1.50));
    this.items.add(new Torch("Torch1", 1.00));
    this.totalWeight = bedroll.getWeight() + bottle.getWeight() + flintAndSteel.getWeight();
    this.weightLimit = weightLimit;
  }

  /**
   * Add method to add items to the backpack, but will check whether item added will make the back
   * pack overweight or not.
   *
   * @param item is the item object
   * @return boolean : true = the item can be added, false = the item cannot be added (exceed the
   * weight limit)
   */
  public boolean add(Item item) {
    double estimatedWeight = item.getWeight() + this.totalWeight;

    if (estimatedWeight > this.weightLimit) {
      return false;
    }

    this.items.add(item);
    this.totalWeight += item.getWeight();

    return true;
  }

  /**
   * Remove method to remove items from the backpack
   *
   * @param item is the item object
   * @return boolean : true = the item can be removed, false = the item cannot be removed
   */
  public boolean remove(Item item) {
    for (int i = 0; i < this.items.size(); i++) {
      if (this.items.get(i) == item) {
        this.items.remove(i);
        this.totalWeight -= item.getWeight();
        return true;
      }
    }

    return false;
  }


  /**
   * allowableActions method list all of the allowable action that the backpack can do.
   *
   * @return actions,  list all of the allowable action that the backpack can do.
   */
  @Override
  public List<Action> allowableActions(Camper camper) {
    List<Action> actions = new ArrayList<>();
    for (Item item : this.items) {
      actions.add(item.getUnpackAction());
      if (!(item.allowableActions(camper) == null)) {
        actions.addAll(item.allowableActions(camper));
      }
    }

    return actions;
  }


  /**
   * Getter Method, to get the list of item object in the back pack
   *
   * @return list of items in the back pack
   */
  public List<Item> getItems() {
    return this.items;
  }

  /**
   * Getter Method, to get the current weight of the backpack
   *
   * @return the string of the current weight out of the total weight limit
   */
  public String getWeight() {
    return this.totalWeight + "/" + this.weightLimit;
  }

  /**
   * Getter Method, to get the current list of items in the backpack, by using defensive copy.
   *
   * @return List of items in the backpack
   */
  public List<Item> getAllItems() {
    List<Item> itemsCopy;
    itemsCopy = this.items;
    return itemsCopy;
  }
}
