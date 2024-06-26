package TodoList;

public class AplikasiTodoList {
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
//        testRemoveTodoList();
//        testInput();
//        testViewShowTodoList();
//        testViewAddTodoList();
//        testViewRemoveTodoList();
        viewShowTodoList();
    }

    // Business Logic
    public static void showTodoList() {
        System.out.println("===== TODO LIST =====");
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


    // Input Data
    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }


    // View
    public static void viewShowTodoList() {
        while (true) {
            showTodoList();

            System.out.println("Menu: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if(input.equals("1")) {
                viewAddTodoList();
            } else if(input.equals("2")) {
                viewRemoveTodoList();
            } else if(input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak ditemukan!");
            }
        }
    }

    public static void viewAddTodoList() {
        System.out.println("MENAMBAH TODO LIST");

        var todo = input("Todo (x Jika batal)");

        if(todo.equals("x")) {
            // Batal
        } else {
            addTodoList(todo);
        }
    }

    public static void viewRemoveTodoList() {
        System.out.println("===== MENGHAPUS TODO LIST =====");

        var number = input("Nomor yang dihapus (x Jika batal)");

        if(number.equals("x")) {
            // Batal
        } else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success) {
                System.out.println("Gagal Hapus todolist: " + number);
            }
        }
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

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    // Test Input
    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hai, " + name);
    }

    // Test View show todo list
    public static void testViewShowTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        viewShowTodoList();
    }

    // Test View Add todo list
    public static void testViewAddTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        viewAddTodoList();

        showTodoList();
    }

    // Test View Remove todo list
    public static void testViewRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
