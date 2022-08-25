package dev.everythinglikeanoob.personalblog.service;

import java.time.ZonedDateTime;
import java.util.List;

import dev.everythinglikeanoob.personalblog.domain.Message;
import dev.everythinglikeanoob.personalblog.repository.MessageRepository;

public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public String createMessage(String msg) {
        Message message = new Message();
        ZonedDateTime now = ZonedDateTime.now();
        message.setTime(now.toString());
        message.setMessage(msg);

        messageRepository.save(message);

        return message.getId();
    }

    public String getMessage() {
        List<Message> messages =  messageRepository.findAll();
        if(messages.isEmpty()){
            return "";
        }
        return messages.get(0).toString();
    }

    public void updateMessage(String message) {
        messageRepository.deleteAll();
        createMessage(message);
    }

    public void deleteMessage() {
        messageRepository.deleteAll();
    }
}
