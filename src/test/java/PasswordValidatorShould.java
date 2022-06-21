import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

  @ParameterizedTest
  @ValueSource(strings = {
      "a_4deFg",
      "jklm6P_"
  })
  void detect_invalid_password_due_to_less_than_eight_characters(String password){
    assertFalse(PasswordValidator.validate(password));
  }

  @Test
  void detect_invalid_password_due_to_missing_capital_letter() {
    assertFalse(PasswordValidator.validate(("a_4defghi")));
  }

  @Test
  void detect_invalid_password_due_to_missing_lower_case_letter(){
    assertFalse(PasswordValidator.validate(("A_4DEFGHI")));
  }

  @Test
  void detect_invalid_password_due_to_missing_number() {
    assertFalse(PasswordValidator.validate("a_cdeFghi"));
  }
  @Test
  void detect_invalid_password_due_to_missing_underscore() {
    assertFalse(PasswordValidator.validate("ab4deFghi"));
  }
}
