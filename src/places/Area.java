package places;

import actions.Action;
import campobjects.Camper;
import capabilities.Explorable;
import java.util.List;

public abstract class Area implements Explorable {

  /**
   * Store the item's name
   */
  private String name;

  /**
   * Area Constructor
   * <p>
   * Initiate all of the Area class attribute
   *
   * @param name   is the item's name
   */
  public Area(String name) {
    this.name = name;
  }

  public abstract String getSimpleName();

  public String getName() {
    return name;
  }

  @Override
  public abstract String exploredBy(Camper camper);

  @Override
  public List<Action> allowableActions(Camper camper){
    return null;
  }
}
