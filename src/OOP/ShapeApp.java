package OOP;

public class ShapeApp {
    public static void main(String[] args) {
        var kotak = new Shape();
        System.out.println(kotak.getCorner());

        var persegi = new Rectangle();
        System.out.println(persegi.getCorner());
        System.out.println(persegi.getParentCorner());
    }
}