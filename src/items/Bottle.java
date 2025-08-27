package items;

/**
 * <h1>Bottle class</h1>
 * This Bottle class is used to represent a Bottle item type
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Bottle extends Item {

  /**
   * Store the Bottle capacity
   */
  private double capacity;

  /**
   * Bottle Constructor
   * <p>
   * Initiate all Bottle class attribute
   *
   * @param name     is the Bottle brand name
   * @param weight   is the Bottle weight
   * @param capacity is the Bottle capacity
   */
  public Bottle(String name, double weight, double capacity) {
    super(name, weight);
    this.capacity = capacity;
  }

  /**
   * Getter Method, to get the item type's name
   *
   * @return a string of the item type's name
   */
  @Override
  public String getSimpleName() {
    return "Bottle";
  }

  /**
   * to return a string that contains the item type's name (Bottle), the brand name, the weight of
   * the item, and additional information, such as Bottle functionalities
   *
   * @return a string
   */
  @Override
  public String toString() {
    return this.getSimpleName() + " (" + super.getName() + ") " + " has weight of "
        + super.getWeight() + " - to drink with " + this.capacity + " litre left.";
  }

}
