package places;

import actions.Action;
import campobjects.Camper;
import capabilities.Explorable;
import capabilities.Flammable;
import java.util.List;

public class River implements Explorable, Flammable {

  @Override
  public String exploredBy(Camper camper) {
    int INCREASE_COLDNESS_VALUE = 2;
    int REDUCE_HYDRATION_VALUE = 4;
    camper.increaseColdnessLevel(INCREASE_COLDNESS_VALUE);
    camper.decreaseHydrationLevel(REDUCE_HYDRATION_VALUE);
    return this + " is explore by " + camper + ", it increase the coldness by "
        + INCREASE_COLDNESS_VALUE + " and reduced hydration by " + REDUCE_HYDRATION_VALUE;
  }

  @Override
  public List<Action> allowableActions(Camper camper) {
    return List.of();
  }

  @Override
  public String ignitedBy(Camper camper) {
    int REDUCE_COLDNESS_VALUE = 3;
    int INCREASE_HYDRATION_VALUE = 5;
    camper.decreaseColdnessLevel(REDUCE_COLDNESS_VALUE);
    camper.increaseHydrationLevel(INCREASE_HYDRATION_VALUE);
    return this + " is ignited by " + camper + ", it reduces the coldness by "
        + REDUCE_COLDNESS_VALUE + " and increase hydration level by " + INCREASE_HYDRATION_VALUE;
  }
}
