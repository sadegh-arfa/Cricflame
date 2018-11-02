package com.cricflame.cricflame.Chat.global.database;

import com.cricflame.cricflame.Chat.global.data_model.Chat;
import com.cricflame.cricflame.Chat.global.data_model.Message;

import rx.Observable;

/**
 * Created by marco on 08/08/16.
 */

public interface GlobalDatabase {

    Observable<Chat> observeOldMessages(String key);

    Observable<Message> observeNewMessages(String key);

    Observable<Chat> observeChat();

    void sendMessage(Message message);

}

