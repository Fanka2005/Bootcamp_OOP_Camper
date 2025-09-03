package capabilities;

import campobjects.Camper;

/**
 * <h1>Drinkable Interface</h1>
 * The Drinkable interface is used to store the drunkBy methods, which will provide the implementation
 * for the Drink Action
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public interface Drinkable {
  /**
   * The drunkBy methods, which will provide the implementation
   * for the Drink Action
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  public String drunkBy(Camper camper);
}