package com.willfrog.frogfocusbackend.controllers;

import com.willfrog.frogfocusbackend.repositories.TaskRepository;
import com.willfrog.frogfocusbackend.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @PostMapping("/newTask")
    public @ResponseBody String addNewTask(@RequestParam String taskName){

        Task newTask = new Task(taskName);

        taskRepository.save(newTask);

        return "Create new Task successfully.";
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/allTasks")
    public @ResponseBody Iterable<Task> getAllTasks(){
        return taskRepository.findAll();
    }
}
