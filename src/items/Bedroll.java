package items;

/**
 * <h1>Bedroll class</h1>
 * This Bedroll class is used to represent a Bedroll item type
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Bedroll extends Item {

  /**
   * Bedroll Constructor
   * <p>
   * Initiate all Bedroll class attribute
   *
   * @param name   is the Bedroll brand name
   * @param weight is the bedroll weight
   */
  public Bedroll(String name, double weight) {
    super(name, weight);
  }

  /**
   * Getter Method, to get the item type's name
   *
   * @return a string of the item type's name
   */
  @Override
  public String getSimpleName() {
    return "Bedroll";
  }

  /**
   * to return a string that contains the item type's name (Bedroll), the brand name, the weight of
   * the item, and additional information, such as Bedroll functionalities
   *
   * @return a string
   */
  @Override
  public String toString() {
    return this.getSimpleName() + " (" + super.getName() + ") " + " has weight of "
        + super.getWeight() + " - rest.";
  }

}
