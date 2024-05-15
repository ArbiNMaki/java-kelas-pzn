package OOP.TodoList.Test.view;

import OOP.TodoList.Repository.TodoListRepository;
import OOP.TodoList.Repository.TodoListRepositoryImpl;
import OOP.TodoList.Service.TodoListService;
import OOP.TodoList.Service.TodoListServiceImpl;
import OOP.TodoList.View.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testShowTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Basic");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        todoListView.showTodoList();
    }

    public static void testAddTodoList() {

    }

    public static void testRemoveTodoList() {

    }
}
