package actions;

import campobjects.Camper;
import campobjects.Campsite;
import capabilities.Explorable;

public class ExploreAction extends Action {

  /**
   * Store the explorable object
   */
  private Explorable explorable;

  /**
   * ExploreAction Constructor
   *
   * @param explorable is an explorable object
   */
  public ExploreAction(Explorable explorable) {
    this.explorable = explorable;
  }

  /**
   * Override the abstract method execute in the Action class
   *
   * @param camper   is the Camper object
   * @param campsite is the Campsite object
   * @return a string
   */
  @Override
  public String execute(Camper camper, Campsite campsite) {
    return explorable.exploredBy(camper);
  }

  /**
   * Override the abstract method menuDescription in the Action class
   *
   * @param camper is the Camper object
   * @return a string
   */
  @Override
  public String menuDescription(Camper camper) {
    return camper + " will explore " + explorable.getClass().getSimpleName();
  }

}
