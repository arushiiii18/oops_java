public class LibraryMultipleCatchDemo2 {
    public static void main(String[] args) {
        try {
            String bookTitle = null;
            System.out.println("Book title length: " + bookTitle.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Book title is missing.");
        }

        try {
            int totalFine = 100;
            int lateDays = 0;
            int finePerDay = totalFine / lateDays;
            System.out.println("Fine per day: " + finePerDay);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: Cannot divide by zero.");
        }
    }
}
