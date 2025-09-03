package places;

import actions.Action;
import actions.DrinkAction;
import actions.ExploreAction;
import campobjects.Camper;
import capabilities.Drinkable;
import capabilities.Explorable;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>MountainSpring class</h1>
 * The class MountainSpring is used to implement the parent class abstract method/fields.
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class MountainSpring extends Area implements Explorable, Drinkable {

  /**
   * MountainSpring Constructor
   * <p>
   * Initiate all of the MountainSpring class attribute
   *
   * @param name   is the place's name
   */
  public MountainSpring(String name) {
    super(name);
  }

  /**
   * Getter Method, to get the Mountain Spring name
   *
   * @return a string of the Mountain Spring name
   */
  @Override
  public String getSimpleName() {
    return "Mountain Spring";
  }

  /**
   * The exploreBy methods, which will provide the implementation
   * for the Explore Action :    INCREASE CAMPER COLDNESS LEVEL by 2 and
   * REDUCE CAMPER HYDRATION LEVEL by 3;
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  @Override
  public String exploredBy(Camper camper) {
    int INCREASE_COLDNESS_VALUE = 2;
    int REDUCE_HYDRATION_VALUE = 3;
    camper.increaseColdnessLevel(INCREASE_COLDNESS_VALUE);
    camper.decreaseHydrationLevel(REDUCE_HYDRATION_VALUE);
    return super.getName() + " is explore by " + camper + ", it increase the coldness by "
        + INCREASE_COLDNESS_VALUE + " and reduced hydration by " + REDUCE_HYDRATION_VALUE;
  }

  /**
   * The drunkBy methods, which will provide the implementation
   * for the Drink Action : INCREASE CAMPER HYDRATION LEVEL by 3
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  @Override
  public String drunkBy(Camper camper) {
    int INCREASE_HYDRATION_VALUE = 3;
    camper.increaseHydrationLevel(INCREASE_HYDRATION_VALUE);
    return super.getName() + " is drunk by " + camper + ", it increase hydration level by " + INCREASE_HYDRATION_VALUE ;
  }

  /**
   * Getter Method, to list the allowable action that Mountain Spring can do
   *
   * @return a list of allowable action that Mountain Spring can do
   */
  @Override
  public List<Action> allowableActions(Camper camper) {
    List<Action> actions = new ArrayList<>();
    actions.add(new ExploreAction(this));
    actions.add(new DrinkAction(this));
    return actions;
  }

}
