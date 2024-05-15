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
            var todo = model[i];
            var number = i + 1;

            if(todo != null) {
                System.out.println(number + ". " + todo);
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
