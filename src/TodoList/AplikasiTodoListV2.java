package TodoList;

import OOP.TodoList.Repository.TodoListRepository;
import OOP.TodoList.Repository.TodoListRepositoryImpl;
import OOP.TodoList.Service.TodoListService;
import OOP.TodoList.Service.TodoListServiceImpl;
import OOP.TodoList.View.TodoListView;

public class AplikasiTodoListV2 {
    public static void main(String[] args) {
        // Logic untuk Data
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();

        // Logic untuk Business
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        // Logic untuk View/UI
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
