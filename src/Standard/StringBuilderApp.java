package Standard;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Arbi");
        builder.append(" ");
        builder.append("Dwi");
        builder.append(" ");
        builder.append("Wijaya");

        String fullName = builder.toString();

        System.out.println(fullName);
    }
}
