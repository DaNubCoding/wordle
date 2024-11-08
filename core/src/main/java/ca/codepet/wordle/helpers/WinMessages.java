package ca.codepet.wordle.helpers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WinMessages {
  public static final Map<Integer, List<String>> WIN_MESSAGES = new HashMap<>() {
    {
      put(1, List.of(
          "Genius!",
          "Incredible!"));

      put(2, List.of(
          "Impressive!",
          "Amazing!",
          "Wow!"));

      put(3, List.of(
          "Great job!",
          "Nice!",
          "Easy peasy"));

      put(4, List.of(
          "Well done!",
          "Nice!"));

      put(5, List.of(
          "Well done!",
          "Nice!"));

      put(6, List.of(
          "Just in time!",
          "Phew!"

      ));
    }
  };

  public static String getMessage(int attempts) {
    List<String> messages = WIN_MESSAGES.get(attempts);
    // Display a random message from the list (example approach)
    String message = messages.get((int) (Math.random() * messages.size()));
    return message;
  }
}
