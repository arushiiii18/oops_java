
// Custom exception for age too young (Checked)
class TooYoungException extends Exception {
    public TooYoungException(String message) {
        super(message);
    }
}

// Custom exception for age too old (Checked)
class TooOldException extends Exception {
    public TooOldException(String message) {
        super(message);
    }
}

// Main class for bootcamp enrollment
public class BootCampEnrollment2 {

    // Must declare throws since these are CHECKED exceptions
    public static void enroll(String name, int age) throws TooYoungException, TooOldException {
        if (age < 15) {
            throw new TooYoungException("Sorry " + name + ", you're too young to join the bootcamp.");
        } else if (age > 50) {
            throw new TooOldException("Sorry " + name + ", you're too old to join the bootcamp.");
        } else {
            System.out.println("Welcome " + name + "! You have successfully enrolled in the bootcamp.");
        }
    }

    // Instead of try-catch → declare throws in main
    public static void main(String[] args) throws TooYoungException, TooOldException {
        String[] names = {"Alice", "Bob", "Charlie"};
        int[] ages = {12, 25, 55};

        for (int i = 0; i < names.length; i++) {
            enroll(names[i], ages[i]); // compiler allows, because main declares throws
        }
    }
}
