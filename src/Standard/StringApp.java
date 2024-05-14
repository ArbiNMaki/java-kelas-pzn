package Standard;

public class StringApp {
    public static void main(String[] args) {
        String name = "Arbi Dwi Wijaya";
        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(name);
        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Arbi"));
        System.out.println(name.startsWith("Dwi"));
        System.out.println(name.endsWith("Wijaya"));

        String[] names = name.split(" ");
        for(var value : names) {
            System.out.println(value);
        }

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
    }
}
