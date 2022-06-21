import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PasswordValidatorShould {
  @Test
  void detect_valid_password() {
    /**
     * Valid password complies with the following rules:
     * Have more than 8 characters
     * Contains a capital letter
     * Contains a lowercase
     * Contains a number
     * Contains an underscore
     */
    assertTrue(PasswordValidator.validate("a_4deFghi"));
  }
}
