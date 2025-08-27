package campobjects;

import actions.Action;
import items.Bedroll;
import items.Bottle;
import items.FlintAndSteel;
import items.Item;
import java.util.List;

/**
 * <h1>Camper class</h1>
 * This camper class is used to represent the camper
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Camper {

  /**
   * Store the camper name
   */
  private String camperName;

  /**
   * Store the camper backpack
   */
  private Backpack backpack;

  /**
   * Store the camper's hydration level
   */
  private int hydrationLevel;

  /**
   * Store the camper's coldness level
   */
  private int coldnessLevel;

  /**
   * Camper Constructor
   * <p>
   * Initiate all camper class attribute
   *
   * @param camperName is the camper name
   */
  public Camper(String camperName) {
    this.camperName = camperName;
    this.backpack = new Backpack(new Bottle("items.Bottle", 1.00, 1.0),
        new FlintAndSteel("Flint and Steel", 0.50), new Bedroll("items.Bedroll", 7.00), 10.0);
    this.hydrationLevel = 20;
    this.coldnessLevel = 20;
  }

  /**
   * checkAllItems Method, to print all of the items in the camper's backpack
   */
  public void checkAllItems() {
    List<Item> items = this.backpack.getItems();

    for (Item item : items) {
      System.out.println(item.toString());
    }

  }

  /**
   * Getter Method, to get the camper's name
   *
   * @return a string of the camper's name
   */
  public String getCamperName() {
    return this.camperName;
  }

  /**
   * toString Method, to output a string that contains the camper's name, hydration level, and
   * coldness level
   *
   * @return a string that contains the camper's name, hydration level, and coldness level
   */
  public String toString() {
    return this.getCamperName() + " has hydration level of " + this.hydrationLevel
        + " and coldness level of " + this.coldnessLevel;
  }

  /**
   * Getter Method, to get the camper's backpack weight
   *
   * @return a string of the camper's backpack weight out of the weight limit of the backpack
   */
  public String getWeight() {
    return this.backpack.getWeight();
  }

  /**
   * Getter Method, to list the allowable action that the camper's can do
   *
   * @return a list of allowable action that the camper's can do
   */
  public List<Action> allowableActions() {

    return this.backpack.allowableActions();
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
    return backpack.add(item);
  }

  /**
   * Remove method to remove items from the backpack
   *
   * @param item is the item object
   * @return boolean : true = the item can be removed, false = the item cannot be removed
   */
  public boolean remove(Item item) {
    return backpack.remove(item);
  }

}
