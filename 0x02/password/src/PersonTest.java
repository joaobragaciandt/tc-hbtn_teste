import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PersonTest {

    static Person person;

    @BeforeAll
    public static void setup() {
        person = new Person();
    }

    @ParameterizedTest
    @ValueSource(strings = { "PaulMcCartney2", "NeilArms2" })
    public void check_user_valid(String string) {
        person.setUser(string);
        Assertions.assertTrue(person.checkUser());
    }

    @ParameterizedTest
    @ValueSource(strings = { "Paul#McCartney", "Neil@Arms" })
    public void check_user_not_valid(String string) {
        person.setUser(string);
        Assertions.assertFalse(person.checkUser());
    }

    @ParameterizedTest
    @ValueSource(strings = { "Abcabcdefgh@", "#hbtn@%tc" })
    public void does_not_have_numbers(String string) {
        person.setPassword(string);
        Assertions.assertFalse(person.checkPassword());
    }

    @ParameterizedTest
    @ValueSource(strings = { "Abc@123", "12$@hbt" })
    public void does_not_have_eight_chars(String string) {
        person.setPassword(string);
        Assertions.assertFalse(person.checkPassword());
    }

    @ParameterizedTest
    @ValueSource(strings = { "abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123" })
    public void check_password_valid(String string) {
        person.setUser(string);
        Assertions.assertTrue(person.checkPassword());
    }
}
