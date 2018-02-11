package rizaldev.chattingapp.data.source;

import java.util.List;

import io.reactivex.Observable;
import rizaldev.chattingapp.data.Chat;

/**
 * Created by devel on 11/02/2018.
 */

public interface ChatDataSource {

   Observable<List<Chat>> getAllChatObserveable();

    List<Chat> getAllChat();
}
