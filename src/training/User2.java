/*
Homework  II.2 Classes and objects

Parameterized constructor
 */


package training;


public class User2 {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User2(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User2{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
