package OOP.TodoList.Repository;

import OOP.TodoList.Entity.TodoList;

public interface TodoListRepository {
    TodoList[] getAll();

    void add(TodoList todolist);

    boolean remove(Integer number);
}
