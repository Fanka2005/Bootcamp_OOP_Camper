package places;

import static items.Ability.IGNITE_FIRE;

import actions.Action;
import actions.DrinkAction;
import actions.ExploreAction;
import actions.IgniteAction;
import campobjects.Camper;
import capabilities.Drinkable;
import capabilities.Flammable;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>River class</h1>
 * The class River is used to implement the parent class abstract method/fields.
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class River extends Area implements Flammable, Drinkable {

  /**
   * River Constructor
   * <p>
   * Initiate all of the River class attribute
   *
   * @param name   is the place's name
   */
  public River(String name) {
    super(name);
  }

  /**
   * Getter Method, to get the River name
   *
   * @return a string of the River name
   */
  @Override
  public String getSimpleName() {
    return "River";
  }

  /**
   * The exploreBy methods, which will provide the implementation
   * for the Explore Action :    INCREASE CAMPER COLDNESS LEVEL by 2 and
   * REDUCE CAMPER HYDRATION LEVEL by 4;
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  @Override
  public String exploredBy(Camper camper) {
    int INCREASE_COLDNESS_VALUE = 2;
    int REDUCE_HYDRATION_VALUE = 4;
    camper.increaseColdnessLevel(INCREASE_COLDNESS_VALUE);
    camper.decreaseHydrationLevel(REDUCE_HYDRATION_VALUE);
    return super.getName() + " is explore by " + camper + ", it increase the coldness by "
        + INCREASE_COLDNESS_VALUE + " and reduced hydration by " + REDUCE_HYDRATION_VALUE;
  }

  /**
   * The drunkBy methods, which will provide the implementation
   * for the Drink Action : INCREASE CAMPER HYDRATION LEVEL by 2
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  @Override
  public String drunkBy(Camper camper) {
    int INCREASE_HYDRATION_VALUE = 2;
    camper.increaseHydrationLevel(INCREASE_HYDRATION_VALUE);
    return super.getName() + " is drunk by " + camper + ", it increase hydration level by " + INCREASE_HYDRATION_VALUE ;
  }

  /**
   * Getter Method, to list the allowable action that River can do
   *
   * @return a list of allowable action that River can do
   */
  @Override
  public List<Action> allowableActions(Camper camper) {
    List<Action> actions = new ArrayList<>();
    actions.add(new ExploreAction(this));
    if (camper.hasCapability(IGNITE_FIRE)) {
      actions.add(new IgniteAction(this));
    }
    actions.add(new DrinkAction(this));
    return actions;

  }

  /**
   * The ignitedBy methods, which will provide the implementation
   * for the Ignite Action: REDUCE CAMPER COLDNESS LEVEL by 3 and
   *  INCREASE CAMPER HYDRATION LEVEL by 5;
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  @Override
  public String ignitedBy(Camper camper) {
    String explored = this.exploredBy(camper);
    int REDUCE_COLDNESS_VALUE = 3;
    int INCREASE_HYDRATION_VALUE = 5;
    camper.decreaseColdnessLevel(REDUCE_COLDNESS_VALUE);
    camper.increaseHydrationLevel(INCREASE_HYDRATION_VALUE);
    return explored + " and " + super.getName() + " is ignited by " + camper + ", it reduces the coldness by "
        + REDUCE_COLDNESS_VALUE + " and increase hydration level by " + INCREASE_HYDRATION_VALUE;
  }
}
