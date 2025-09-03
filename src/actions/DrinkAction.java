package actions;

import campobjects.Camper;
import campobjects.Campsite;
import capabilities.Drinkable;

/**
 * <h1>DrinkAction class</h1>
 * This class is used extend the abstract Action class for Drinking action
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class DrinkAction extends Action {

  /**
   * Store the drinkable object
   */
  private Drinkable drinkable;

  /**
   * DrinkAction Constructor
   *
   * @param drinkable is a drinkable object
   */
  public DrinkAction(Drinkable drinkable) {
    this.drinkable = drinkable;
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
    return drinkable.drunkBy(camper);
  }

  /**
   * Override the abstract method menuDescription in the Action class
   *
   * @param camper is the Camper object
   * @return a string
   */
  @Override
  public String menuDescription(Camper camper) {
    return camper + " will drink from " + drinkable.getClass().getSimpleName();
  }

}