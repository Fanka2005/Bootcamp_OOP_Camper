package capabilities;

import campobjects.Camper;

/**
 * <h1>Restable  Interface</h1>
 * The Restable  interface is used to store the restedBy methods, which will provide the implementation
 * for the Rest Action
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public interface Restable {

  /**
   * The restedBy methods, which will provide the implementation
   * for the Rest Action
   *
   * @param camper   is the Camper object
   * @return a string that inform what happened.
   */
  public String restedBy(Camper camper);
}
