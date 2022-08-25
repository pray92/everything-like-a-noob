package dev.everyhinglikeanoob.personalblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.everyhinglikeanoob.personalblog.repository.MessageRepository;
import dev.everyhinglikeanoob.personalblog.service.MessageService;

@Configuration
public class SpringConfig {
    private final MessageRepository messageRepository;

    @Autowired
    public SpringConfig(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Bean
    public MessageService messageService() {
        return new MessageService(this.messageRepository);
    }
}
