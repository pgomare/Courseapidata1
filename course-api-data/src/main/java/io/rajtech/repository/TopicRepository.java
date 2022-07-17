package io.rajtech.repository;

import org.springframework.data.repository.CrudRepository;

import io.rajtech.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, Long> {

}
