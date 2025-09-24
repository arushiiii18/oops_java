public class Test9 {
    public static void main(String[] args) {
        int bookCount = 0;
        int totalPrice = 100;

        if (bookCount == 0) {
            throw new ArithmeticException("Cannot divide total price by zero books.");
        }

        int pricePerBook = totalPrice / bookCount;
        System.out.println("Each book costs: " + pricePerBook);
    }
}
