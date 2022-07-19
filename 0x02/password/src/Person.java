import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    private String user;
    private String password;


    public Person() {
    }

    public boolean checkUser() {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(user);
        if(user.length() >= 8 && !matcher.find()) {
            return true;
        }
        return false;
    }

    public boolean checkPassword() {
        Pattern uppercase = Pattern.compile("[A-Z]");
        Pattern hasNumber = Pattern.compile("[0-9]");
        Pattern specialCharacters = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcherUppercase = uppercase.matcher(user);
        Matcher matcherHasNumber = hasNumber.matcher(user);
        Matcher matcherSpecialCharacters = specialCharacters.matcher(user);

        if(user.length() >= 8 && matcherUppercase.find() && matcherHasNumber.find() && matcherSpecialCharacters.find()) {
            return true;
        }
        return false;
    }


    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
