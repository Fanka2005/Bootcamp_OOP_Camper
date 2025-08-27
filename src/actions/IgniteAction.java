package actions;

import campobjects.Camper;
import campobjects.Campsite;
import items.Flammable;

/**
 * <h1>IgniteAction class</h1>
 * This class is used extend the abstract Action class for igniting an item object
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class IgniteAction extends Action {

  /**
   * Store the flammable object
   */
  private Flammable flammable;

  /**
   * IgniteAction Constructor
   *
   * @param flammable is flammable object
   */
  public IgniteAction(Flammable flammable) {
    this.flammable = flammable;
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
    return flammable.ignitedBy(camper);
  }

  /**
   * Override the abstract method menuDescription in the Action class
   *
   * @param camper is the Camper object
   * @return a string
   */
  @Override
  public String menuDescription(Camper camper) {
    return camper + " will ignite " + flammable.getClass().getSimpleName();
  }


}
