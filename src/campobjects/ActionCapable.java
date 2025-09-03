package campobjects;

import actions.Action;
import java.util.List;

/**
 * <h1>ActionCapable Interface</h1>
 * The ActionCapable interface is used as the contract of methods that stores all of the allowable actions
 * for its child classes.
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public interface ActionCapable {

  /**
   * Method to store all of the allowable actions
   *
   * @param camper   is the Camper object
   * @return a list of allowable actions
   */
  public List<Action> allowableActions(Camper camper);
}
