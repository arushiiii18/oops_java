public class LibraryMultipleCatchDemo {
    public static void main(String[] args) {
        try {
            String bookTitle = null;
            int totalFine = 100;
            int lateDays = 0;

            // This will throw NullPointerException
            System.out.println("Book title length: " + bookTitle.length());

            // This will throw ArithmeticException
            int finePerDay = totalFine / lateDays;
            System.out.println("Fine per day: " + finePerDay);

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Book title is missing.");
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        } catch (Exception e) {
            // Optional: general exception catch-all
            System.out.println("Caught some other Exception: " + e.getMessage());
        }
    }
}
