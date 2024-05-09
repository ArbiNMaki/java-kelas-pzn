public class TernaryOperator {
    public static void main(String[] args) {
        // Tanpa Ternary Operator
        var nilai = 75;
        String result;

        if(nilai >= 70) {
            result = "Anda lulus.";
        } else {
            result = "Anda tidak lulus";
        }
        System.out.println(result);

        // Ternary Operator
        String ucapan = nilai >= 70 ? "Anda lulus." : "Anda tidak lulus.";
        System.out.println(ucapan);
    }
}
