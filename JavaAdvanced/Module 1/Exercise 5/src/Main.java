public class Main {
    public static void main(String[] args) {
        Integer numerator = 10, denominator = 5;
        try {
            System.out.println(methodForStuff(numerator, denominator));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Integer methodForStuff(Integer numerator, Integer denominator) {
        if (denominator == null && numerator == null) {
            throw new ArithmeticException("Values are null");
        }
        return numerator / denominator;
    }
}
