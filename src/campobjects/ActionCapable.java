package campobjects;

import actions.Action;
import java.util.List;

public interface ActionCapable {

  public List<Action> allowableActions(Camper camper);
}
