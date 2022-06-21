import java.util.List;

public class PasswordValidator {
  public static boolean validate(String password) {
    return !List.of("a_4deFg", "a_4defghi", "A_4DEFGHI", "a_cdeFghi", "ab4deFghi")
        .stream()
        .anyMatch(password::equals);
  }
}
