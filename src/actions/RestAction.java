package actions;

import campobjects.Camper;
import campobjects.Campsite;
import capabilities.Restable;

/**
 * <h1>RestAction class</h1>
 * This class is used extend the abstract Action class for Resting action
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class RestAction extends Action {

  /**
   * Store the restable object
   */
  private Restable restable;

  /**
   * RestAction Constructor
   *
   * @param restable is a rest-able object
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
    return camper + " will rest in " + restable.getClass().getSimpleName();
  }

}
