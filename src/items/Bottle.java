package items;

import actions.Action;
import actions.DrinkAction;
import campobjects.Camper;
import capabilities.Drinkable;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Bottle class</h1>
 * This Bottle class is used to represent a Bottle item type
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Bottle extends Item implements Drinkable {

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

  public void decreaseCapacity(double capacity){
    this.capacity -= capacity;
  }

  public void increaseCapacity(double capacity){
    this.capacity += capacity;
  }

  public double getCapacity() {
    return this.capacity;
  }

  /**
   * @param camper is the camper object
   * @return a string
   */
  @Override
  public String drunkBy(Camper camper) {
    int INCREASE_HYDRATION_VALUE = 2;
    double DECREASE_BOTTLE_CAPACITY = 0.15;
    if(this.getCapacity()>=0.15) {
      camper.increaseHydrationLevel(INCREASE_HYDRATION_VALUE);
      this.decreaseCapacity(DECREASE_BOTTLE_CAPACITY);
      return super.getName() + " is drunk by " + camper + ", it increase hydration level by "
          + INCREASE_HYDRATION_VALUE + " and decrease the bottle capacity by" + this.getCapacity();
    }
    return super.getName() + " cannot drink from the bottle, because this bottle is empty";
  }

  @Override
  public List<Action> allowableActions(Camper camper) {
    List<Action> actions = new ArrayList<Action>();
    if(this.getCapacity()>=0.15) {
      actions.add(new DrinkAction(this));
      return actions;
    }
    return null;
  }
}
