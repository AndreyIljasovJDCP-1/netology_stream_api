package topic2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Из списка записей, формата - "login_password", создать список юзеров.
 */
public class MapOperation {


    public static void main(String[] args) {
        List<String> strings = List.of(
                "andrusha77_qwerty123",
                "irina-vovina_4567olg",
                "jora-gubin_1qaz2wsx",
                "kostya-alpha_111222333");

        List<User> collectUsers = strings.stream()
                .map(string -> string.split("_"))
                .map(split -> new User(split[0], split[1]))
                .collect(Collectors.toList());

        collectUsers.forEach(System.out::println);
    }
}

class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
