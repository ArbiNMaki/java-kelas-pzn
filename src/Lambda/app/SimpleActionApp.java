package Lambda.app;

import Lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        // Anonymous Class
        System.out.println("===== Anonymous Class =====");
        SimpleAction simpleAct = new SimpleAction() {
            @Override
            public String action() {
                return "Arbi";
            }
        };
        System.out.println(simpleAct.action());

        // Lambda
        System.out.println("==== Lambda =====");
        SimpleAction simpleAction = () -> {
            return "Arbi";
        };
        System.out.println(simpleAction.action());
    }
}
