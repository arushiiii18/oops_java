public class ThrowsDemo {

    // Method 1: Validates input
    public void validateBookName(String bookName) throws IllegalArgumentException {
        if (bookName == null || bookName.trim().isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be null or empty.");
        }
    }

    // Method 2: Calls validate method and performs issuing
    public void processIssue(String bookName) throws IllegalArgumentException {
        validateBookName(bookName);  // This method might throw
        System.out.println("Book '" + bookName + "' has been successfully issued.");
    }

    // Main method handles the exception
    public static void main(String[] args) {
        ThrowsDemo library = new ThrowsDemo();

        try {
            library.processIssue("");  // Invalid input
        } catch (IllegalArgumentException e) {
            System.out.println("Error while issuing book: " + e.getMessage());
        }

        System.out.println("Library system continues running...");
    }
}
