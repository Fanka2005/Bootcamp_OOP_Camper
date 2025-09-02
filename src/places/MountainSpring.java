package places;

import actions.Action;
import campobjects.Camper;
import capabilities.Explorable;
import java.util.List;

public class MountainSpring implements Explorable {

  @Override
  public String exploredBy(Camper camper) {
    int INCREASE_COLDNESS_VALUE = 2;
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

}
