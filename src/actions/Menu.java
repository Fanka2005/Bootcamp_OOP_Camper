package actions;

import campobjects.Camper;
import java.util.*;

/**
 * <h1>I/O Interaction Console</h1>
 * This class is used as interaction console
 *
 * @author Fauzanda Lathifanka Sunarko
 */

public class Menu {

  /**
   * I/O of the application which shows the status and all of the allowable actions,
   * it will then input the chosen actions
   *
   * @param camper   is the Camper object
   * @param actions is list of allowable actions from all of the objects
   * @return Action, an action
   */
  public static Action showMenu(List<Action> actions, Camper camper) {
    Scanner scanner = new Scanner(System.in);
    Character startChar = 'a';

    Map<Character, Action> keyToActionMap = new HashMap<>();

    for (Action action : actions) {
      keyToActionMap.put(startChar, action);
      System.out.println(startChar + ": " + action.menuDescription(camper));
      startChar++;

    }

    char key;
    do {
      key = scanner.next().charAt(0);
    } while (!keyToActionMap.containsKey(key));

    return keyToActionMap.get(key);
  }
}
