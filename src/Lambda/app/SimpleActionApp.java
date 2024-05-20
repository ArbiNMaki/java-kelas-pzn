package Lambda.app;

import Lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        // Anonymous Class
//        System.out.println("===== Anonymous Class =====");
//        SimpleAction simpleAct = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Arbi";
//            }
//        };
//        System.out.println(simpleAct.action("Arbi"));
//
//        // Lambda
//        System.out.println("==== Lambda =====");
//        SimpleAction simpleAction = (String name) -> {
//            return "Arbi";
//        };
//        System.out.println(simpleAction.action("Arbi"));

        // With Tipe Data
        SimpleAction simpleAct = (String name) -> {
            return "Hello " + name;
        };
        System.out.println("=== WITH TIPE DATA ===");
        System.out.println(simpleAct.action("Arbi"));

        // Without Tipe Data
        SimpleAction simpleAction = (name) -> {
            return "Hai " + name;
        };
        System.out.println("=== WITHOUT TIPE DATA ===");
        System.out.println(simpleAction.action("Arbi"));

        // Lambda Without Block
        SimpleAction block1 = (String name) -> "Hello " + name;
        SimpleAction block2 = (name) -> "Hai " + name;
        SimpleAction block3 = name -> "Hi " + name;
        System.out.println("=== LAMBDA WITHOUT BLOCK ===");
        System.out.println(block1.action("Arbi"));
        System.out.println(block2.action("Arbi"));
        System.out.println(block3.action("Arbi"));
    }
}
