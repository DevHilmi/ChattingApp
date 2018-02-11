package rizaldev.chattingapp.data.source;

import io.reactivex.Observable;
import rizaldev.chattingapp.data.User;

/**
 * Created by devel on 11/02/2018.
 */

public interface UserDataSource {

    Observable<User> getLogin();

    Observable<User> getRegister();

    boolean login(String username, String password);

    boolean register(String username,String name,String email,String password);
}
