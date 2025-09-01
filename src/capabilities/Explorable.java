package capabilities;

import campobjects.ActionCapable;
import campobjects.Camper;

public interface Explorable extends ActionCapable {

  public String exploredBy(Camper camper);
}
