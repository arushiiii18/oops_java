public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};

            // This will cause ArithmeticException
         //   int result = numbers[1] / 0;

            // This line will not execute because exception occurs above
            System.out.println("Number at index 5: " + numbers[5]);  

        } 
        catch (ArithmeticException e) {
            System.out.println("❌ Arithmetic Error: Division by zero is not allowed.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("❌ Array Error: Index out of range.");
        } 
        catch (Exception e) {   // Generic catch (always keep it last!)
            System.out.println("❌ Some other error occurred: " + e);
        }

        System.out.println("✅ Program continues after handling exception...");
    }
}

