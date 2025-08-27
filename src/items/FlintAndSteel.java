package items;

/**
 * <h1>FlintAndSteel class</h1>
 * This FlintAndSteel class is used to represent a Flint and Steel item type
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class FlintAndSteel extends Item {

  /**
   * FlintAndSteel Constructor
   * <p>
   * Initiate all FlintAndSteel class attribute
   *
   * @param name   is the Bedroll brand name
   * @param weight is the bedroll weight
   */
  public FlintAndSteel(String _name, double _weight) {
    super(_name, _weight);
  }

  /**
   * Getter Method, to get the item type's name
   *
   * @return a string of the item type's name
   */
  @Override
  public String getSimpleName() {
    return "Flint and Steel";
  }

  /**
   * to return a string that contains the item type's name (Flint and Steel), the brand name, the
   * weight of the item, and additional information, such as Flint and Steel functionalities
   *
   * @return a string
   */
  @Override
  public String toString() {
    return this.getSimpleName() + " (" + super.getName() + ") " + " has weight of "
        + super.getWeight() + " - to start a fire.";
  }

}
