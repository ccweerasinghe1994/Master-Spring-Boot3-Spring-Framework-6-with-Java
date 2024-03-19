package com.wchamara.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "/todos")
    public String getAllTodos(ModelMap model) {

        List<Todo> todos = todoService.retrieveTodos();

        model.put("todos", todos);
        return "todoList";
    }
}
