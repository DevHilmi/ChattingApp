package rizaldev.chattingapp.data;

/**
 * Created by devel on 11/02/2018.
 */

public class User {
    private String name;
    private String token;
    private boolean login;


    public User(String name, String token, boolean login) {
        this.name = name;
        this.token = token;
        this.login = login;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
}
