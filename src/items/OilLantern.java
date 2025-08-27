package items;

/**
 * <h1>Oil Lantern class</h1>
 * This Oil Lantern class is used to represent a Oil Lantern item type
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class OilLantern extends Item {

  /**
   * Oil Lantern Constructor
   * <p>
   * Initiate all Oil Lantern class attribute
   *
   * @param name   is the Oil Lantern brand name
   * @param weight is the Oil Lantern weight
   */
  public OilLantern(String name, double weight) {
    super(name, weight);
  }

  /**
   * Getter Method, to get the item type's name
   *
   * @return a string of the item type's name
   */
  @Override
  public String getSimpleName() {
    return "Oil Lantern";
  }

  /**
   * to return a string that contains the item type's name (Oil Lantern), the brand name, the weight
   * of the item, and additional information, such as Oil Lantern functionalities
   *
   * @return a string
   */
  @Override
  public String toString() {
    return this.getSimpleName() + " (" + super.getName() + ") " + " has weight of "
        + super.getWeight() + " - lighting.";
  }

}