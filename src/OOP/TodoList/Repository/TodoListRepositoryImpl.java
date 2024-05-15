package OOP.TodoList.Repository;

import OOP.TodoList.Entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {

    private TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    @Override
    public void add(TodoList todolist) {

    }

    @Override
    public void remove(Integer number) {

    }
}
