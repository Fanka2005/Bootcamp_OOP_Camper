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
   * PackAction Constructor
   *
   * @param item is the Item object
   */
  public PackAction(Item item) {
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

    if (camper.add(super.getItem())) {
      if (campsite.remove(super.getItem())) {
        return camper + " packed " + super.getItem().getSimpleName() + " to the backpack";
      }
      return super.getItem().getSimpleName() + " is not in campobjects.Campsite";
    }
    return super.getItem().getSimpleName()
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
    return camper + " will pack " + super.getItem().getSimpleName() + " to the backpack";
  }
}
