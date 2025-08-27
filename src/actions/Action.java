package actions;

import campobjects.Camper;
import campobjects.Campsite;

/**
 * <h1>Action class</h1>
 * The abstract class Action is used as the blue-print for its child classes.
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public abstract class Action {

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
