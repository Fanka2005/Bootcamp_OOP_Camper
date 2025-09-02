package places;

import actions.Action;
import campobjects.Camper;
import capabilities.Explorable;
import capabilities.Restable;
import java.util.List;

public class Trail implements Explorable, Restable {


  @Override
  public String exploredBy(Camper camper) {
    int INCREASE_COLDNESS_VALUE = 3;
    int REDUCE_HYDRATION_VALUE = 3;
    camper.increaseColdnessLevel(INCREASE_COLDNESS_VALUE);
    camper.decreaseHydrationLevel(REDUCE_HYDRATION_VALUE);
    return this + " is explore by " + camper + ", it increase the coldness by "
        + INCREASE_COLDNESS_VALUE + " and reduced hydration by " + REDUCE_HYDRATION_VALUE;
  }

  @Override
  public List<Action> allowableActions(Camper camper) {
    return List.of();
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
    return this + " is rested by " + camper + ", it reduces the coldness by "
        + REDUCE_COLDNESS_VALUE + " and increase hydration level by " + INCREASE_HYDRATION_VALUE;
  }
}
