package items;

/**
 * <h1>Torch class</h1>
 * This Torch class is used to represent a Torch item type
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Torch extends Item {

  /**
   * Torch Constructor
   * <p>
   * Initiate all Torch class attribute
   *
   * @param name   is the Torch brand name
   * @param weight is the Torch weight
   */
  public Torch(String name, double weight) {
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
   * to return a string that contains the item type's name (Torch), the brand name, the weight of
   * the item, and additional information, such as Torch functionalities
   *
   * @return a string
   */
  @Override
  public String toString() {
    return this.getSimpleName() + " (" + super.getName() + ") " + " has weight of "
        + super.getWeight() + " - Lighting.";
  }

}
