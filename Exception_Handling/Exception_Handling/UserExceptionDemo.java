// Step 1: User-defined exception class
class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);  // pass message to Exception class
    }
}

// Step 2: Library class using the custom exception
public class UserExceptionDemo {

    String[] availableBooks = { "Java Basics", "Data Structures", "OOP Concepts" };

    public void findBook(String bookName) throws BookNotFoundException {
        boolean found = false;

        for (int i = 0; i < availableBooks.length; i++) {
            if (availableBooks[i].equalsIgnoreCase(bookName)) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new BookNotFoundException("Book '" + bookName + "' not found in library.");
        }

        System.out.println("Book '" + bookName + "' is available.");
    }

    // Step 3: Main method
    public static void main(String[] args) {
        UserExceptionDemo library = new UserExceptionDemo();

        try {
            library.findBook("Operating Systems");  // not in list
        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Library system continues running...");
    }
}
