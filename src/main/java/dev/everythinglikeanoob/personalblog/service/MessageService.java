package dev.everythinglikeanoob.personalblog.service;

import dev.everythinglikeanoob.personalblog.repository.MessageRepository;

public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
}
