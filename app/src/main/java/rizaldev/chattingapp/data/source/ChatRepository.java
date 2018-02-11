package rizaldev.chattingapp.data.source;

import java.util.List;

import io.reactivex.Observable;
import rizaldev.chattingapp.data.Chat;

/**
 * Created by devel on 11/02/2018.
 */

public class ChatRepository implements ChatDataSource {
    @Override
    public Observable<List<Chat>> getAllChatObserveable() {
        return null;
    }

    @Override
    public List<Chat> getAllChat() {
        return null;
    }


}
