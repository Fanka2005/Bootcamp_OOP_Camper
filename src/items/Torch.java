package items;

import static items.Ability.IGNITE_FIRE;

import actions.Action;
import actions.IgniteAction;
import campobjects.Camper;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Torch class</h1>
 * This Torch class is used to represent a Torch item type
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Torch extends Item implements Flammable {

  /**
   * Torch Constructor
   * <p>
   * Initiate all Torch class attribute
   *
   * @param name   is the Torch brand name
   * @param weight is the Torch weight
   */
  public Torch(String name, double weight) {
    super(name, weight);
  }

  /**
   * Getter Method, to get the item type's name
   *
   * @return a string of the item type's name
   */
  @Override
  public String getSimpleName() {
    return "Torch";
  }

  /**
   * to return a string that contains the item type's name (Torch), the brand name, the weight of
   * the item, and additional information, such as Torch functionalities
   *
   * @return a string
   */
  @Override
  public String toString() {
    return this.getSimpleName() + " (" + super.getName() + ") " + " has weight of "
        + super.getWeight() + " - Lighting.";
  }

  /**
   * to return a string that shows that the Oil Lantern is Ignited by the certain camper this method
   * is used to know who ignited the oil lantern
   *
   * @return a string
   */
  @Override
  public String ignitedBy(Camper camper) {
    int REDUCE_COLDNESS_VALUE = 1;
    camper.decreaseColdnessLevel(REDUCE_COLDNESS_VALUE);
    return this + " is ignited by " + camper + " and it reduces the coldness by "
        + REDUCE_COLDNESS_VALUE;
  }

  /**
   * Getter Method, to list the allowable action that Torch can do
   *
   * @return a list of allowable action that Torch can do
   */
  @Override
  public List<Action> allowableActions(Camper camper) {
    List<Action> actions = new ArrayList<>();
    if (camper.hasCapability(IGNITE_FIRE)) {
      actions.add(new IgniteAction(this));
    }
    return actions;
  }
}
