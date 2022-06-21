import static org.junit.jupiter.api.Assertions.assertFalse;
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

  @Test
  void detect_invalid_password_due_to_less_than_eight_characters(){
    assertFalse(PasswordValidator.validate(("a_4deFg")));
  }

  @Test
  void detect_invalid_password_due_to_missing_capital_letter() {
    assertFalse(PasswordValidator.validate(("a_4defghi")));
  }
}
