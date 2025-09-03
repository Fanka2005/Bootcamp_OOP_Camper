package places;

import static items.Ability.RESTING;
import actions.Action;
import actions.ExploreAction;
import actions.RestAction;
import campobjects.Camper;
import capabilities.Restable;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Trail class</h1>
 * The class Trail is used to implement the parent class abstract method/fields.
 *
 * @author Fauzanda Lathifanka Sunarko
 */
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
   * Getter Method, to get the Trail name
   *
   * @return a string of the Trail name
   */
  @Override
  public String getSimpleName() {
    return "Trail";
  }

  /**
   * The exploreBy methods, which will provide the implementation
   * for the Explore Action :    INCREASE CAMPER COLDNESS LEVEL by 3 and
   * REDUCE CAMPER HYDRATION LEVEL by 3;
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
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
   * The restedBy methods, which will provide the implementation
   * for the Rest Action : REDUCE CAMPER COLDNESS LEVEL by 4 and
   *  INCREASE CAMPER HYDRATION LEVEL by 1;
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  @Override
  public String restedBy(Camper camper) {
    String explored = this.exploredBy(camper);
    int REDUCE_COLDNESS_VALUE = 4;
    int INCREASE_HYDRATION_VALUE = 1;
    camper.decreaseColdnessLevel(REDUCE_COLDNESS_VALUE);
    camper.increaseHydrationLevel(INCREASE_HYDRATION_VALUE);
    return explored + " and " + super.getName() + " is rested by " + camper + ", it reduces the coldness by "
        + REDUCE_COLDNESS_VALUE + " and increase hydration level by " + INCREASE_HYDRATION_VALUE;
  }
}
