package items;

import actions.Action;
import actions.PackAction;
import actions.UnpackAction;
import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Item class</h1>
 * The abstract class Item is used as the blue-print for its child classes (the specific item).
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public abstract class Item {

  /**
   * Store the item's name
   */
  private String name;

  /**
   * Store the item's weight
   */
  private double weight;

  private Set<Enum<Ability>> statuses;
  /**
   * Backpack Constructor
   * <p>
   * Initiate all of the Item class attribute
   *
   * @param name   is the item's name
   * @param weight is the item's weight
   */
  public Item(String name, double weight) {
    this.statuses = new HashSet<Enum<Ability>>();
    this.name = name;
    this.weight = weight;
  }

  /**
   * toString abstract Method, to output a string with certain information
   *
   * @return a string
   */
  public abstract String toString();

  protected void addCapability(Enum<Ability> capability){ this.statuses.add(capability);}
  protected void removeCapability(Enum<Ability> capability){ this.statuses.remove(capability);}
  public boolean hasCapability(Enum<Ability> capability){ this.statuses.contains(capability);}
  /**
   * Getter Method, to get the item's brand name
   *
   * @return a string of the item's brand name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Getter Method, to get the item's weight
   *
   * @return a double, that is the item's weight
   */
  public double getWeight() {
    return this.weight;
  }

  /**
   * Getter abstract Method, to get the item type's name
   *
   * @return a string of the item type's name
   */
  public abstract String getSimpleName();

  /**
   * Getter Method, to get the item's PackAction
   *
   * @return a Pack Action
   */
  public Action getPackAction() {
    return new PackAction(this);
  }

  /**
   * Getter Method, to get the item's Unpack Action
   *
   * @return an Unpack Action
   */
  public Action getUnpackAction() {
    return new UnpackAction(this);
  }

}
