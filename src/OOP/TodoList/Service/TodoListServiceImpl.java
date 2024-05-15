package OOP.TodoList.Service;

import OOP.TodoList.Entity.TodoList;
import OOP.TodoList.Repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {
    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        TodoList[] model = todoListRepository.getAll();

        System.out.println("===== TODO LIST =====");

        for(var i = 0; i < model.length; i++) {
            var todoList = model[i];
            var number = i + 1;

            if(todoList != null) {
                System.out.println(number + ". " + todoList.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {

    }

    @Override
    public void removeTodoList(Integer number) {

    }
}
