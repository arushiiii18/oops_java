public class LibraryExceptionIntro {
    public static void main(String[] args) {
        try {
            int totalFine = 50;
            int lateDays = 0;

            // Division by zero will throw ArithmeticException
            int finePerDay = totalFine / lateDays;

            System.out.println("Fine per day: " + finePerDay);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
