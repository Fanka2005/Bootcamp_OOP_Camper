package actions;

import campobjects.Camper;
import campobjects.Campsite;
import items.Item;

/**
 * <h1>Action class</h1>
 * The abstract class Action is used as the blue-print for its child classes.
 */
public abstract class Action {

  /**
   * The item object
   */
  private Item item;

  /**
   * Action class Constructor
   */
  public Action(Item item) {
    this.item = item;
  }

  /**
   * Getter Method, to get the item object
   *
   * @return Item
   */
  public Item getItem() {
    return this.item;
  }

  /**
   * Abstract Method for the execution of either pack or unpack action.
   *
   * @param camper   is the Camper object
   * @param campsite is the Campsite object
   * @return as string
   */
  public abstract String execute(Camper camper, Campsite campsite);

  /**
   * Abstract Method for the action description shown in the menu.
   *
   * @param camper is the Camper object
   * @return as string
   */
  public abstract String menuDescription(Camper camper);

}
