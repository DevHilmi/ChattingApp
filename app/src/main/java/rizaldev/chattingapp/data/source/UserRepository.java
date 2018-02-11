package rizaldev.chattingapp.data.source;

import io.reactivex.Observable;
import rizaldev.chattingapp.data.User;

/**
 * Created by devel on 11/02/2018.
 */

public class UserRepository implements UserDataSource{
    @Override
    public Observable<User> getLogin() {
        return null;
    }

    @Override
    public Observable<User> getRegister() {
        return null;
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean register(String username, String name, String email, String password) {
        return false;
    }
}
