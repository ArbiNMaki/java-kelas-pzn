package Generic.application;

import Generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("Arbi"));

        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
