package actions;

import campobjects.Camper;
import campobjects.Campsite;
import capabilities.Restable;

public class RestAction extends Action {

  /**
   * Store the restable object
   */
  private Restable restable;

  /**
   * ExploreAction Constructor
   *
   * @param restable is an explorable object
   */
  public RestAction(Restable restable) {
    this.restable = restable;
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
    return restable.restedBy(camper);
  }

  /**
   * Override the abstract method menuDescription in the Action class
   *
   * @param camper is the Camper object
   * @return a string
   */
  @Override
  public String menuDescription(Camper camper) {
    return camper + " will explore " + restable.getClass().getSimpleName();
  }

}
