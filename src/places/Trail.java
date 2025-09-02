package places;

import static items.Ability.RESTING;
import actions.Action;
import actions.ExploreAction;
import actions.RestAction;
import campobjects.Camper;
import capabilities.Restable;
import java.util.ArrayList;
import java.util.List;

public class Trail extends Area implements Restable {

  /**
   * Trail Constructor
   * <p>
   * Initiate all of the Trail class attribute
   *
   * @param name   is the place's name
   */
  public Trail(String name) {
     super(name);
  }

  /**
   * Getter Method, to get the item type's name
   *
   * @return a string of the item type's name
   */
  @Override
  public String getSimpleName() {
    return "Trail";
  }

  @Override
  public String exploredBy(Camper camper) {
    int INCREASE_COLDNESS_VALUE = 3;
    int REDUCE_HYDRATION_VALUE = 3;
    camper.increaseColdnessLevel(INCREASE_COLDNESS_VALUE);
    camper.decreaseHydrationLevel(REDUCE_HYDRATION_VALUE);
    return super.getName() + " is explore by " + camper + ", it increase the coldness by "
        + INCREASE_COLDNESS_VALUE + " and reduced hydration by " + REDUCE_HYDRATION_VALUE;
  }

  /**
   * Getter Method, to list the allowable action that Trail can do
   *
   * @return a list of allowable action that Trail can do
   */
  @Override
  public List<Action> allowableActions(Camper camper) {
    List<Action> actions = new ArrayList<>();
    actions.add(new ExploreAction(this));
    if (camper.hasCapability(RESTING)) {
      actions.add(new RestAction(this));
    }
    return actions;
  }

  /**
   * @param camper is the camer
   * @return a string
   */
  @Override
  public String restedBy(Camper camper) {
    int REDUCE_COLDNESS_VALUE = 4;
    int INCREASE_HYDRATION_VALUE = 1;
    camper.decreaseColdnessLevel(REDUCE_COLDNESS_VALUE);
    camper.increaseHydrationLevel(INCREASE_HYDRATION_VALUE);
    return super.getName() + " is rested by " + camper + ", it reduces the coldness by "
        + REDUCE_COLDNESS_VALUE + " and increase hydration level by " + INCREASE_HYDRATION_VALUE;
  }
}
