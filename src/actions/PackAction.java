package actions;

import campobjects.Camper;
import campobjects.Campsite;
import items.Item;

/**
 * <h1>PackAction class</h1>
 * This class is used extend the abstract Action class for Packing the item in campsite to the
 * backpack.
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class PackAction extends Action {

  /**
   * The item object
   */
  private Item item;

  /**
   * PackAction Constructor
   *
   * @param item is the Item object
   */
  public PackAction(Item item) {
    this.item = item;
  }

  /**
   * Override the abstract method execute in the Action class
   *
   * @param camper   is the Camper object
   * @param campsite is the Campsite object
   * @return a string
   */
  @Override
  public String execute(Camper camper, Campsite campsite) {

    if (camper.add(this.getItem())) {
      if (campsite.remove(this.getItem())) {
        return camper + " packed " + this.getItem().getSimpleName() + " to the backpack";
      }
      return this.getItem().getSimpleName() + " is not in campobjects.Campsite";
    }
    return this.getItem().getSimpleName()
        + " Cannot be packed as it will exceeds the backpack limit";
  }

  /**
   * Override the abstract method menuDescription in the Action class
   *
   * @param camper is the Camper object
   * @return a string
   */
  @Override
  public String menuDescription(Camper camper) {
    return camper + " will pack " + this.getItem().getSimpleName() + " to the backpack";
  }

  /**
   * Override the abstract method getItem in the Action class
   *
   * @return an item
   */
  public Item getItem() {
    return this.item;
  }
}
