package dev.everythinglikeanoob.personalblog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.everythinglikeanoob.personalblog.domain.Message;

public interface MessageRepository extends MongoRepository<Message, String> {
    
}
