public class FinallyDemo1 {
    public void displayBookDetails() {
        String[] books = new String[3];
        books[0] = "Java Basics";
        books[1] = null;  // Simulating a missing book entry
        books[2] = "Data Structures";

        try {
            System.out.println("Displaying book details:");
            for (int i = 0; i < books.length; i++) {
                // Simulate accessing book title length
                System.out.println("Book " + (i + 1) + ": " + books[i].toUpperCase());
            }
        } catch (NullPointerException e) {
            System.out.println("A book entry is missing: " + e.getMessage());
        } finally {
            System.out.println("Finished displaying book details (finally block executed).");
        }
    }

    public static void main(String[] args) {
        FinallyDemo1 library = new FinallyDemo1();
        library.displayBookDetails();
    }
}

