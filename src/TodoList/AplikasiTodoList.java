package TodoList;

public class AplikasiTodoList {
    public static String[] model = new String[10];

    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
        testRemoveTodoList();
    }

    // Business Logic
    public static void showTodoList() {
        for(var i = 0; i < model.length; i++) {
            var todo = model[i];
            var number = i + 1;

            if(todo != null) {
                System.out.println(number + ". " + todo);
            }
        }
    }

    public static void addTodoList(String todo) {
        // Cek apakah model isFull ?
        var isFull = true;
        for(int i = 0; i < model.length; i++) {
            if(model[i] == null) {
                // Model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // Jika isFull, kita resize ukuran array 2x lipat
        if(isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for(int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // Tambahkan ke posisi yang data array nya NULL
        for(var i = 0; i < model.length; i++) {
            if(model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static boolean removeTodoList(Integer number) {
        if((number - 1) >= model.length) {
            return false;
        } else if(model[number - 1] == null) {
            return false;
        } else {
            for(int i = ( number - 1); i < model.length; i++) {
                if(i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }


    // View
    public static void viewShowTodoList() {

    }

    public static void viewAddTodoList() {

    }

    public static void viewRemoveTodoList() {

    }


    // Test Show todo list
    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar: Aplikasi TodoList";
        showTodoList();
    }

    // Test Add todo list
    public static void testAddTodoList() {
        for(int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo ke-" + i);
        }

        showTodoList();
    }

    // Test Remove todo list
    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }
}
