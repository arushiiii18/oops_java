public class FinallyDemo2 {
    public void processBooks() {
        try {
            System.out.println("Start processing books.");

            // This will cause a NullPointerException
            String book = null;
            System.out.println(book.length());

        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }

        System.out.println("End of processBooks method.");
    }

    public static void main(String[] args) {
        FinallyDemo2 library = new FinallyDemo2();
        library.processBooks();
    }
}
