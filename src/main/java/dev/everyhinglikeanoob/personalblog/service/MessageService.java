package dev.everyhinglikeanoob.personalblog.service;

import dev.everyhinglikeanoob.personalblog.repository.MessageRepository;

public class MessageService {
    private final MessageRepository messageRepository;
    
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
}
