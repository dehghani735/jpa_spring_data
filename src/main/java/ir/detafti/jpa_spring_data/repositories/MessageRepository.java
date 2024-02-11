package ir.detafti.jpa_spring_data.repositories;

import ir.detafti.jpa_spring_data.entities.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
