package places;

import actions.Action;
import actions.DrinkAction;
import actions.ExploreAction;
import campobjects.Camper;
import capabilities.Drinkable;
import capabilities.Explorable;
import java.util.ArrayList;
import java.util.List;


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
   * Getter Method, to get the item type's name
   *
   * @return a string of the item type's name
   */
  @Override
  public String getSimpleName() {
    return "Mountain Spring";
  }

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
   * @param camper is the camper object
   * @return a string
   */
  @Override
  public String drunkBy(Camper camper) {
    String explored = this.exploredBy(camper);
    int INCREASE_HYDRATION_VALUE = 3;
    camper.increaseHydrationLevel(INCREASE_HYDRATION_VALUE);
    return explored + " and " + super.getName() + " is drunk by " + camper + ", it increase hydration level by " + INCREASE_HYDRATION_VALUE ;
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
