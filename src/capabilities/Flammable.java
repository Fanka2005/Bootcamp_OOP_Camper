package capabilities;

import campobjects.Camper;

/**
 * <h1>Flammable Interface</h1>
 * The Flammable interface is used to store the ignitedBy methods, which will provide the implementation
 * for the Ignite Action
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public interface Flammable {
  /**
   * The ignitedBy methods, which will provide the implementation
   * for the Ignite Action
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  public String ignitedBy(Camper camper);

}
