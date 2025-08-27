package items;

import static items.Ability.IGNITE_FIRE;

import actions.Action;
import actions.IgniteAction;
import campobjects.ActionCapable;
import campobjects.Camper;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Oil Lantern class</h1>
 * This Oil Lantern class is used to represent a Oil Lantern item type
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class OilLantern extends Item implements Flammable, ActionCapable {

  /**
   * Store the list of Action that Oil Lantern can do
   */
  private List<Action> actions = new ArrayList<>();

  /**
   * Oil Lantern Constructor
   * <p>
   * Initiate all Oil Lantern class attribute
   *
   * @param name   is the Oil Lantern brand name
   * @param weight is the Oil Lantern weight
   */
  public OilLantern(String name, double weight) {
    super(name, weight);
  }

  /**
   * Getter Method, to get the item type's name
   *
   * @return a string of the item type's name
   */
  @Override
  public String getSimpleName() {
    return "Oil Lantern";
  }

  /**
   * to return a string that contains the item type's name (Oil Lantern), the brand name, the weight
   * of the item, and additional information, such as Oil Lantern functionalities
   *
   * @return a string
   */
  @Override
  public String toString() {
    return this.getSimpleName() + " (" + super.getName() + ") " + " has weight of "
        + super.getWeight() + " - lighting.";
  }

  /**
   * to return a string that shows that the Oil Lantern is Ignited by the certain camper this method
   * is used to know who ignited the oil lantern
   *
   * @return a string
   */
  @Override
  public String ignitedBy(Camper camper) {
    int REDUCE_COLDNESS_VALUE = 2;
    camper.decreaseColdnessLevel(REDUCE_COLDNESS_VALUE);
    return this + " is ignited by " + camper + " and it reduces the coldness by "
        + REDUCE_COLDNESS_VALUE;
  }

  /**
   * Getter Method, to list the allowable action that Oil Lantern can do
   *
   * @return a list of allowable action that Oil Lantern can do
   */
  @Override
  public List<Action> allowableActions(Camper camper) {

    if (camper.hasCapability(IGNITE_FIRE)) {
      this.actions.add(new IgniteAction(this));
    }
    return actions;
  }

}