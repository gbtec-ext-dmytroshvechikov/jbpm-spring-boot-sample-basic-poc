package org.jbpm.springboot.samples;

import org.jbpm.services.api.UserTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TaskController {

    @Autowired
    private UserTaskService userTaskService;

    @GetMapping("/tasks/{id}/complete")
    public void complete(@PathVariable Long id) {
        userTaskService.start(id, "john");
        userTaskService.complete(id, "john", new HashMap<>());
    }
}
