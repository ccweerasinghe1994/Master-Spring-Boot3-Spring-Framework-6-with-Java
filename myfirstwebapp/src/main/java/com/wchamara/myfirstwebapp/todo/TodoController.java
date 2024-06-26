package com.wchamara.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
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

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showTodo(ModelMap model) {
        String username = (String) model.get("name");
        model.put("todo", new Todo(0, username, "", LocalDate.now().plusYears(1), false));
        return "todo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result) {

        if (result.hasErrors()) {
            return "todo";
        }

        String name = (String) model.get("name");
        todoService.addTodo(name, todo.getDescription(), todo.getTargetDate(), false);
        return "redirect:/todos";
    }


    @RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
    public String addTodo(@RequestParam int id) {
        todoService.deleteTodo(id);
        return "redirect:/todos";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.GET)
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        Todo todo = todoService.retrieveById(id);
        model.addAttribute("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "/update-todo", method = RequestMethod.POST)
    public String showUpdateTodoPage(ModelMap model, @Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "todo";
        }
        todoService.updateTodo(todo);
        return "redirect:/todos";
    }
}
