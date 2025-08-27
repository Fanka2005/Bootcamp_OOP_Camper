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

    int i = 0;
    do {
      campsite.simulate();
      i += 1;
    } while (i < 6);
  }
}