package actions;

import campobjects.Camper;
import campobjects.Campsite;
import items.Item;

/**
 * <h1>UnpackAction class</h1>
 * This class is used extend the abstract Action class for Unpacking the item in backpack to the
 * campsite.
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class UnpackAction extends Action {

  /**
   * The item object
   */
  private Item item;

  /**
   * UnpackAction Constructor
   *
   * @param item is the Item object
   */
  public UnpackAction(Item item) {
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

    if (camper.remove(this.getItem())) {
      campsite.add(this.getItem());
      return camper + " unpacked " + this.getItem().getSimpleName() + " to the camp site";
    }

    return camper + " unpacked " + this.getItem().getSimpleName()
        + " to the camp site because the item is not in the backpack";
  }

  /**
   * Override the abstract method menuDescription in the Action class
   *
   * @param camper is the Camper object
   * @return a string
   */
  @Override
  public String menuDescription(Camper camper) {
    return camper + " will unpack " + this.getItem().getSimpleName() + " to the campsite";
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
