package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepo extends CrudRepository<Course, String> {
	//public List<Course> findByTopicId(String id);
}
