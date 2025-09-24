public class ThrowDemo {

    public void issueBook(String bookName) {
        if (bookName == null || bookName.isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be null or empty.");
        }

        System.out.println("Book '" + bookName + "' has been issued.");
    }

    public static void main(String[] args) {
        ThrowDemo library = new ThrowDemo();

        try {
            library.issueBook(""); // Simulate invalid book name
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("End of program.");
    }
}
