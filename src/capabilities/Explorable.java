package capabilities;

import campobjects.ActionCapable;
import campobjects.Camper;

/**
 * <h1>Explorable Interface</h1>
 * The Explorable interface is used to store the exploredBy methods, which will provide the implementation
 * for the Explore Action
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public interface Explorable extends ActionCapable {
  /**
   * The exploreBy methods, which will provide the implementation
   * for the Explore Action
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  public String exploredBy(Camper camper);
}
