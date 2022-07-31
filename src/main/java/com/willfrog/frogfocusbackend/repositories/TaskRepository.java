package com.willfrog.frogfocusbackend.repositories;

import org.springframework.data.repository.CrudRepository;

import com.willfrog.frogfocusbackend.task.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
