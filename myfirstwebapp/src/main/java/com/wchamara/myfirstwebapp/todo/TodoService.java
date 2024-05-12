package com.wchamara.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static final List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "chamara", "Learn Spring MVC", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "chamara", "Learn Spring", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "chamara", "Learn to Dance", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> retrieveTodos() {
        return todos;
    }

    public void addTodo(String name, String desc, LocalDate targetDate, boolean isDone) {
        todos.add(new Todo(todos.size() + 1, name, desc, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public void updateTodo(int id, String desc, LocalDate targetDate, boolean isDone) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                todo.setDescription(desc);
                todo.setTargetDate(targetDate);
                todo.setDone(isDone);
            }
        }
    }
}
