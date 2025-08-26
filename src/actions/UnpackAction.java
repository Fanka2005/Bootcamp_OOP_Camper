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
   * UnpackAction Constructor
   * @param item is the Item object
   */
  public UnpackAction(Item item) {
    super(item);
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

    if (camper.remove(super.getItem())) {
      campsite.add(super.getItem());
      return camper + " unpacked " + super.getItem().getSimpleName() + " to the camp site";
    }

    return camper + " unpacked " + super.getItem().getSimpleName()
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
    return camper + " will unpack " + super.getItem().getSimpleName() + " to the campsite";
  }
}
