package io.javabrains.springbootstarter.hello;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepo extends CrudRepository<Topic, String> {

}
