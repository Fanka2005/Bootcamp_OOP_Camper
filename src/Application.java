import campobjects.Campsite;

/**
 * <h1>Application class</h1>
 * The class Application is used to run the campsite simulation.
 *
 * @author Fauzanda Lathifanka Sunarko
 */
public class Application {

  public static void main(String[] args) {
    Campsite campsite = new Campsite();

    boolean status = true;
    do {
      status = campsite.simulate();
    } while (status);
    System.out.println("Game Ends as Camper is not conscious");
  }
}