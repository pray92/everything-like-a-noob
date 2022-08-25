package dev.everyhinglikeanoob.personalblog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dev.everyhinglikeanoob.personalblog.domain.Message;

public interface MessageRepository extends MongoRepository<Message, String> {
    
}
