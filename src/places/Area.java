package places;

import actions.Action;
import campobjects.Camper;
import capabilities.Explorable;
import java.util.List;

/**
 * <h1>Area abstract class</h1>
 * The abstract class Area is used as the blue-print for its child classes (the specific area).
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public abstract class Area implements Explorable {

  /**
   * Store the area's name
   */
  private String name;

  /**
   * Area Constructor
   * <p>
   * Initiate all of the Area class attribute
   *
   * @param name   is the area's name
   */
  public Area(String name) {
    this.name = name;
  }

  /**
   * Getter abstract Method, to get the area's name
   *
   * @return a string of the area's name
   */
  public abstract String getSimpleName();

  public String getName() {
    return name;
  }

  /**
   * The exploreBy methods, which will provide the implementation
   * for the Explore Action
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  @Override
  public abstract String exploredBy(Camper camper);

  /**
   * Getter Method, to list the allowable action that an area can do
   *
   * @return a list of allowable action that an area can do
   */
  @Override
  public List<Action> allowableActions(Camper camper){
    return null;
  }
}
