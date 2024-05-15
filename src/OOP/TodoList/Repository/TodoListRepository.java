package OOP.TodoList.Repository;

import OOP.TodoList.Entity.TodoList;

public interface TodoListRepository {
    TodoList[] getAll();

    void add(TodoList todolist);

    void remove(Integer number);
}
