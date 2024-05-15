package OOP.TodoList.Test.service;

import OOP.TodoList.Entity.TodoList;
import OOP.TodoList.Repository.TodoListRepository;
import OOP.TodoList.Repository.TodoListRepositoryImpl;
import OOP.TodoList.Service.TodoListService;
import OOP.TodoList.Service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testAddTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new TodoList("Belajar Java Basic");
        todoListRepository.data[1] = new TodoList("Belajar Java Intermediate");
        todoListRepository.data[2] = new TodoList("Belajar Java Advance");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Basic");
        todoListService.addTodoList("Belajar Java Intermediate");
        todoListService.addTodoList("Belajar Java Advance");

        todoListService.showTodoList();
    }
}
